package factory;

import entities.Burguer;
import entities.*;
import interfaces.Factory;

public class BurguerFactory implements Factory {

	@Override
	public Burguer serveBurguer(String pname, String ptype, String pingredients) {
		if((pname == "Simple") && (ptype =="SimpleBurguer") && (pingredients == "Meat")) 
			return new SimpleBurguer(pname,ptype,pingredients);
		else
			if((pname == "CheeseBurguer") && (ptype =="CheeseBurguer") && (pingredients == "Cheese")) 
				return new CheeseBurguer(pname,ptype,pingredients);
			else
				return new SupremeBurguer(pname,ptype,pingredients);
			
		
		
	}

}
