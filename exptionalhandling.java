import java.util.InputMismatchException;
import java.util.Scanner;

public class exptionalhandling {

    public static void main(String[] args) {

        try{
        
             Scanner input = new Scanner(System.in);

            System.out.println("enter a whole number to divide: ");
            int x = input.nextInt();

            System.out.println("enter a whole number to divide by: ");
            int y = input.nextInt();

            int z = x/y;

            System.out.println("result"+ z);
        
        }
        catch(ArithmeticException e){

            System.out.println("you cant divide by zero idiot");


        }

        catch(InputMismatchException e){

            System.out.println("please enter intiger only ");

        }
        catch(Exception e){

            System.out.println("something went wrong :(");

        }

        finally{
            System.out.println("thank you !!!");

        }

 } 
    
}
