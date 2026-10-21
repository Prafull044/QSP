class HarshadNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 55, 33, 31, 59, 39, 29, 18};

        index(arr);
        System.out.println("Count: " + count);
    }

    public static void index(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (isHarshadNum(num[i])) {
                count++;
                System.out.println(num[i]);
            }
        }
    }

    public static boolean isHarshadNum(int num) {
        int n = num;
        int sum = 0;

        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        return n % sum == 0;
    }
}