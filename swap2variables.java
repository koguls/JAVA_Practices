public class swap2variables{
    public static void main(String args[]){
        String x = "water";
        String y = "h20";
        String temp ;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x "+x);
        System.out.println("y "+y); 

    }
}