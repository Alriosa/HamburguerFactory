package entities;

public class SimpleBurguer extends Burguer{
	public SimpleBurguer(String pName, String pType, String pIngredients) {
		super(pName,pType,pIngredients);
		this.setName("Simple");
		this.setType("SimpleBurguer");
		this.setIngredients("Meat");
	}

	public SimpleBurguer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
