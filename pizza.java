

public class pizza {

    String Bread;
    String sauce;
    String cheese;
    String topping;

    pizza(){
        System.out.println("no pizza");
    }

    pizza(String bread,String sauce,String cheese,String topping){

        this.Bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;


    }
    
    pizza(String bread,String sauce,String cheese){

        this.Bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        


    }
    pizza(String bread,String sauce){

        this.Bread = bread;
        this.sauce = sauce;
       
    }
    pizza(String bread){

        this.Bread = bread;
    
    }
}
    
