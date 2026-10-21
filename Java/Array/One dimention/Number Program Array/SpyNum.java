class SpyNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 55, 33, 31, 59, 39, 29, 18};

        index(arr);
        System.out.println("Count: " + count);
    }

    public static void index(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (spyNum(num[i])) {
                count++;
                System.out.println(num[i]);
            }
        }
    }

    public static boolean spyNum(int num) {
        int sum = 0;
		int prod = 1;

        while (num != 0) {
            sum = sum + num % 10;
			prod *= num % 10;
            num = num / 10;
        }

        return  sum == prod;
    }
}