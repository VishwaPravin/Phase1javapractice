package practicephase1;

import java.util.*;  
public class Collection
{
    public static void main(String args[])
    {  
    ArrayList<String> list=new ArrayList<String>();
    list.add("Java");  
    list.add("Eclipse");  
    list.add(".net");  
    list.add("url");  
    //Traversing list through Iterator  
    Iterator<String> itr=list.iterator();  
    while(itr.hasNext())
    {  
       System.out.println(itr.next());  
    }  
    }  
}
