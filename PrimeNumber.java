package week1.day1.assignments;

public class PrimeNumber {
	
	public static void main(String[] args)
	{
		int a=13;
		boolean flag=true;
		int b=a/2;
		
		for(int i=2;i<=b;i++)
		{
			if(a%i==0)
					{
				System.out.println(a+"is not prime number");
				flag= false;
				break;
			
		}
			if(flag==true)
			{
				System.out.println(a+"is prime number");
			}
		}
		
	}

}
