package com.collabera.designpatterns.templatemethodpattern;


public abstract class Hoagie {
	
	boolean afterFirstCondiment = false;
	
	final void makeSandwich() {
		
		cutBun();
		
		if(customerWantsMeat()) {
			
			addMeat();
			
			 afterFirstCondiment = true;
			
		}
		
		if(customerWantsCheese()) {
			
			if(afterFirstCondiment) {System.out.println("\n");}
				
			addCheese();
			
			 afterFirstCondiment = true;
			
			

			
		}
		
		if(customerWantsVegetables()) {
			
			if(afterFirstCondiment) {System.out.println("\n");}
			
			addVegetables();
			
			 afterFirstCondiment = true;

		}
		
		if(customerWantsCondiments()) {
			
			if(afterFirstCondiment) {System.out.println("\n");}
			
			addCondiments();
			
			 afterFirstCondiment = true;

		}
		
		System.out.println("\n");

		wrapTheHoagie();
		
		
	}
	
	public void cutBun() {
		System.out.println("The Hoagie is Cut");
	}
	
	abstract void addMeat();
	abstract void addCheese();
	abstract void addVegetables();
	abstract void addCondiments();
	
	//Hooks; can be overridden
	boolean customerWantsMeat() {
		return true;
	}
	
	boolean customerWantsCheese() {
		return true;
	}
	
	boolean customerWantsVegetables() {
		return true;
	}
	
	boolean customerWantsCondiments() {
		return true;
	}
	
	public void wrapTheHoagie() {
		System.out.println("Wrap the Hoagie");
	}

}
