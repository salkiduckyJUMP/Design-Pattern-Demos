package com.collabera.designpatterns.commandpattern;

public class TVRemote {
	
	public static ElectronicDevice getDevice() {
		return new Television();
	}

}
