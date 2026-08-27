import java.util.Scanner;

class FirstNonPrimeDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while (num != 0) {
            int digit = num % 10;

            if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
                System.out.println(digit);
                break;
            }

            num /= 10;
        }
    }
}