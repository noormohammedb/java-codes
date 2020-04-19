package String;

import java.util.Scanner;

public class app 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a text : ");
        Scanner scan = new Scanner(System.in);
        String cha;
        cha = scan.next();
        System.out.println("text : "+cha);
        scan.close();
    }

}