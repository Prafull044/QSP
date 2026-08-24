import java.util.Scanner;
class NearestPrime 
{
    static int num;
    static int checkValue;   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        getNearestPrimeNum();
    }
    
    public static void getNearestPrimeNum()
    {
        if (num <= 2)
        {
            System.out.println("Nearest prime number is: 2");
            return;
        }
        
        checkValue = num;
        if (isPrime())
        {
            System.out.println(num + " is already a prime number");
            return;
        }
        
        for (int distance = 1; ; distance++)
        {
            checkValue = num - distance;
            if (checkValue >= 2 && isPrime())
            {
                System.out.println("Nearest prime number is: " + checkValue);
                return;
            }
            
            checkValue = num + distance;
            if (isPrime())
            {
                System.out.println("Nearest prime number is: " + checkValue);
                return;
            }
        }
    }
    
    public static boolean isPrime()
    {
        if (checkValue <= 1) return false;
        for (int i = 2; i <= checkValue / 2; i++)
        {
            if (checkValue % i == 0) return false;
        }
        return true;
    }
}