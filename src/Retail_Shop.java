
public class Retail_Shop {

	public static void main(String[] args) {
		int a=200,b=75,c=500;
		double price;
		
		price = ((a*2)+b+(c*3));
		price = price-(0.1-price);
		price=price+(0.5*price);
		System.out.println(price); 
		
		if(price>=2000)
		{
			System.out.println("COngrats you have discount");
		}
		
		else
		
		{
			System.out.println("Sorry");
		}
		
		}

}
