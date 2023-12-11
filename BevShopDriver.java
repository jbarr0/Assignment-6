import java.util.Scanner;

public class BevShopDriver {

	public static void main(String[] args) {
			
		BevShop bevShop = new BevShop();
		String name;
		int age;
		Scanner scan = new Scanner(System.in);
		
		bevShop.startNewOrder(10, Day.MONDAY, "Jason", 21);
		
		System.out.println("The current order in process can have at most "+ bevShop.getMaxOrderForAlcohol()+" alcoholic beverages\nThe minimum age to order alcohol drink is " + bevShop.getMinAgeForAlcohol());
		
		
		
		System.out.println("Start please a new order: ");
		System.out.print("Would you please enter your name: \n");
		name =scan.next();
		
		System.out.print("Would you please enter your age: \n");
		age = scan.nextInt();
		bevShop.startNewOrder(10, Day.MONDAY, name, age);
		if(bevShop.isValidAge(age));
			System.out.println("Your age is above 20 and you are eligible to order alcohol\nWould you please order an alcohol drink");
		bevShop.processAlcoholOrder("JackDaniels", Size.SMALL);
		System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
		System.out.println("The Total price oon the Order is " + bevShop.getCurrentOrder().calcOrderTotal());
		System.out.println("Your alcohol drink order is less than 4\nWould you please add a second alcohol drink");
		bevShop.processAlcoholOrder("FireBall", Size.SMALL);
		System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
		System.out.println("The Total price oon the Order is " + bevShop.getCurrentOrder().calcOrderTotal());
		System.out.println("Your alcohol drink order is less than 4\nWould you please add a third alcohol drink");
		bevShop.processAlcoholOrder("IceSpice", Size.LARGE);
		System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
		System.out.println("The Total price oon the Order is " + bevShop.getCurrentOrder().calcOrderTotal());
		System.out.println("You have a maximun of 3 drinks for this order\nWould you please add a COFFEE to your order: ");
		bevShop.processCoffeeOrder("Latte", Size.LARGE, false, false);
		System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
		System.out.println("The Total price oon the Order is " + bevShop.getCurrentOrder().calcOrderTotal());

		

		
		

		
	}

}
