class pp4
{
	public static void main(String[] args) 
	{ 
		int n = 4;
		for (int i = 1;i<= n ;i++ )
		{   
			char ch = char('a'+i-1);
		       int num = i;
			for (int j = 1;j<=n ;j++ )
			{
				if(j % 2 == 0){
				    System.out.print(num++ +" ");
					num += n;
			    }else{
			      System.out.print(ch + " ");
				  ch += n;
				}
		    }
			System.out.println();
		
	     }
}

}