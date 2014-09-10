import java.awt.Color;

public class TurtleWorld
{
    public static void main(String[] args)
    {
        World turtleWorld = new World();
        
        Turtle turtle1 = new Turtle(turtleWorld);
        turtle1.moveTo(30, 10);
        turtle1.setPenColor(Color.GREEN);
        turtle1.turn(180);
        turtle1.penDown();
        turtle1.forward(100);
        turtle1.penUp();
        turtle1.turn(180);
        
        turtle1.moveTo(40, 50);
        turtle1.penDown();
        turtle1.setPenColor(Color.MAGENTA);
        turtle1.turn(90);
        turtle1.forward(50);
        turtle1.turn(135);
        turtle1.forward(60);
        turtle1.turn(-135);
        turtle1.forward(70);
        turtle1.penUp();
        turtle1.turn(-90);
        
        turtle1.moveTo(110, 50);
        turtle1.penDown();
        turtle1.setPenColor(Color.BLUE);
        turtle1.turnRight();
        turtle1.forward(50);
        turtle1.turn(135);
        turtle1.forward(60);
        turtle1.turn(-135);
        turtle1.forward(70);
        turtle1.penUp();
        
        turtle1.moveTo(200, 10);
        turtle1.penDown();
        turtle1.setPenColor(Color.GREEN);
        turtle1.turn(45);
        turtle1.forward(100);
        
        
        
        
     

        
       
    }
}
