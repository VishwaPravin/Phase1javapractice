package practiceproject2;
public class TryCatch
{
    public static void main(String args[]) 
    {
        int[] array = new int[1];
        try 
        {
            array[10] = 1;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
    }
}