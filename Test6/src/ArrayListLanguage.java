
import java.util.*;
public class ArrayListLanguage {
public static void main(String[] args) {
ArrayList<Language1> list=new ArrayList<>();
Language1 a1=new Language1("Java",9);
Language1 a2=new Language1("Andriod",9);
Language1 a3=new Language1("php",8);
list.add(a1);
list.add(a2);
list.add(a3);
for(Language1 a:list)
{
System.out.println(a.lang+" "+a.marks);
}
}

}



class Language1
{
String lang;
int marks;
public Language1(String lang, int marks) {
super();
this.lang = lang;
this.marks = marks;
}

}