import java.util.ArrayList;
import java.util.Scanner;



public class Book {



public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String name = null;int id = 0,price = 0;String author = null;
ArrayList<Books> list=new ArrayList<>();
System.out.println("enter number of book");
int n=sc.nextInt();
for(int i=0;i<n;i++){
System.out.println(" enter the name,id,price,author of book");
name=sc.next();

id=sc.nextInt();
price=sc.nextInt();
author=sc.next();
Books s=new Books(name,id,price,author);
list.add(s);

}



System.out.println("name\t id 1\t price \t author \t");
for(Books s:list) {
System.out.println(s.name+" \t"+s.id+"\t "+s.price+" \t"+s.author);
}
}



}
class Books{
String name;int id,price;String author;
public Books(String name,int id,int price,String author) {
super();
this.name=name;
this.id=id;
this.price=price;
this.author=author;
}
}