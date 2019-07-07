package interfaces;

import entities.Burguer;

public interface BurguerServer {
	public Burguer serveBurguer(String pname, String ptype, String pIngredients);
}
