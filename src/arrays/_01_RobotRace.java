package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < robots.length; i++) {
	robots[i] = new Robot();
	robots[i].setSpeed(30);
	robots[i].setX(60*i+100);
	robots[i].setY(250);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random ran = new Random();


	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

/*boolean j = false;
while (j == false) {
	for (int i = 0; i < robots.length; i++) {
		robots[i].move(ran.nextInt(49));

		if(robots[i].getY() < 50) {
			j = true;
		JOptionPane.showMessageDialog(null, i +  " won!");
		break;
	}
}
	
}
*/
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.


	//9. make the robots race around a circular track.

for (int k = 0; k < 24; k++) {
	for (int i = 0; i < robots.length; i++) {
		robots[i].turn(10);
		robots[i].move(ran.nextInt(30)+20);
	if(robots[i].getY() >= 450) {
		JOptionPane.showMessageDialog(null,  + i + " is the winner!");
		break;
		}
	}
}




}
}