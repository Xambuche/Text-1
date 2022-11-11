import java.util.Scanner;

public class Bt2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter height:");
        int height=sc.nextInt();
        System.out.print("Enter base:");

        int base=sc.nextInt();
        
       float area=0.5f*height*base;

        System.out.println(area);
    }
}
//Update Bt2