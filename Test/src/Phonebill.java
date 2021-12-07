public class Phonebill {

    public static void main(String aa[])
    {
    int calls=290; // 190= 100+180
    if(calls<=100)
    {
        System.out.println("Bill : Rs.0");
    }
    else if(calls>100 && calls<=200)
    {
        calls=calls-100;
        System.out.println(calls);
    }
    else if(calls>200 && calls<=300)
    {
        calls=(calls-200)*2+100;
        System.out.println(calls);
    }
    else {
        calls=(calls-300)*3+300;
        System.out.print(calls);
    }
    }
}