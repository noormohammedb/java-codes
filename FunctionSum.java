import java.util.Scanner;
public class FunctionSum
{
    public static void main(String com[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enert 2 Numbers :");
        int a = s.nextInt();
        int b = s.nextInt();
        FunctionSum cls = new FunctionSum();
        int c = cls.add(a,b);
        System.out.println("Result  : "+c);
        s.close();
    }
    int add(int a, int b)
    {
        return a+b;
    }
}