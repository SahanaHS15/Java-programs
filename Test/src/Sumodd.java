public class Sumodd {
	public static void main(String[] args) 
	{
		int  i, oddSum = 0;
		for(i = 1; i <= 50; i++)
		{
			if(i % 2 != 0)
			{
				oddSum = oddSum + i; 
			}
		}
		System.out.println("\n The Sum of Odd Numbers upto 50 is:  "  + oddSum);
	}

}