import java.util.Scanner;

class FirstPrimeGreaterThan3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while (num != 0) {

            int digit = num % 10;

            if (digit > 3) {

                int count = 0;

                for (int i = 1; i <= digit; i++) {

                    if (digit % i == 0) {
                        count++;
                    }
                }

                if (count == 2) {
                    System.out.println(digit);
                    break;
                }
            }

            num /= 10;
        }
    }
}
