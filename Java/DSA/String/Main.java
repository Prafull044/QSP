// Create an abstract calss user string with the abstract methods length() , tocharArray() , isEmpty(),
//			, charAt() and toString() .  create a child implementing class to the abstract methods and after
// implemnetation you have create driver class to the demonstration the methods which you have implemented;
  import java.util.Arrays;
  abstract class DemoString
  {
		public abstract String toString();
		public abstract char charAt(int index);
		public abstract int length();
	    public abstract char[] toCharArray();
		public abstract boolean isEmpty() ;
		
  }


class DemoStringDriver extends DemoString
{
	private char[] value;
	
	String str;
	
	DemoStringDriver(String str)
	{
		 value = str.toCharArray();
	}
	
	
	 public String toString() {

        if (isEmpty()) {
            return "";
        }

        return new String(value);
    }
	
	
	public char charAt(int index) {

        if (index < 0 || index >= value.length) {
            throw new StringIndexOutOfBoundsException();
        }

        return value[index];
        }
	
	
	  public int length()
		{
          return value.length;
        }
	

	   public char[] toCharArray() {
        return value;
        }
	
	    public boolean isEmpty() {
        return value.length == 0;
         }
	
}	
public class Main
{

	public static void main(String[] args)
    {
        DemoStringDriver obj = new DemoStringDriver("Prafull");

        System.out.println("String: " + obj.toString());

        System.out.println("Length: " + obj.length());

        System.out.println("Character at index 2: " + obj.charAt(2));

        System.out.println("Is Empty: " + obj.isEmpty());

        System.out.println(Arrays.toString(obj.toCharArray()));
	
	}
}

