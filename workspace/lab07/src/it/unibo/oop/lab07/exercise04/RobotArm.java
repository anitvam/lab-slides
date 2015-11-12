package it.unibo.oop.lab07.exercise04;

/**
 * Models a robotic arm.
 * 
 * @author Andrea Santi
 * @author Matteo Casadei
 *
 */
public class RobotArm extends AbstractMovementPart {

    private boolean isGrabbing;
    private static final double ENERGY_REQUIRED_TO_MOVE = 0.2;

    /**
     * 
     * @param description description of the robotic arm
     */
    public RobotArm(final String description) {
        super(RobotArm.ENERGY_REQUIRED_TO_MOVE, description);
    }

    /**
     * 
     * @return true if the movement has been done
     */
    public boolean doMove() {
        if (this.isOn() && !this.isGrabbing) {
            this.isGrabbing = true;
            return true;
        } else if (this.isOn() && this.isGrabbing) {
            this.isGrabbing = false;
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * @return true if the arm is grabbing something
     */
    public boolean isGrabbing() {
        return isGrabbing;
    }
}