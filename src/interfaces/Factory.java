package interfaces;

import entities.Burguer;

public interface Factory {
	public Burguer serveBurguer(String pname, String ptype, String pingredients);
}
