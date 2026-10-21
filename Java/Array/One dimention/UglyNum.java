class UglyNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 55, 33, 31, 59, 39, 29, 18};

        index(arr);
        System.out.println("Count: " + count);
    }

    public static void index(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (isUglyNum(num[i])) {
                count++;
                System.out.println(num[i]);
            }
        }
    }

    public static boolean isUglyNum(int num) {

        while (num % 2 == 0) {
            num = num / 2;
        }
		 while (num % 3 == 0) {
            num = num / 3;
        }
		 while (num % 5 == 0) {
            num = num / 5;
        }
        return num == 1;
    }
}