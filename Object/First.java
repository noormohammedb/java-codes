package app;

public class First {
    Second obj = new Second();
    First()
    {
        obj.display();
    }
    void close()
    {
        System.out.println("I am First Class  and iam in close method");
    }
}