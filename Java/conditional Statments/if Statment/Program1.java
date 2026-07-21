
//! Online Shopping app //
// An Online shopping app gives 10% discount if the purchase amount is 5000 rs or more.

import java.util.Scanner;
public class Program1{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter shopping amount :- ");
        double amount = sc.nextDouble();

        if(amount >=5000){
            double discount = amount * 0.10 ;
            amount = amount - discount ;

            System.out.println("Discount applied Rs :- " + discount );
        }
        System.out.println("Total Payable Amount :- " + amount);

        System.out.println();
  
//! Mobile Recharge //
// if recharge amount is greater than 499 then gives the unlimited data . 

    System.out.print("Enter recharge amount :- ");
    double recharge = sc.nextDouble();

     if(recharge >= 499){
        System.out.println("Unlimited data Activated");
       }

       System.out.println();

//! Employ Bonus //
// If the Employ has work more than 5 years give the a 20% bonus


System.out.print("Enter your work Experiance :- ");
float experiance = sc.nextFloat();

System.out.print("Enter your Salary :- ");
double salary = sc.nextDouble();

if(experiance > 5){
    salary = salary + (salary * 0.20) ;
    System.out.println("your new salary :- " + salary );
}
 
System.out.println();


//! Traffic Signal //

System.out.print("Signal is :- ");
String signal = sc.next();


if(signal.equals("Green")){
    System.out.println("Go");
}
if(signal.equals("Red")){
    System.out.println("Stop");
}






  }
}