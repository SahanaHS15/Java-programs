public class Electricbill {

	public static void main(String aa[])
    {
    int units=90; // 190= 100+180
    if(units<=50)
    {
        System.out.println("Bill : Rs.0");
    }
    else if(units>50 && units<=100)
    {
        units=(units-50)*6+50;
        System.out.println(units);
    }
    else if(units>101 && units<=150)
    {
        units=(units-100)*8+100;
        System.out.println(units);
    }
    else {
        units=(units-300)*9+150;
        System.out.print(units);
    }

}
}