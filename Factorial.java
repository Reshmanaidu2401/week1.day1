package week1.day1.assignments;

public class Factorial {
  
	public static void main(String[] args)
	{
		int num= 5;
		int i;
		int fact=1;
		
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		
		}
		System.out.println("Factorial of 5 =" +fact);
	}
}
