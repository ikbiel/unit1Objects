public class TrimIt
{
    public static void main(String[] args)
    {
        String sentence1 = "      abc   ";
        String sentence2 = "   def";
        String sentence3 = "ghi        ";
              /*Your work goes here */
        String message = (sentence1).trim() + (sentence2 + sentence3).trim();
        System.out.println(message);
    }
}               
