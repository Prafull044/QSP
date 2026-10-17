import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = num + 1;
        boolean flag = false;

        for (int i = 1; i <= sum; i++) {
            if (i * i == sum) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println(num + " is a Sunny Number");
        } else {
            System.out.println(num + " is not a Sunny Number");
        }
    }
}