package practicephase1;
import java.util.*;
import java.util.regex.*;

public class EmailValidation
{
	 public static void main(String args[])
	 {  
         ArrayList<String> emails = new ArrayList<String>();  
         emails.add("abcd@domain.co.in");  
         emails.add("abcd@domain.com");  
         emails.add("abcd.name@domain.com");  
         emails.add("abcd#@domain.co.in");  
         emails.add("abcd@domain.com");  
         emails.add("abcd@domaincom");  
           
         emails.add("@yahoo.com");  
         emails.add("abcd#domain.com");  

         String regex = "^(.+)@(.+)$";  
         
         Pattern pattern = Pattern.compile(regex);  
         
         for(String email : emails)
         {  
               
             Matcher matcher = pattern.matcher(email);  
             System.out.println(email +" : "+ matcher.matches()+"\n");  
         }  
     }  

}
