import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class jlabel {
    public static void main(String[] args) {


        ImageIcon image = new ImageIcon("ko.png");


        JLabel label = new JLabel();
        label.setText("hi, bro");

        

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(label);

        frame.setVisible(true);
    }
    
}
