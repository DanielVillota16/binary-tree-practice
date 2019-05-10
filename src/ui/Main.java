package ui;

import model.Node;
import model.Tree;

public class Main {

	public static void main(String[] args) {
		Node n = new Node(8);
		Tree t = new Tree(n);
		/*t.addNode(4);
		t.addNode(2);
		t.addNode(6);
		t.addNode(1);
		t.addNode(3);
		t.addNode(5);
		t.addNode(7);
		t.addNode(12);
		t.addNode(10);
		t.addNode(14);
		t.addNode(9);
		t.addNode(11);
		t.addNode(13);
		t.addNode(15);*/
		t.addNode(1);
		t.addNode(2);
		t.addNode(9);
		t.addNode(5);
		t.addNode(0);
		t.addNode(7);
		t.addNode(9);
		System.out.println(t.traverse());
		System.out.println(t);
	}

}
