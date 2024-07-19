import java.io.FileWriter;
import java.io.IOException;

public class filewriter {

    public static void main(String[] args) {

       try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("hello" + 123 + "\nroses are red \nviolet are blue \n booty booty winner winner chicken dinnner");
            writer.close();
       }
       catch(IOException e){

        System.out.println("erorr");

       }
    }
    
}
