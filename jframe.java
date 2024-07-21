import java.awt.Color;
import java.awt.color.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class jframe {

    public static void main(String[] args) {
         
        JFrame frame = new JFrame();
        frame.setTitle("my java jframe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
        


        ImageIcon image = new ImageIcon("apple.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.green); //new Color(hex)


    }
}