public class Bt3 
{
    public static double F2C(double value)
    {
       return (value -32)/1.8; 
    }
    public static double C2F(double value)
    {
        return (value*1.8)+32;
    }
    public static void main(String[]args)
    {
    System.out.println(C2F(100));
    System.out.println(F2C(100));

    double x=C2F(100);
    double y=F2C(x);

    System.out.println(y);
    }
}
