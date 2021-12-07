public class Greatestof4 {
	public static void main(String[] args)   
	{  
	  
	int a=60, b=70, c=79, d=90;  
	//comparing numbers, a with b and a with c   
	//if both conditions are true, prints a  
	if(a>=b && a>=c && a>=d)  
	System.out.println(a+" is the largest Number");  
	//comparing b with a and b with c  
	//if both conditions are true, prints b  
	else if (b>=a && b>=c && b>=d)  
	System.out.println(b+" is the largest Number");  
	else if (c>=a && c>=b && c>=d) 
	//prints c if the above conditions are false  
	System.out.println(c+" is the largest number"); 
	else  
		//prints c if the above conditions are false  
		System.out.println(d+" is the largest number");  
	}  

}
