
class PerfectSqrNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 9, 33, 31, 59, 39, 29, 18, 6, 28};

        index(arr);
        System.out.println("Count: " + count);
    }

    public static void index(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (isPerfectsqrNum(num[i])) {
                count++;
                System.out.println(num[i]);
            }
        }
    }

    public static boolean isPerfectsqrNum(int num) {
        int n = num;
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num == i*i) {
                return true;
            }
        }

        return false;
    }
}

