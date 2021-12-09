
import java.util.ArrayList;
public class Friends {
public static void main(String args[]) {
//friend name nickname and contact
ArrayList<Friend> list=new ArrayList<>();
Friend f1=new Friend("Thanushree","thanu",5678909);
Friend f2=new Friend("chaithra ","chaithu",890956);
list.add(f1);
list.add(f2);
for(Friend f: list)
{
System.out.println("name is: "+f.name+"\nnick name is: "+f.nickName+"\ncontact is: "+f.contact);
System.out.println("\n");
} //languages
ArrayList<String> l=new ArrayList<>();
l.add("java");
l.add("python");
l.add("php");
l.add("dbms");
l.add("ml");
l.add("c#");
System.out.println("the language list is:"+l);
l.remove("python");
System.out.println("after removing 'python' the language list is:"+l);
} } class Friend{
String name;
String nickName;
int contact;
public Friend(String name, String nickName, int contact) {
this.name=name;
this.nickName=nickName;
this.contact=contact;
}
}

