import java.util.Scanner;
public class Main{
    // void get_array(int size, int array[][]);
    // void display(int size, int array[][]);
    // void add_array(int size, int array_1[][], int array_2[][]);
    public static void main(String com[])
    {
        Main obj = new Main();
        System.out.println("\nEnter size of array : ");
        Scanner sca = new Scanner(System.in);
        int size = sca.nextInt();
        int[][] array_1 = new int[size][size];
        int[][] array_2 = new int[size][size];
        System.out.println("\nEnter first array elements : \n");
        obj.get_array(size,array_1);
        System.out.println("\nelements of first array as follows");
        obj.display(size,array_1); 

        System.out.println("\nEnter Second array elements : \n");
        obj.get_array(size,array_2);
        System.out.println("\nelements of first array as follows");
        obj.display(size,array_2); 
        System.out.println("result : \n");
        obj.add_array(size,array_1,array_2);
        sca.close();
    }
     void get_array(int size,int[][] array){
        int i,j;
        Scanner scr = new Scanner(System.in);
        for (i=0;i<size;i++)
        {
            for (j=0;j<size;j++)
            {
                 array[i][j] = scr.nextInt();
            }
        }
    }
    void display(int size,int[][] array){
        int i,j;
        for (i=0;i<size;i++)
        {
            System.out.println("\n");
            for (j=0;j<size;j++)
            {
                System.out.print(array[i][j]+"    ");
            }
        }
        System.out.println("\n");
    }
    void add_array(int size, int[][] array_1, int[][] array_2){
        int i,j;
        for (i=0;i<size;i++)
        {
            System.out.println("\n");
            for (j=0;j<size;j++)
            {
                System.out.print(array_1[i][j]+array_2[i][j]);
                System.out.print("    ");
            }
        }
        System.out.println("\n");
    }
}