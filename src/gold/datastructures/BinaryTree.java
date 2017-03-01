package gold.datastructures;

import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;

import gold.visualizer.TreeVisualizer;

public class BinaryTree {
	Leaf root;

	public static void main(String args[]) {
		BinaryTree bt = new BinaryTree();
	}
	
	private int iterations = 0;

	public BinaryTree() {
//		Random rand = new Random();
//		for (int i = 0; i < 100; i++) {
//			root = insert(rand.nextInt(1000000), root);
//		}
		//printTree(root);
		
		root = insert(5, root);
		root = insert(7, root);
		root = insert(2, root);
		root = insert(10, root);
		
		JFrame frame = new JFrame("");
		TreeVisualizer tv = new TreeVisualizer(root);
		tv.setBackground(new java.awt.Color(255, 255, 255));
		tv.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		
		frame.setContentPane(tv);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
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
	
	public int getIterations(){
		return iterations;
	}
	
	public void search(int v){
		Leaf current = root;
		int height = 0;
		boolean found = false;
		while(current!=null){
			if(current.getValue() == v){
				System.out.println("Found: " + v + " --at: " + height);
				found = true;
				break;
			}else{
				if(v >= current.getValue()){
					current = current.getRight();
				}else{
					current = current.getLeft();
				}
			}
			height++;
		}
		
		if(!found){
			System.out.println("" + v + " is not found -- steps taken: " + height);
		}
	}

	public void printTree(Leaf l) {
		if (l != null) {
			iterations++;
			printTree(l.getRight());
			System.out.println(l.getValue());
			printTree(l.getLeft());
		}
	}
}
