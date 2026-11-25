// WAP to check String is Starting with vowel or not
class StringProgram3 {
    public static void main(String[] args) {
        String str = "Apple";

        char ch = str.charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U') {

            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}