import java.util.Scanner;
public class SumOf2No
{
    public static void main(String com[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 Numbers : ");
        int a,b,c;
        a= s.nextInt();
        b= s.nextInt();
        c = a+b;
        System.out.println("Result : "+c);
        s.close();

    }
}