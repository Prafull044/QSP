import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String [] args){

     //! Find the number is Positive or Negative
        //By using if else statement

        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter your Number : ");
        double num = sc.nextDouble();

        if(num > 0 ){
            System.out.println("Number is Positive");
        }else{
            System.out.println("Number is Negative");
        }



        System.out.println();
        // by using Conditional Statement

        System.out.print("Enter your Number : ");
        double num2 = sc.nextDouble();

        String output = (num2 > 0 )? (" The number is Positive"):(" The number is Negative") ; 
        System.out.println(output);


}
}