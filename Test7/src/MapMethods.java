import java.util.HashMap;
public class MapMethods
{

public static void main(String[] args) {
// TODO Auto-generated method stub
HashMap<String,String> map= new HashMap<>();
map.put("key1","Sahana");
map.put("key2","Dimpi");
map.put("key3","trainee");

System.out.println(map);
map.clear();
System.out.println(map);
map.put("key1","Sahana");
map.put("key2","dimpi");
map.put("key3","trainee");

System.out.println(map.isEmpty());
map.put("key1","Sahana");
map.put("key2","dimpi");
map.put("key3","trainee");

System.out.println(map.keySet());
map.put("key1","Sahana");
map.put("key2","dimpi");
map.put("key3","trainee");
map.remove("key3");
System.out.println(map);
map.put("key1","Sahana");
map.put("key2","dimpi");
map.put("key3","trainee");
System.out.println(map.get("key1"));
map.replace("key1", "Sahana");
System.out.println(map);
System.out.println(map.size());
// clear()
// isEmpty()
// keySet()
// putAll()
// remove()
// containsKey()
// equals()
// get(Object Key)
// replace(key,new value)
// size()



}



}