/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.wpilibj.trajectory.constraint.DifferentialDriveKinematicsConstraint;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class DriveConstants {
    public static final int kLeftMotor1Port = 4;
    public static final int kLeftMotor2Port = 5;
    public static final int kLeftMotor3Port = 6;
    public static final int kRightMotor1Port = 1;
    public static final int kRightMotor2Port = 2;
    public static final int kRightMotor3Port = 3;

    public static final int[] kLeftEncoderPorts = new int[]{1, 0};
    public static final int[] kRightEncoderPorts = new int[]{3, 2};
    public static final boolean kLeftEncoderReversed = true;
    public static final boolean kRightEncoderReversed = false;

    public static final double kTrackwidthMeters = .5969;
    public static final DifferentialDriveKinematics kDriveKinematics =
        new DifferentialDriveKinematics(kTrackwidthMeters);

    public static final int kEncoderCPR = 245;
    public static final double kWheelDiameterMeters = 0.127;
    public static final double kEncoderDistancePerPulse =
        // Assumes the encoders are directly mounted on the wheel shafts
        (kWheelDiameterMeters * Math.PI) / (double) kEncoderCPR;

    public static final boolean kGyroReversed = false;

    // These are example values only - DO NOT USE THESE FOR YOUR OWN ROBOT!
    // These characterization values MUST be determined either experimentally or theoretically
    // for *your* robot's drive.
    // The RobotPy Characterization Toolsuite provides a convenient tool for obtaining these
    // values for your robot.
    public static final double ksVolts = 0.933;
    public static final double kvVoltSecondsPerMeter = 2.58;
    public static final double kaVoltSecondsSquaredPerMeter = 0.586;

    // Example value only - as above, this must be tuned for your drive!
    public static final double kPDriveVel = 1.4;//1.52
  }

  public static final class OIConstants {
    public static final int kDriverControllerPort = 1;
  }
  
  public static final class AutoConstants {
    public static final double kMaxSpeedMetersPerSecond = 5;//10
    public static final double kMaxAccelerationMetersPerSecondSquared = 1.5;//1.5

    public static final DifferentialDriveKinematicsConstraint kAutoPathConstraints =
        new DifferentialDriveKinematicsConstraint(DriveConstants.kDriveKinematics,
                                                  kMaxSpeedMetersPerSecond);

    // Reasonable baseline values for a RAMSETE follower in units of meters and seconds
    public static final double kRamseteB = 2;
    public static final double kRamseteZeta = .7;
  }
}