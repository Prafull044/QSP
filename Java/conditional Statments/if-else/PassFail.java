import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {

        // ! Student is Pass or Fail
        // By using if else statement

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Mark : ");
        float num = sc.nextFloat();

        if (num >= 35) {
            System.out.println("Student is Pass by : " + num);
        } else {
            System.out.println("Student is Fail by : " + num);
        }

        System.out.println();
        // by using Conditional Statement

        System.out.print("Enter your Mark : ");
        double num2 = sc.nextDouble();

        String output = (num2 >= 35) ? ("Student is Pass"):("Student is fail");
        System.out.println(output);

    }
}
