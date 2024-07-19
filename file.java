import java.io.File;;

public class file {

    public static void main(String[] args) {


        File file = new File("textfile.txt");

        while (file.exists()) {
            
        

        if(file.exists()){
            System.out.println("this file is there :o!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            System.out.println(file.isHidden());
            System.out.println(file.isDirectory());
            file.delete();
    
        }
        
        
        else{
            System.out.println("the file doest exists:(");
        }
    }
    if(!file.exists()){
        System.out.println("this deleted successfuly");

        
    }

    

    
    }
}
