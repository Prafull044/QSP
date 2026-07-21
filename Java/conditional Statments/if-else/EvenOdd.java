import java.util.Scanner;

class EvenOdd{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        //! Find the Number is Even or odd 
        // by using if else statement

        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is odd");
        }


        System.out.println();
        // by using conditional statement 

        System.out.print("Enter your number : ");
        int num2 = sc.nextInt();

        String output = (num2 % 2 == 0)? ("Even No"): ("Odd No");
        System.out.println(output);


    }
}