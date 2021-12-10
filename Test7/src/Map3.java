import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Map3 {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String name = null;int id = 0;
HashMap<Integer,String> map= new HashMap<>();

System.out.println("enter number");
int n=sc.nextInt();
for(int i=0;i<n;i++){
System.out.println(" enter the name");
name=sc.next();
map.put(id,name);
id++;

}


System.out.print("key \t value\n");
for(Entry<Integer, String> me: map.entrySet()) {
System.out.println(me.getKey()+" and "+me.getValue());
}
}



}