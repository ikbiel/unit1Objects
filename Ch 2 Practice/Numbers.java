import java.util.Random;

public class Numbers
{
    public static void main(String[] args)
    {
        Random myNumber = new Random();
        
        System.out.println(myNumber.nextInt(6));
    }
}
