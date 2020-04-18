// package Test-Class;
public class ClassSample
{
    public static void main(String com[])
    {
        System.out.println("Hello java");
        Sample o1 = new Sample();
        Sample o2 = new Sample();
        
        System.out.println("Object no 1");
        o1.a=73;
        o1.b=56;
        o1.display();

        System.out.println("Object no 2");
        o2.a=74;
        o2.b=16;
        o2.display();
    }
}