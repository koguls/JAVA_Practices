import java.util.Random;

public class localgobal extends Main{
    Random random;
    int number;

    localgobal(){
        random = new Random();
        roll();
   }
   void roll(){
      number = random.nextInt(6)+1;
      System.out.println();
   }



 
}
