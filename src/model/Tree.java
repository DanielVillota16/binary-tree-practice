package model;

public class Tree {

	private Node root;
	
	public Tree(Node root) {
		this.root = root;
	}
	
	public void addNode(int value) {
		Node n = new Node(value);
		add(n, root);
	}
	
	public void add(Node n, Node current) {
		if(root==null) {
			root = n;
		} else {
			if(n.getValue() <= current.getValue()) {
				if(current.getLeft() == null) {
					current.setLeft(n);
				} else {
					add(n, current.getLeft());
				}
			} else {
				if(current.getRight() == null) {
					current.setRight(n);
				} else {
					add(n, current.getRight());
				}
			}
		}
	}
	
	public String traverse(Node current) {
		String s = "";
		if(current != null) {
			if(current.getLeft() != null) {
				s += traverse(current.getLeft());
			} else {
				return current.getValue() + " " + traverse(current.getRight());
			}
			s += current.getValue() + " ";
			if(current.getRight() != null) {
				s += traverse(current.getRight());
			} else {
				return traverse(current.getLeft()) + current.getValue();
			}
		}
		return s;
	}
	
	public String toString() {
		return printNodes(root);
	}
	
	public String printNodes(Node current) {
		String s = "";
		if(current != null) {
			s += "Node: " + current + " Left: " + current.getLeft() 
					+ " Right: " + current.getRight() + "\n~~~~~~~~~~~~~~~~~~~~~~~~\n";
			s += printNodes(current.getLeft());
			s += printNodes(current.getRight());
		}
		return s;
	}
	
	public String traverse() {
		return traverse(root);
	}
	
	public Node getRoot() {
		return root;
	}
	
}

