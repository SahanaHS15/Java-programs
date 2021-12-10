import java.util.*;
public class evenoddarray {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
ArrayList<Integer> list=new ArrayList<>();
for(int i=0;i<5;i++)
{
int n=sc.nextInt();
list.add(n);
}
System.out.println(list);
ArrayList<Integer> even=new ArrayList<>();
ArrayList<Integer> odd=new ArrayList<>();
ArrayList<Integer> prime=new ArrayList<>();
for(Integer s:list)
{
if(s%2==0)
even.add(s);
else
odd.add(s);

int p=s;
int r=p-1;
int count=1;
while(r!=0)
{
if(p%r==0)
count++;
r--;
}
if(count==2)
prime.add(s);
}
System.out.println("Even number are: "+even);
System.out.println("Odd number are: "+odd);
System.out.println("Prime number are: "+prime);
}



}