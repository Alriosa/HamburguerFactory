package entities;

public class SimpleBurguer extends Burguer{
	public SimpleBurguer(String pName, String pType, String pIngredients) {
		super(pName,pType,pIngredients);
		this.setName("Simple");
		this.setType("SimpleBurguer");
		this.setIngredients("Bread,Meat,Salt");
	}
}
