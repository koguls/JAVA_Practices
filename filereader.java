import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.sound.midi.Soundbank;

public class filereader {

    public static void main(String[] args) {

        try{
        FileReader reads = new FileReader("poem.txt");
        int data = reads.read();
    
        while(data != -1) {

            System.out.print((char)data);
            data =reads.read();
            
        }
        reads.close();
        }
        catch(FileNotFoundException e){

            e.printStackTrace();

        }
        catch(Exception e){

            e.printStackTrace();

        }
    }
    
}
