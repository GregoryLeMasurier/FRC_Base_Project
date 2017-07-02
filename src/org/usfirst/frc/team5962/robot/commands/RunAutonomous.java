package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.Robot;
import org.usfirst.frc.team5962.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

public class RunAutonomous extends Command {

	private boolean isFinished = false;

	protected void initialize() {
		Robot.gyro.resetGyro();
		RobotMap.myRobot.setMaxOutput(0.5);
	}

	protected void execute() {
		//Call the method you created in the Autonomous subsystem here:
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}