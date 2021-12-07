public class Sumeven {

	public static void main(String[] args) 
	{
		int  i, evenSum = 0, n=100;
		
		
		
		
		for(i = 1; i <= 100; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
		}
		System.out.println("\n The Sum of Even Numbers upto 100 is : "  + evenSum);
	}
}