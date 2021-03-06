
package org.usfirst.frc.team3695.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

//import org.usfirst.frc.team3695.robot.commands.ExampleCommand;
//import org.usfirst.frc.team3695.robot.subsystems.ExampleSubsystem;

import TestBotPart.*;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	private DrivePart drive;
	private SensorPart sensor;


    public void robotInit() {
    	drive = new TestBotPart.DrivePart(this);
    	sensor = new TestBotPart.SensorPart(this);
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        //if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        drive.updateAuto();
        sensor.updateAuto();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        //if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        drive.updateTeleop();
        sensor.updateTeleop();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
    
//    public ArmPart getArm()
//    {return arm;}
    
    public DrivePart getDrive()
    {return drive;}
    
//    public InterfacePart getStation()
//    {return driveStation;}
//    
//    public LiftPart getLift()
//    {return lift;}
    
    public SensorPart getSensor()
    {return sensor;}
}
