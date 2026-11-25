// WAP to print only remaining characters except lowercase

class StringProgram21 {
    public static void main(String[] args) {
        String str = "PraFULL123@#";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!(ch >= 'a' && ch <= 'z')) {
                System.out.print(ch);
            }
        }
    }
}
