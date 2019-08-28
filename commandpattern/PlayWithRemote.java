package com.collabera.designpatterns.commandpattern;

import java.util.ArrayList;
import java.util.List;


public class PlayWithRemote {
	
	public static void main(String[] args) {
		ElectronicDevice newDevice = TVRemote.getDevice();
		
		//TV On
		
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		onPressed.press();
	
		//TV Off
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		
		onPressed = new DeviceButton(offCommand);
		
		onPressed.press();
		
		//Volume
		TurnTVUp volUpCommand = new TurnTVUp(newDevice);
		
		onPressed = new DeviceButton(volUpCommand);
		
		onPressed.press();
		onPressed.press();
		onPressed.press();
		
		//Turn it all off
		
		Television theTV = new Television();
		
		Radio theRadio = new Radio();
		
		List<ElectronicDevice> allDevices = new ArrayList <ElectronicDevice>();
		
		allDevices.add(theTV);
		allDevices.add(theRadio);
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
		
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		
		turnThemOff.press();
		
		//Undos
		
		turnThemOff.pressUndo();

	}

}
