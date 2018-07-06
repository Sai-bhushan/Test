import java.util.Scanner;

public class myCodeDemo {

	public static void main(String[] args) 
	{
		int number;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number you wanted to check :");
		number = num.nextInt();
		num.close();
		
		if(number>0)
		{
			System.out.println(number+ " is positive");
		}
		else if(number<0)
		{
			
			System.out.println(number+ "is negtive");
		}
		
	}

}
