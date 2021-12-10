import java.util.HashMap;
import java.util.Map;public class Map1 { public static void main(String[] args) {
// TODO Auto-generated method stub
HashMap<String,String> map= new HashMap<>();
map.put("color1","red");
map.put("color2","balck");
map.put("color3","pink");
System.out.print("key \t valuey");
for(Map.Entry<String, String> me: map.entrySet()) {
System.out.println(me.getKey()+" and "+me.getValue());
}
}}


