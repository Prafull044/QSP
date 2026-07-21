import java.util.Scanner;

class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        if (units <= 100) {
            bill = units * 4.43;
        }
        else if (units <= 300) {
            bill = (100 * 4.43) + ((units - 100) * 9.64);
        }
        else if (units <= 500) {
            bill = (100 * 4.43) + (200 * 9.64) + ((units - 300) * 12.83);
        }
        else {
            bill = (100 * 4.43) + (200 * 9.64) + (200 * 12.83)
                    + ((units - 500) * 14.33);
        }

        System.out.println("Electricity Bill = " + bill);
    }
}