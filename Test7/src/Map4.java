import java.util.HashMap;
import java.util.Map;
public class Map4 {
public static void main(String[] args) {
// TODO Auto-generated method stub
HashMap<String,Book> map= new HashMap<>();
Book s1=new Book("The holy bible",1,1000);
Book s2=new Book("The great gatsby",2,850);
Book s3=new Book("To kill a mockingbird",3,700);
map.put("key1",s1);
map.put("key2",s2);
map.put("key3",s3);

for(Map.Entry<String, Book> me: map.entrySet()) {
System.out.println(me.getKey()+" and "+me.getValue());
}
}
}

class Book{
String name; int id,price;
public Book(String name,int id,int price) {
super();
this.name=name;
this.id=id;
this.price=price;

}
public String toString()
{
return "Bookname:"+name+" id:"+id+" price:"+price;

}
}