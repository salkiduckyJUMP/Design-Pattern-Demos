package com.collabera.designpatterns.prototype;

public class CloneFactory {
	
	public Animal getClone(Animal animalSample) {
		
		return animalSample.makeCopy();
		
	}

}
