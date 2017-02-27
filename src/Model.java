
public class Model {
	
	private String modelName;
	
	public Model(String name){
		this.modelName = name;
	}
	
	public void changeName(String name){
		this.modelName = name;
	}
	
	public String getName(){
		return this.modelName;
	}
	
	
	
}
