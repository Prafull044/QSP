import java.util.Scanner;

class TaxSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Income:");
        int income = sc.nextInt();

        double tax = 0;

        if (income <= 400000) {
            System.out.println("Tax Rate is 0%");
        }
        else if (income >= 400001 && income <= 800000) {
            tax = income * 0.05;
        }
        else if (income >= 800001 && income <= 1200000) {
            tax = income * 0.10;
        }
        else if (income >= 1200001 && income <= 1600000) {
            tax = income * 0.15;
        }
        else if (income >= 1600001 && income <= 2000000) {
            tax = income * 0.20;
        }
        else if (income >= 2000001 && income <= 2400000) {
            tax = income * 0.25;
        }
        else {
            tax = income * 0.30;
        }
            System.out.println("Tax payable on your income Ruppes =  " + tax);
    
     
    }
}