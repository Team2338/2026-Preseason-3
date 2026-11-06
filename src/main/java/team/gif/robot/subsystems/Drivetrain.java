// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class Drivetrain extends SubsystemBase {

    private WPI_TalonSRX rMotor;
    private WPI_TalonSRX lMotor;
    private DifferentialDrive diffDrive;

    public Drivetrain() {

        rMotor = new WPI_TalonSRX(RobotMap.RMOTOR_ID);
        rMotor.configFactoryDefault();
        rMotor.setNeutralMode(NeutralMode.Brake);

        lMotor = new WPI_TalonSRX(RobotMap.LMOTOR_ID);
        lMotor.configFactoryDefault();
        lMotor.setNeutralMode(NeutralMode.Brake);

        diffDrive = new DifferentialDrive(rMotor, lMotor);

    }

    public void arcadeDrive(double speed, double rotation) {
        diffDrive.arcadeDrive(speed, rotation);
    }


}
