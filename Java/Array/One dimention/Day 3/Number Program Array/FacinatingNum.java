
class FacinatingNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {2025, 192, 193, 1234, 81, 9801};

        index(arr);
        System.out.println("Count: " + count);
    }

    public static void index(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (isFaciNum(num[i])) {
                count++;
                System.out.println(num[i]);
            }
        }
    }



public static boolean isFaciNum(int num) {
    if (num >= 100 && num < 1000) {
        int sum = (num * 1000000) + (num * 2000) + num * 3;

        for (int i = 0; i < 10; i++) {
            int temp = sum;
            int ct = 0;

            while (temp != 0) {
                int digit = temp % 10;

                if (digit == i) {
                    ct++;
                }

                temp /= 10;
            }

            if (i == 0 && ct > 0) {
                return false;
            }

            if (i != 0 && ct != 1) {
                return false;
            }
        }

        return true;
    }

    return false;
}

}