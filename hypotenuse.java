import java.util.Scanner;

public class hypotenuse{




    public void mathfun(int x,int y){
        max=Math.max(x,y);
        min=Math.min(x,y);
        abs=Math.abs(y);
        rou=Math.round(x);
        cel=Math.ceil(x);

        result = System.out.print(max +"min " + min +"abs"+ abs + "roun "+rou  + "c" +cel );

        return result;
    }
}
    public static void main(String args[]){
        double x;
        double y;
        double z;

        Scanner input = new Scanner(System.in);

        System.out.println("enter side x :");
        x = input.nextDouble();

        System.out.println("enter side y :");
        y = input.nextDouble();

        z = Math.sqrt((x*x)+(y*y));


        mathfun(x,y);
        System.out.println("the hypotenuse is " +z);
        System.out.println(result);

    }

    