package it.unibo.oop.lab07.exercise04;

/**
 * Models a generic composable robot.
 * 
 * @author Matteo Casadei
 *
 */
public interface IComposableRobot {
  /**
   * 
   * @return The composable robot's parts.
   */
	IRobotPart[] getParts();
}