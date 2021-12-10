import java.util.HashMap;
import java.util.Map;

public class Map6 {

public static void main(String[] args) {
// TODO Auto-generated method stub
HashMap<String,Teacher> map= new HashMap<>();
Teacher s1=new Teacher("aptha",1,"1st");
Teacher s2=new Teacher("apt",2,"2nd");
Teacher s3=new Teacher("ap",3,"3rd");
map.put("key1",s1);
map.put("key2",s2);
map.put("key3",s3);

for(Map.Entry<String, Teacher> me: map.entrySet()) {
System.out.println(me.getKey()+" and "+me.getValue());
}
}

}

class Teacher{
String name,price; int id;
public Teacher(String name,int id,String price) {
super();
this.name=name;
this.id=id;
this.price=price;

}
public String toString()
{
return "Bookname:"+name+" id:"+id+" Class:"+price;

}
}