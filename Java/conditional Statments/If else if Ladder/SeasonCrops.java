import java.util.Scanner;

class SeasonCrops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Season (Summer / Winter / Rainy):");
        String season = sc.next();

        if (season.equalsIgnoreCase("Summer")) {

            System.out.println("Summer Season Crops:");
            System.out.println("1) Watermelon");
            System.out.println("2) Muskmelon");
            System.out.println("3) Cucumber");
            System.out.println("4) Pumpkin");
            System.out.println("5) Bottle Gourd");
            System.out.println("6) Bitter Gourd");
            System.out.println("7) Green Vegetables");

        }
        else if (season.equalsIgnoreCase("Winter")) {

            System.out.println("Winter Season Crops:");
            System.out.println("1) Wheat");
            System.out.println("2) Barley");
            System.out.println("3) Gram (Chickpea)");
            System.out.println("4) Mustard");
            System.out.println("5) Peas");
            System.out.println("6) Oats");
            System.out.println("7) Linseed");

        }
        else if (season.equalsIgnoreCase("Rainy")) {

            System.out.println("Rainy Season Crops:");
            System.out.println("1) Rice");
            System.out.println("2) Maize");
            System.out.println("3) Cotton");
            System.out.println("4) Soybean");
            System.out.println("5) Groundnut");
            System.out.println("6) Bajra");
            System.out.println("7) Jowar");
            System.out.println("8) Tur (Arhar)");

        }
        else {

            System.out.println("Invalid Season!");
            System.out.println("Please enter Summer, Winter, or Rainy.");

        }

    }
}