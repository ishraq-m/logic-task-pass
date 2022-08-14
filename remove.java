import java.util.*;

public class remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using deeleteCharAt() method
		String line, word;
	        Scanner in =  new Scanner(System.in);
	        System.out.println("Enter the string");
	        line = in.nextLine();
	        System.out.println("Enter the charecter to remove from string");
	        word = in.nextLine();
	     
	            line = line.replace(word, "");
	    
	        System.out.println("The string after remove the char is:\n "+line);
	        StringBuilder sb = new StringBuilder(line);
	        String r="";
	        for(int i=0;i<sb.length()-1;i++)
	        {
	        	   if(line.charAt(i)==line.charAt(i))
	                     sb.deleteCharAt(i);
	        	 
	         }
	        
	  
	// using replace method 
		/* String line, word;
		    Scanner in =  new Scanner(System.in);
		    System.out.println("Enter the string");
		    line = in.nextLine();
		    System.out.println("Enter the char to remove from string");
		    word = in.nextLine();

		    
		    line = line.replace(word, "");
		    System.out.println("The string after remove the char is:\n" + line);

		     //Remove sequential repeated characters
		    line = line.replaceAll("(.)\\1{1,}", "$1");
		    System.out.println("After removing repeated character from line:\n" + line);*/
		}
	}
	
	     


