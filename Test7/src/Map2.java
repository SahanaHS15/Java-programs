import java.util.HashMap;
import java.util.Map;public class Map2 { public static void main(String[] args) {
// TODO Auto-generated method stub
HashMap<String,String> map= new HashMap<>();
map.put("java","79");
map.put("php","60");
map.put("android","90");
System.out.print("key \t value\n");
for(Map.Entry<String, String> me: map.entrySet()) {
System.out.println(me.getKey()+" and "+me.getValue());
}
}}
