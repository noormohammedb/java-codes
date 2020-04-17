import java.util.Scanner;
public class PositiveOrNegetive{
    public static void main(String com[])
    {
        Scanner s= new Scanner(System.in);
        int a;
        System.out.println("Enter a number to check positive or negetive");
        a = s.nextInt();
        System.out.println(a+"\n");
        if(a<0)
        {
            System.out.println("The Number is Negetive \n");
        }
            else if(a>0)
            {
                System.out.println("The Number is Positive \n");
            }
                else
                {
                    System.out.println("The Number is Zero \n");
                }
        s.close();
    }

}