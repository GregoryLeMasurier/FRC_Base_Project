package org.usfirst.frc.team5962.robot.subsystems;

import org.usfirst.frc.team5962.robot.Robot;
import org.usfirst.frc.team5962.robot.commands.RunAutonomous;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Autonomous extends Subsystem {
	
	private RunAutonomous runAuto = (RunAutonomous) Robot.autonomousCommand;
	
	private double getGyroAngle() {
		double angle = Robot.gyro.getGyroAngle();
		return angle;
	}

	
	//Create a method here and make the robot drive forwards.

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
}