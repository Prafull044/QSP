import java.util.Scanner;

class FirstDigitGreaterThan2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while (num != 0) {

            int digit = num % 10;

            if (digit > 2) {
                System.out.println(digit);
                break;
            }

            num /= 10;
        }
    }
}