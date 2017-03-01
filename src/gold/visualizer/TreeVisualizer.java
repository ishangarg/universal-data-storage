package gold.visualizer;

import java.awt.Graphics;

import gold.datastructures.Leaf;

public class TreeVisualizer extends Visualizer {
	
	Leaf treeRoot;
	
	public TreeVisualizer(Leaf root){
		this.treeRoot = root;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawOval((getWidth()/2) - 20, (getHeight()/2) - 30 , 50, 50);
		g.drawString("" + treeRoot.getValue(), 250, 250);
	}
	

}
