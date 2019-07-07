package entities;

public class SupremeBurguer extends Burguer{
	public SupremeBurguer(String pName, String pType, String pIngredients) {
		super(pName,pType,pIngredients);
		this.setName("");
		this.setType("");
		this.setIngredients("");
	}
}
