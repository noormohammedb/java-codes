package SuperInConstructure;

public class Sub extends Base
{
    Sub()
    {
        System.out.println("i am Sub class no arg constructure");
    }
    Sub(int a)
    {
        super(a);
        System.out.println("i am Sub class and arg constructure a : "+a);
    }

}