import java.util.Scanner;
public class ArraySmall {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array ");
int n=sc.nextInt();
System.out.println("enter the element of array");
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int small=arr[0];
for(int i=1;i<n;i++)
{
if(small>arr[i])
small=arr[i];
}
System.out.println("Smallest element is: "+small);
}



}