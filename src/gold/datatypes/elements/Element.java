package gold.datatypes.elements;

public class Element {
	
	public Element next, prev;
	
	public Element(){
		
	}
	
	public void setNext(Element e){
		this.next = e;
	}
	
	public void setPrev(Element e){
		this.prev = e;
	}
	
	public Element getNext(){
		return this.next;
	}
	
	public Element getPrev(){
		return this.prev;
	}
	
}
