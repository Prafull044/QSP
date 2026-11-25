
import java.util.Arrays;

class StudentDriver
{
    public static void main(String[] args)
    {
        StudentManagment s1 = new student();

        int[] arr = {12, 3, 4, 4, 12};
		
		System.out.println(Arrays.toString(s1.removeDupMarks(arr)));

        s1.sortMarks(arr);
		
		int [] arr2 = {12,67,90,73};
		
		System.out.println(Arrays.toString(s1.mergeTwoMarksSheet(arr,arr2)));
		
		System.out.println(s1.averageMarks(arr));
		
		System.out.println(s1.leastMarks(arr));
		
		System.out.println(s1.highestMarks(arr2));
		
		
			
	}
	
}