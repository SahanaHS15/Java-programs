import java.util.*;
public class ArrayList2AL 
{
public static void main(String[] args)
{
ArrayList<String> list=new ArrayList<String>();
list.add("sahana");
list.add("yashu");
list.add("keerthi");

ArrayList<String> list1= new ArrayList<String>();
list1.add("def");
list1.add("ghi");
list1.add("jkl");

ArrayList<ArrayList<String>> list2= new ArrayList<>();
list2.add(list);
list2.add(list1);
System.out.println(list2);

}



}