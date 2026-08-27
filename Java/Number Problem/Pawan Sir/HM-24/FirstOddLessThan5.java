import java.util.Scanner;

class FirstOddLessThan5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while (num != 0) {
            int digit = num % 10;

            if (digit < 5 && digit % 2 != 0) {
                System.out.println(digit);
                break;
            }

            num /= 10;
        }
    }
}