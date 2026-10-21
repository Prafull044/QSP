
class PerfectNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 55, 33, 31, 59, 39, 29, 18, 6, 28};

        index(arr);
        System.out.println("Count: " + count);
    }

    public static void index(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (isPerfectNum(num[i])) {
                count++;
                System.out.println(num[i]);
            }
        }
    }

    public static boolean isPerfectNum(int num) {
        int n = num;
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        return sum == n;
    }
}

