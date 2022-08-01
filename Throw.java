package practiceproject2;
public class Throw
{
    public static void main(String[] args)
    {

        int a=45,b=5,res;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                res = a / b;
                System.out.print("\n\tThe result is : " + res);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\tEnd");
    }
}