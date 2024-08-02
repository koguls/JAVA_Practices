import java.util.Scanner; //import the scanner class

class Userinput2{
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in); // Create a Scanner object
        String name;
        int age;
        double salary;
        
        System.out.println("enter your name");
        name = inputs.nextLine(); 
        
        System.out.println("enter your age");
        age = inputs.nextInt();
        
        System.out.println("enter your salary");
        salary = inputs.nextDouble();
    //output statement   
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
        
        
    }
}
