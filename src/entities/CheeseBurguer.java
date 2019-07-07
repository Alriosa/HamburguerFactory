package entities;

public class CheeseBurguer extends Burguer {

	public CheeseBurguer(String pName, String pType, String pIngredients) {
		super(pName,pType,pIngredients);
		this.setName("CheeseBurguer");
		this.setType("CheeseBurguer");
		this.setIngredients("Cheese");
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
