
import java.util.*;
public class Inheritance4 { public static void main(String[] args) {
Transaction t=new Transaction();
BalanceInquiry b=new BalanceInquiry();
Withdrawal w=new Withdrawal();
Deposit d=new Deposit();
int acc=t.AccountNumber();
t.execute();
b.execute();
w.execute();
d.execute();
}}
class Transaction
{
Scanner sc=new Scanner(System.in);
int accNum;
double balance=10000;
int AccountNumber()
{
System.out.println("Enter the Account Number");
accNum=sc.nextInt();
return accNum;
}
void execute() {
System.out.println("Account Number is: "+accNum);
}
}class BalanceInquiry extends Transaction
{
void execute()
{
System.out.println("Balance is: "+balance);
}
}
class Withdrawal extends Transaction
{
double amount;
double total;
void execute()
{
System.out.println("Enter the amount to withdraw: ");
amount=sc.nextDouble();
total=balance-amount;
System.out.println("total amount is: "+total);
}
}class Deposit extends Transaction
{
double amount;
double total;
void execute()
{
System.out.println("Enter the amount to deposit: ");
amount=sc.nextDouble();
total=balance+amount;
System.out.println("total amount is: "+total);
}
}

