package entities;

public abstract class Burguer {

	private String name;
	private String type;
	private String ingredients;
	
	
	public Burguer() {
		super();
	}
	public Burguer(String name, String type, String ingredients) {
		super();
		this.name = name;
		this.type = type;
		this.ingredients = ingredients;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	
}
