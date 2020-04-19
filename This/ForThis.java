package app;
public class ForThis
{
    int a=99,b=88;
    ForThis(int a, int b)
    {
        System.out.println("Before This operation a and b :"+this.a+" "+this.b);
        this.a=a;
        this.b=b;
        System.out.println("After This operation a and b :"+this.a+" "+this.b);
    }
    void display(int c, int d)
    {
        System.out.println("in display metho b and d :"+c+" "+d);
        System.out.println("in display metho a and b :"+a+" "+b);
    }
}