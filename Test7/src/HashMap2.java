import java.util.*;
import java.util.Map.Entry;
public class HashMap2 {
public static void main(String[] args) {
HashMap<Integer,String> map=new HashMap<>();
map.put(1, "Sahana");
map.put(2, "hij");
map.put(3, "defg");
map.put(4, "siikkl");
System.out.println(map+"\n");

for(Map.Entry<Integer,String> me:map.entrySet())
{
System.out.println(me.getKey()+" and "+me.getValue());
}

HashMap<String,Integer> map1=new HashMap<>();
map1.put("java", 79);
map1.put("php", 60);
map1.put("andriod", 90);

System.out.println("\n"+map1+"\n");

for(Map.Entry<String,Integer> me1:map1.entrySet())
{
System.out.println(me1.getKey()+" and "+me1.getValue());
}

HashMap<String,String> map2=new HashMap<>();
map2.put("color1", "red");
map2.put("color2", "black");
map2.put("color3", "pink");

System.out.println("\n"+map2+"\n");

for(Map.Entry<String, String> me2:map2.entrySet())
{
System.out.println(me2.getKey()+" and "+me2.getValue());
}
}



}