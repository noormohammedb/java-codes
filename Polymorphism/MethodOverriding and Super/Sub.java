package Super;

public class Sub extends Base
{
    Sub()
    {
        System.out.println("I am Sub Class Constructure ");
    }
    void display()
    {
        System.out.println("I am Sub Class Display Method");
    }
    void CallSuper()
    {
        System.out.println("Called call-super Method");
        super.display();
    }

}