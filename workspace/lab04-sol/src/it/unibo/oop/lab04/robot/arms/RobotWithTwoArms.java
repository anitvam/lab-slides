package it.unibo.oop.lab04.robot.arms;

import it.unibo.oop.lab04.robot.base.BaseRobot;

/**
 * Models a robot with two {@link BasicArm}
 * 
 * @author Andrea Santi
 * @author Danilo Pianini
 *
 */
public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {

    public static final double TRANSPORT_OBJECT_CONSUMPTION = 0.1;

    private final BasicArm leftArm;
    private final BasicArm rightArm;

    /**
     * 
     * @param robotName
     * @param batteryLevel
     */
    public RobotWithTwoArms(final String robotName) {
        super(robotName);
        leftArm = new BasicArm("Left arm");
        rightArm = new BasicArm("Right arm");
    }

    /**
     * Consume the energy required for moving from the battery, taking into the
     * account the number of object currently grabbed by the robot
     */
    protected void consumeBatteryForMovement() {
        super.consumeBatteryForMovement();
        super.consumeBattery(getItemsCarried() * TRANSPORT_OBJECT_CONSUMPTION);
    }

    private void doPick(final BasicArm arm) {
        if (isBatteryEnough(arm.getConsuptionForPickUp()) && !arm.isGrabbing()) {
            log(arm + " is picking an object");
            arm.pickUp();
            consumeBattery(arm.getConsuptionForPickUp());
        } else {
            log("Can not grab (batteryLevel=" + this.getBatteryLevel() + "," + arm + " isGrabbing=" + arm.isGrabbing()
                    + ")");
        }
    }

    private void doRelease(final BasicArm arm) {
        if (isBatteryEnough(arm.getConsuptionForDropDown()) && arm.isGrabbing()) {
            this.log(arm + " is releasing an object");
            arm.dropDown();
            this.consumeBattery(arm.getConsuptionForDropDown());
        } else {
            log("Can not release (batteryLevel=" + this.getBatteryLevel() + "," + arm + " isGrabbing="
                    + arm.isGrabbing() + ")");
        }
    }

    public boolean dropDown() {
        if (leftArm.isGrabbing()) {
            doRelease(leftArm);
            return true;
        }
        if (rightArm.isGrabbing()) {
            doRelease(rightArm);
            return true;
        }
        return false;
    }

    public int getItemsCarried() {
        return (leftArm.isGrabbing() ? 1 : 0) + (rightArm.isGrabbing() ? 1 : 0);
    }

    public boolean pickUp() {
        if (rightArm.isGrabbing()) {
            if (leftArm.isGrabbing()) {
                return false;
            }
            doPick(leftArm);
        } else {
            doPick(rightArm);
        }
        return true;
    }

}