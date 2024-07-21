import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class jlabel {
    public static void main(String[] args) {


        ImageIcon image = new ImageIcon("apple.png");
        Border outerlayer = BorderFactory.createLineBorder(Color.green);


        JLabel label = new JLabel();
        label.setText("hi, bro");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00ff00));
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setIconTextGap(100);
        label.setBackground(Color.black);
        label.setOpaque(true);

        label.setBorder(outerlayer);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100, 100, 250, 250);


        

        JFrame frame = new JFrame();
        frame.setTitle("learn jLabel");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());
        //frame.pack();


        frame.add(label);

    }
    
}
