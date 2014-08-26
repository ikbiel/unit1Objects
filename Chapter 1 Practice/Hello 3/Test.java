import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL (
            "http://fc04.deviantart.net/fs71/f/2010/247/9/5/baby_huskie_by_luckypanic-d2xzklk.jpg");
        JOptionPane.showMessageDialog(null, "Go Huskies!", "Naperville North High School",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        }
    }
        