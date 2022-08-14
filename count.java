import java.util.*;

public class count {

   
    	    public static int count(String s, char c)
    	    {
    	        int res = 0;
    	 
    	        for (int i=0; i<s.length(); i++)
    	        {
    	            // checking character in string
    	            if (s.charAt(i) == c)
    	            res++;
    	        }
    	        return res;}
    	    
    	     
    	    // Driver method
    	    public static void main(String args[])
    	    {
    	    	Scanner in =  new Scanner(System.in);
    	        System.out.println("Enter the string");
    	      String  str = in.nextLine();
    	        System.out.println("Enter the charecter to count in string");
    	        in.useDelimiter("");
    	        char c = in.next().charAt(0);
    	        /*while (in.hasNext())
    	        {
    	          char c = in.next().charAt(0);
    	          if (c == '\n') {
    	            return;
    	            }*/
    	       
    	        System.out.println(count(str, c));
    	    }
    	}