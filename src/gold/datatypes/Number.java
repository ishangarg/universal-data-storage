package gold.datatypes;

import gold.datatypes.elements.NumberElement;

public class Number {
	
	NumberElement start;
	
	public Number(String num){
		
		for(int i = 0; i<num.length(); i++){
			if(start == null){
				start = new NumberElement(Integer.parseInt("" + num.charAt(i)));
			}else{
				NumberElement current = start;
				while(current.getNext() != null){
					current = (NumberElement) current.getNext();
				}
			}
		}
		
	}

}
