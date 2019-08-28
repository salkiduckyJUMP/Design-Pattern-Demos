package com.collabera.designpatterns.adapterpattern;

public class EnemyRobotAdapter implements EnemyAttacker {
	
	EnemyRobot theRobot;
	
	public EnemyRobotAdapter(EnemyRobot newRobot) {
		
		theRobot = newRobot;
		
	}

	@Override
	public void FireWeapon() {

		theRobot.smashWithHands();
		
	}

	@Override
	public void driveForward() {

		theRobot.walkForward();
	}

	@Override
	public void assignDriver(String driverName) {
		
		theRobot.reactToHuman(driverName);
		
	}
	
	

}
