import java.util.Scanner;
class Vowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER a Char :");
        char ch = input.next().charAt(0);
      
    switch (ch)  {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println(ch + " is vowel");
            break;
        default :
            System.out.println(ch + " is consonant") ;
    }
    
    }
}
