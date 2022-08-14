
import java.util.*;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			Scanner input = new Scanner(System.in);
			System.out.println("enter the first limit");
			int n1 = input.nextInt();
			System.out.println("enter the second limit");
			int n2 = input.nextInt();
			int f=0;
			for (int i=n1;i<=n2;i++)
			{
			f=0;
			for(int j=1;j<=i;j++)
			{
			if(i%j==0)
			f++;
			}
			if(f==2)
			System.out.print(i +"\t");
			} }
			

	}

