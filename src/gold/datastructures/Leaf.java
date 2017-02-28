package gold.datastructures;

public class Leaf {
	
	private int val;
	private Leaf left;
	private Leaf right;
	
	public Leaf(int val){
		this.val= val;
	}
	
	public void setLeft(Leaf left){
		this.left = left;
	}
	
	public void setRight(Leaf right){
		this.right = right;
	}
	
	public Leaf getLeft(){
		return this.left;
	}
	
	public Leaf getRight(){
		return this.right;
	}
	
	public int getValue(){
		return this.val;
	}

}
