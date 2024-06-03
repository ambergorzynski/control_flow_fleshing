import unittest
from fuzzflesh.graph_generator.generate import generate_graph_approach_presets

class TestGraphGeneration(unittest.TestCase):

    def test_preset(self):
        try:
            generate_graph_approach_presets(1)
        except:
            self.fail("graphGen raised exception unexpectedly!")

if __name__=='__main__':
    unittest.main()
