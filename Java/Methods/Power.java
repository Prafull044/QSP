import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		System.out.println("Enter a power");
		int power = sc.nextInt();
		
	    System.out.println("Build in  :" + Math.pow(num , power));
		System.out.println("User defined :" +pow(num, power));
	}
	
	public static double pow(double num , double power){
		 double op = 1;
		 
		 if (power < 0)
		 {
			 power = power * -1 ; 
			 num = 1/ num;
		 }
		 
		 for (int i = 1;i<= power ;i++ )
		 {
			 op = op* num;
		 }
		 return op;
	}
}
