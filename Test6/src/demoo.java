import java.util.ArrayList;
import java.util.Scanner;
 
public class demoo {
    public static void main(String aa[]) 
    {

        ArrayList<String> list=new ArrayList<>();//Object
        list.add("java");
        list.add("php");
        list.add("python");

        for(String x  : list)
        {
        System.out.println(x);    
        }

    }
}