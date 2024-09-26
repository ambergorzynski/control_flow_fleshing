import functools

from typing import List


def get_mutation_ids_for_mutation_group(mutation_group):
    if "replaceExpr" in mutation_group:
        return [instance["mutationId"] for instance in mutation_group["replaceExpr"]["instances"]]
    if "replaceBinaryOperator" in mutation_group:
        return [instance["mutationId"] for instance in mutation_group["replaceBinaryOperator"]["instances"]]
    if "replaceUnaryOperator" in mutation_group:
        return [instance["mutationId"] for instance in mutation_group["replaceUnaryOperator"]["instances"]]
    assert "removeStmt" in mutation_group
    return [mutation_group["removeStmt"]["mutationId"]]


def get_mutation_ids_for_json_node(node):
    assert "mutationGroups" in node
    return functools.reduce(lambda x, y: x + y, map(get_mutation_ids_for_mutation_group, node["mutationGroups"]), [])


class MutationTreeNode:
    def __init__(self, mutation_ids, children):
        self.children = children
        self.mutation_ids = mutation_ids


class MutationTree:
    def __init__(self, json_data):

        def populate(json_node, node_id):
            children = []
            for child_json_node in json_node["children"]:
                child_node_id = self.num_nodes
                children.append(child_node_id)
                self.parent_map[child_node_id] = node_id
                self.num_nodes += 1
                populate(child_json_node, child_node_id)
            self.nodes[node_id] = MutationTreeNode(get_mutation_ids_for_json_node(json_node), children)
            temp: int = functools.reduce(max, self.nodes[node_id].mutation_ids, 0)
            self.num_mutations = max(self.num_mutations, temp)
            for mutation_id in self.nodes[node_id].mutation_ids:
                self.mutation_id_to_node_id[mutation_id] = node_id

        self.nodes = {}
        self.parent_map = {}
        self.mutation_id_to_node_id = {}
        self.num_mutations = 0
        self.num_nodes = 0

        for root_json_node in [file["mutationTreeRoot"] for file in json_data["infoForFiles"]]:
            root_node_id = self.num_nodes
            self.num_nodes += 1
            populate(root_json_node, root_node_id)

    def get_mutation_ids_for_subtree(self, node_id) -> List[int]:
        assert 0 <= node_id < self.num_nodes
        return self.nodes[node_id].mutation_ids + functools.reduce(lambda x, y: x + y,
                                                                   map(lambda x: self.get_mutation_ids_for_subtree(x),
                                                                       self.nodes[node_id].children), [])

    def get_incompatible_mutation_ids(self, mutation_id) -> List[int]:
        assert 0 <= mutation_id < self.num_mutations
        node_id = self.mutation_id_to_node_id[mutation_id]
        result = self.get_mutation_ids_for_subtree(node_id)
        while node_id in self.parent_map:
            node_id = self.parent_map[node_id]
            result += self.nodes[node_id].mutation_ids
        return result
