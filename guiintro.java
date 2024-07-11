import javax.swing.JOptionpane;

public class guiintro{
    public static void main(String args[]){

        String name = JOptionpane.showInputDialog("entername");
        JOptionpane.showMessageDialog(null,"you are name "+name);

        int age = integer.parseInt(JOptionpane.showInputDialog("enter age"));
        JOptionpane.showMessageDialog(null, "your are "+ age +" old");

    }
}