// WAP to print only remaining characters except uppercase
class ProgramNumber19 {
    public static void main(String[] args) {
        String str = "PraFULL123@#";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!(ch >= 'A' && ch <= 'Z')) {
                System.out.print(ch);
            }
        }
    }
}
