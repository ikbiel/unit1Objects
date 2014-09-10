import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = turtle1; 
        turtle1.setPenColor(Color.RED);
        turtle2.setPenColor(Color.BLUE);
        turtle1.penDown();
       
        turtle2.penDown()        
        turtle1.forward(50);
        turtle2.backwfard(20);
    }
}
