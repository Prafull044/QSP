import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {

        // ! Find the Smallest value 
        // By using if else statement

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your 1st number : ");
        double num = sc.nextDouble();

        System.out.print("Enter your 2nd number : ");
        double num2 = sc.nextDouble();

        if (num < num2) {
            System.out.println( "Smallest No is : " + num  );
        } else {
            System.out.println( "Smallest No is : " + num );
        }

        System.out.println();
        // by using Conditional Statement

        System.out.print("Enter your 1st number : ");
        double num3 = sc.nextDouble();

        System.out.print("Enter your 2nd number : ");
        double num4 = sc.nextDouble();


        String output = (num3 < num4) ? ("Smallest number is : " + num3):("Smallest number is : " + num4);
        System.out.println(output);

    }
}
