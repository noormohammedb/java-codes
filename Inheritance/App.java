package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("I am Main Method In App Class");
        Sub obj = new Sub();
        obj.DisplaySub();
        System.out.println("Variable  b of Sub class : "+obj.b);
        obj.DisplayBase();
        System.out.println("Variable  b of Sub class : "+obj.a);
    }
}