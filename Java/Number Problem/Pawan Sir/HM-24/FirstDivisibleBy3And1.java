import java.util.Scanner;

class FirstDivisibleBy3And1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while (num != 0) {
            int digit = num % 10;

            if (digit % 3 == 0 && digit % 1 == 0) {
                System.out.println(digit);
                break;
            }

            num /= 10;
        }
    }
}