import java.util.Scanner;

class Vovels {
    public static void main(String[] args) {

        // by using if else statement

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a character: ");
        // char ch = sc.next().charAt(0);

        // if (ch == 'a' || ch == 'e' || ch == 'i' ||
        //     ch == 'o' || ch == 'u' ||
        //     ch == 'A' || ch == 'E' || ch == 'I' ||
        //     ch == 'O' || ch == 'U') {

        //     System.out.println("Vowel");
        // } else {
        //     System.out.println("Consonant");
        // }


        // by using Conditional statement

        System.out.print("Take any character: ");
        char ch = sc.next().charAt(0);

        String out = (ch == 'a' || ch == 'A' ||
                      ch == 'e' || ch == 'E' ||
                      ch == 'i' || ch == 'I' ||
                      ch == 'o' || ch == 'O' ||
                      ch == 'u' || ch == 'U')
                      ? "Vowel"
                      : "Consonant";

        System.out.println(out);

    
    }
}

