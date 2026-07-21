import java.util.Scanner;

public class UperLower {
    public static void main (String [] args){

    Scanner sc = new Scanner(System.in);

    // System.out.println("Take any character : ");
    // char ch = sc.next().charAt(0);

    //     if (ch>=65 && ch<=90){
    //     System.out.println("The charachter is in Uppercase !");
    //     }
        
    //     if (ch>=97 && ch<=122){
    //     System.out.println("The charachter is in Lowercase !"); 
    //     }
        
    //     if (ch>=48 && ch<=57){
    //     System.out.println("The charachter is Digit !");
    //     }
        
    //     if (!((ch>=65 && ch<=90)||(ch>=97 && ch<=122)||(ch>=48 && ch<=57))){
        
    //     System.out.println("The charachter is Special Character 1");
    //   }


System.out.print("Enter a character: ");
int ch = sc.next().charAt(0);

if ( ch >= 'A'  && ch <= 'Z' ){
System.out.println("The charachter is in Uppercase !");
}

if ( ch >= 'a' && ch <= 'z'){
System.out.println("The charachter is in Lowercase !");
}

if( ch >= 0 && ch <= 9 ){
System.out.println("The charachter is Digit !");
}

if (!((ch>='A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ) || ( ch >= 0 && ch <=  9 ))){
System.out.println("The charachter is Special Character !");
}



    }
}
