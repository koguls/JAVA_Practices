public class Person {

    String Name;
    int Age;
    Double Weight;
    String Work;
    
    Person(String name, int age, double weight, String occupation ){

        this.Name = name;
        this.Age = age;
        this.Weight = weight;
        this.Work = occupation;

    }


    void details(){
        int cout = 0;
      for(int i = 0 ; i<cout; i++){
        System.out.println("Name is :"+this.Name);
        System.out.println("Name is :"+this.Age);
        System.out.println("Name is :"+this.Work);
        System.out.println("Name is :"+this.Weight);

        cout++;

    }
        System.out.println("Name is :"+this.Name);
        System.out.println("age is :"+this.Age);
        System.out.println("occupation is :"+this.Work);
        System.out.println("weight is :"+this.Weight);
    
}

}
