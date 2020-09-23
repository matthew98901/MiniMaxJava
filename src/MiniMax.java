
public class MiniMax {
	// Builds a binary tree then performs a min max algorithm on it.
	Tree tree;
	
	public void BuildTree(int depth, int[] leafValues) {
		boolean isMaxNode = true;
		
		Node rootNode = new Node(true);
		
		for (int i = 0; i < depth; i++) {
			isMaxNode = !isMaxNode;
			
			for (int t = 0; t<(2^(depth-1)); t++) {
				Node childOne = new Node(isMaxNode);
				Node childTwo = new Node(isMaxNode);
				
				System.out.print(t);
				
				rootNode.setChildren(childOne, childTwo);
			}
		}
		
		tree = new Tree(rootNode);
	}

}