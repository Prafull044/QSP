import java.util.Scanner;
class  ValentineWeek
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Valentines Week Dates");
		
		String date = sc.next();
		
			switch (date){
				
			case "7" :
			{
				System.out.println("Rose Day");
			}
			break ;
			case "8":
			{
				System.out.println("Propose Day");
			}
			break;
			case "9" :
			{
				System.out.println("Chocalate Day") ;
			}
			break;
			case "10":
			{
				System.out.println("Teddy Day") ;
			}
			case "11":
			{
				System.out.println("Promise Day??") ;
			}
			case "12":
			{
				System.out.println("Hug Day") ;
			}
			case "13":
			{
				System.out.println("Kiss Day") ;
			}
			case "14":
			{
				System.out.println("Valentines Day") ;
			}
			default :
			{
				System.out.println("You Enter Wrong Input Plz Enter 7 to 14 date range ");
			}
			
		}
					
		}
}
