class array{
public static void main(String arg[]){
    int arry[] = {1,2,3,4,5};
    String[] chars = new String[5];
    chars[0] = "cars";
    chars[1] = "bike";
    chars[2] = "plains";
    chars[3] = "cycle";
    
    System.out.println(chars[0]);    

    for(int i=0; i<chars.length; i++){
        System.out.print(chars[i]+ " ");

    }}
}