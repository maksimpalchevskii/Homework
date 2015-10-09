package homework.hw2_inheritance_examples;

import java.awt.*;

public class LiskovSubstitutionPrinciple {
	
	public static void main(String[] args) throws AWTException {
		
		Robot robot = new Robot();

		System.out.println(robot.toString());
		System.out.println(robot.hashCode());

		robot = new Robot();

		System.out.println(robot.toString());
		System.out.println(robot.hashCode());
	}
}
