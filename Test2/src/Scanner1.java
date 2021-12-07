import java.util.Scanner; //1
 
 
public class Scanner1 {

    public static void main(String aa[])
    {
        Scanner scan=new Scanner(System.in);  //2
        System.out.print("Enter character"); //3
        char ch= scan.next().charAt(0);  //4
        System.out.print("Enter name");
        String name=scan.next(); 
        System.out.print(name+"  , "+ch);
}
}