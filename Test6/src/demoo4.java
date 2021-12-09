import java.util.ArrayList;
import java.util.Scanner;
 
public class demoo4 {
    public static void main(String aa[]) 
    {
//    Object //parent of all the classes
        ArrayList<Studentt> list=new ArrayList<>();//Object
        Studentt s1=new Studentt("sahana", "Present");
        Studentt s2=new Studentt("xyz", "Present");
        Studentt s3=new Studentt("abc", "Present");    
        Studentt s4=new Studentt("xy", "Present");

          list.add(s1);
          list.add(s2);
          list.add(s3);
          list.add(s4);
          for( Studentt s:list)
          {
              System.out.println(s.name+"  "+s.attendence);
          }
}
 
}
 

class Studentt
{
    String name;
    String attendence;
    public Studentt(String name, String attendence) {
        super();
        this.name = name;
        this.attendence = attendence;
    }    
}