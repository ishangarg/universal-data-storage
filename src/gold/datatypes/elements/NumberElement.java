package gold.datatypes.elements;

public class NumberElement extends Element{
	private int val;
	
	public NumberElement(int v){
		this.val = v;
	}
	
	public void setVal(int v){
		this.val = v;
	}
	
	public int getVal(){
		return this.val;
	}
}
