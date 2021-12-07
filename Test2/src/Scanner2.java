import java.util.Scanner; 
public class Scanner2 {

    public static void main(String aa[])
    {
        Scanner scan=new Scanner(System.in);  
        System.out.print("Enter first no");
        int num1= scan.nextInt();  //4
        System.out.print("Enter second no");
        int num2=scan.nextInt();
        System.out.print("Addition :"+(num1+num2));
}
}