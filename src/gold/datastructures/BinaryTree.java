package gold.datastructures;

import java.util.Random;

public class BinaryTree {
	Leaf root;

	public static void main(String args[]) {
		BinaryTree bt = new BinaryTree();
	}

	public BinaryTree() {
		Random rand = new Random();
		for (int i = 0; i < 1000000; i++) {
			for (int j = 0; j < 10; j++) {
				root = insert(rand.nextInt(1000000000), root);
			}
		}
		printTree(root);

	}

	public Leaf insert(int v, Leaf l) {
		if (l == null) {
			l = new Leaf(v);
		} else {
			if (v < l.getValue()) {
				l.setLeft(insert(v, l.getLeft()));
			} else {
				l.setRight(insert(v, l.getRight()));
			}
		}

		return l;
	}

	public void printTree(Leaf l) {
		if (l != null) {

			printTree(l.getRight());
			System.out.println(l.getValue());
			printTree(l.getLeft());
		}
	}
}
