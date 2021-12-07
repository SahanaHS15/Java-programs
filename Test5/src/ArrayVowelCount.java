
import java.util.Scanner;
public class ArrayVowelCount {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array character ");
int n=sc.nextInt();
System.out.println("enter the element of array character");
char arr[]=new char[n];
int count=0;
for(int i=0;i<n;i++)
{
arr[i]=sc.next().charAt(0);
}
for(int i=0;i<n;i++)
{
if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
count++;
}
System.out.println("number of vowels in array : "+count);
}



}