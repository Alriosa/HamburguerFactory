package main;

import factory.BurguerFactory;

public class MainClass {

	public static void main(String[] args) {
		BurguerFactory factory = new BurguerFactory();
		
		System.out.println(factory.serveBurguer("Simple", "SimpleBurguer", "Meat"));
		System.out.println(factory.serveBurguer("CheeseBurguer", "CheeseBurguer", "Cheese"));
		System.out.println(factory.serveBurguer("Supreme", "SupremeBurguer", "Supreme"));
	}
}
