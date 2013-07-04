
public class BinaryTree {
	
	TreeNode root;
	public BinaryTree() {
		
	}
	
	public void add(int value) { 
		if (root == null) {
			root = new TreeNode(value);
		} else {
			boolean finished = false;
			TreeNode currentNode = root;
			while (!finished) {
				if (value < currentNode.value) {
					if (currentNode.left != null) 
						currentNode = currentNode.left;
					else {
						currentNode.left = new TreeNode(value);
						finished = true;
					}
				} else {
					if (currentNode.right != null)
						currentNode = currentNode.right;	
					else {
						currentNode.right = new TreeNode(value);
						finished = true;
					}
				}
			}
		}
	}
	
	public boolean contains(int value) {
		TreeNode current = root;
		boolean finished = false;
		
		while (!finished) {
			if (value == current.value) {
				finished = true;
			}
			else if (value < current.value) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		
		return finished;
	}
	
	public void print() {
		printTree(root,2);
		
	}
	
	public void printTree(TreeNode node, int indent) {
		if (node != null) {
		
			for (int i = 0; i < indent; i++) {
				System.out.print(" ");
			}
			System.out.println(node.value);
			printTree(node.left, indent - 2);
			printTree(node.right, indent + 2);
		}
	}
}