import java.util.Arrays;
class student implements StudentManagment
{
   public int [] removeDupMarks(int [] ar)
	{
	  	boolean [] visited = new boolean[ar.length];
		int ct = 0;
		
		for(int i = 0 ; i<ar.length ; i++)
		{
			if(visited[i])
			{
				continue;
			}
			int count = 1;
			
			for(int j = i+1 ; j< ar.length; j++)
			{
				if(ar[j] == ar[i])
				{
					count++;
					visited[j] = true;
				}
			}
			
			if(count > 1){
				ct++;
			}
		}
		
		int [] newArray =new int[ar.length- ct];
		
		 int index = 0;
		for(int i = 0; i< ar.length ; i++)
	    {
			if(!(visited[i]))
			{
				newArray[index] = ar[i];
				index++;
			}
	    }
		
		return newArray;
}

    public void sortMarks(int[] ar)
      {
           ArrayReq.bubbleSort(ar);
           System.out.println(Arrays.toString(ar));
      }

     public int[] mergeTwoMarksSheet(int[] s1, int[] s2)
        {
            int [] newArray = new int[s1.length + s2.length];
			
			for(int i = 0; i<s1.length ; i++)
			{
				newArray[i] = s1[i];
			}
			
			for(int j = 0 ; j<s2.length ; j++)
			{
				newArray[j + s1.length] = s2[j];
			}
			return newArray;
         }
		 
		 

       public int averageMarks(int[] ar)
       {
           int sum = 0;
		   for(int i = 0; i<ar.length ; i++)
		   {
			sum += ar[i];
		   }
		   return sum/ar.length;
       }

     public int leastMarks(int[] ar)
     {
         int min = Integer.MAX_VALUE;
		 for(int i = 0; i<ar.length ; i++)
		 {
			if(ar[i] < min)
			 {
				min = ar[i];
			 }
		 }
		 return min;
     }

     public int highestMarks(int[] ar)
     {
          int max = Integer.MIN_VALUE;
     		 for(int i = 0; i<ar.length ; i++)
     		 {
     			if(ar[i] > max)
     			 {
     				max= ar[i];
     			 }
     		 }
     		 return max;
     }


     public int[] topThreeMarks(int[] ar)
     {
          int max1 = Integer.MIN_VALUE;
		  int max2 = Integer.MIN_VALUE;
		  int max3 = Integer.MIN_VALUE;
		  
		  for(int i = 0 ; i<ar.length ; i++)
		 {
			if(ar[i] )
		 }
			
     }

}