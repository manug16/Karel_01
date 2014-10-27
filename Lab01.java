/**
*
* Create Unit1\Lab01.java with the “school” map at size 10x10.  
Instantiate two Robot objects, one named lisa using the default constructor and the other named pete starting at (4, 5) facing south with zero beepers.  
Have lisa pick up the “book” from the math office and bring it to pete.  
Have pete take the book to the storage room and place it on the pile that currently has only two books.  
Then have pete step away from the pile.  // provide a brief description
*
* @author <Manu Gualandri>  // replace <...> with your name
* @version <24/10/2014> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab01 {

     public static void main(String[] args) {
     Display.openWorld("maps/school.map");
     Display.setSize(10, 10);
     Display.setSpeed(3);
     Robot lisa = new Robot();
     Robot pete = new Robot(4, 5, Display.SOUTH, 0);
     lisa.move();
     lisa.move();
     lisa.turnLeft();
     lisa.move();
     lisa.turnLeft();
     lisa.move();
     lisa.turnLeft();
     lisa.turnLeft();
     lisa.pickBeeper();
     lisa.move();
     lisa.turnLeft();
     lisa.turnLeft();
     lisa.turnLeft();
     lisa.move();
     lisa.turnLeft();
     lisa.move();
     lisa.move();
     lisa.move();
     lisa.turnLeft();
     lisa.move();
     lisa.move();
     lisa.move();
     lisa.turnLeft();
     lisa.move();
     lisa.move();
     pete.move();
     lisa.putBeeper();
     pete.pickBeeper();
     pete.turnLeft();
     pete.move();
     pete.move();
     pete.turnLeft();
     pete.move();
     pete.move();
     pete.turnLeft();
     pete.turnLeft();
     pete.turnLeft();
     pete.move();
     pete.move();
     pete.turnLeft();
     pete.move();
     pete.turnLeft();
     pete.move();
     pete.move();
     pete.turnLeft();
     pete.turnLeft();
     pete.turnLeft();
     pete.move();
     pete.move();
     pete.turnLeft();
     pete.move();
     pete.move();
     pete.putBeeper();
     pete.turnLeft();
     pete.turnLeft();
     pete.move();
     lisa.turnLeft();
     lisa.turnLeft();
     lisa.turnLeft();
     lisa.move();
     }
}
