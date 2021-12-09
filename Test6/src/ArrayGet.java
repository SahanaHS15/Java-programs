import java.util.ArrayList;
public class ArrayGet {
public static void main(String[] args) {
ArrayList<Integer> arrlist = new ArrayList<>();
arrlist.add(15);
arrlist.add(22);
arrlist.add(30);
arrlist.add(40);

for (Integer number : arrlist) {
System.out.println("Number = " + number);
}


int retval = arrlist.get(3);
System.out.println("Retrieved element is = " + retval);

arrlist.remove(2);
System.out.println("ArrayList after remove(): " + arrlist);
boolean ans;
ans=arrlist.isEmpty();
if (ans== true)
System.out.println("The ArrayList is empty");
else
System.out.println("The ArrayList is not empty");
}

}