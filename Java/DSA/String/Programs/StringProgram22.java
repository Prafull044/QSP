// WAP to print only remaining characters except digits

class StringProgram22 {
    public static void main(String[] args) {
        String str = "PraFULL123@#";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!(ch >= '0' && ch <= '9')) {
                System.out.print(ch);
            }
        }
    }
}
