package practiceproject2;
public class Throws
{
    void Division() throws ArithmeticException
    {
        int a=45,b=15,res;
        res = a / b;
        System.out.print("\n\tThe result is : " + res);
    }
     public static void main(String[] args)
    {
      Throws T = new Throws();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd ");
    }
}