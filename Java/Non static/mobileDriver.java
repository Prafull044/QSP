class  mobileDriver
{
	public static void main(String[] args) 
	{
		mobile m1 = new mobile();
		System.out.println(m1.brand);
		System.out.println(m1.price);
		System.out.println(m1.storage);
		System.out.println(m1.ram);
		System.out.println(m1.size);
		
		m1.brand = "Oneplus";
		m1.price = 25000;
		m1.storage = "128 GB";
		m1.ram = " 12 GB";
		m1.size = " 16 * 12 ";
		
		System.out.println("_________________________");
		System.out.println(m1.brand);
		System.out.println(m1.price);
		System.out.println(m1.storage);
		System.out.println(m1.ram);
		System.out.println(m1.size);
		
 		
	}
}