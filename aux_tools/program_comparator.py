from difflib import Differ

def main():
	file1 = "test1.txt"
	file2 = "test2.txt"

	with open(file1) as f1, open(file2) as f2:
		differ = Differ()

		for line in differ.compare(f1.readlines(), f2.readlines()):
			if line[0] != ' ':
				print(line)


if __name__ == "__main__":
	main()
