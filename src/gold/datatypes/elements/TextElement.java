package gold.datatypes.elements;

public class TextElement extends Element {
	
	private char val;
	
	public TextElement(char c){
		this.val = c;
	}
	
	public void setVal(char c){
		this.val = c;
	}
	
	public char getVal(){
		return this.val;
	}

}
