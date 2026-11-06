package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Constants;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;

public class Shooter extends SubsystemBase {
    private TalonSRX talon;


    public Shooter() {
        talon = new TalonSRX(RobotMap.TALON_ID);
        talon.configFactoryDefault();
        talon.setNeutralMode(NeutralMode.Brake);
    }
    public void moveMotor(double percentoutput){
        talon.set(ControlMode.PercentOutput, percentoutput);

        }
    }

