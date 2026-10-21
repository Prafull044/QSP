
class TechNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {2025, 3025, 1441, 1234, 81, 9801};

        index(arr);
        System.out.println("Count: " + count);
    }

    public static void index(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (isTechNum(num[i])) {
                count++;
                System.out.println(num[i]);
            }
        }
    }

    public static boolean isTechNum(int num) {
        int n = num;
        int digits = countDigits(num);

        if (digits % 2 != 0) {
            return false;
        }

        int div = 1;

        for (int i = 1; i <= digits / 2; i++) {
            div *= 10;
        }

        int first = num / div;
        int second = num % div;

        int sum = first + second;

        return sum * sum == n;
    }

    public static int countDigits(int num) {
        int ct = 0;

        while (num != 0) {
            ct++;
            num /= 10;
        }

        return ct;
    }
}
