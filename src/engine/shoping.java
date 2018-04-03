package engine;
import java.util.*;

/* Customer Shopping 
 *	By Blake Baker
 *   A work of art
 */
public class shoping {

	public static void main(String[] args) {
		
		//Scanner scanner = new Scanner(System.in);
		//int question;
		//question = scanner.nextInt();
		//Initializes the scanner and question
		
		
		Customer customer = new Customer("Blake", "Baker", "radway");
		
		Item sodiePop = new Item("Sprite", "liquid candy", 1.00);
		Item grain = new Item("Rice", "Minature beans", 3.50);
		Item water = new Item("Aquafino", "Manly water", .59);
		
		int question = 0;
		Scanner scan = new Scanner(System.in);
		int leave = 0;
		// sets up the 2 ints used throughout the while loop and switch statements
		
		while(leave != 9) {
			
			
			System.out.println("To see profile, press 1");
			System.out.println("To see cart, press 2");
			System.out.println("To see total, press 3");
			System.out.println("To remove item, press 4");
			System.out.println("To add item, press 5");
			System.out.println("To flush cart, press 6");
			//creates a system of questions to be answered 
			
			//next is the switch statement frenzy
			//uses the question and scanner to do what is needed to the cart
			question = scan.nextInt();
				switch (question) {
					case 1:System.out.println(customer);
						break;
					case 2:System.out.println(customer.getCart());
						break;
					case 3:System.out.println(customer.getCart().calculateT());
						break;
					case 4:{
						System.out.println("Water press 3\n Soda press 4\n Grain press 5");
						switch (question) {
							case 3:customer.getCart().removeItem(water);
								break;
							case 4:customer.getCart().removeItem(sodiePop);
								break;
							case 5:customer.getCart().removeItem(grain);
								break;
						}
					}
						break;
						
					case 5:{
						System.out.println("Water press 3\n Soda press 4\n Grain press 5");
						switch (question) {
							case 3:customer.getCart().addItem(water);
								break;
							case 4:customer.getCart().addItem(sodiePop);
								break;
							case 5:customer.getCart().addItem(grain);
								break;
						}
					}
						break;
					case 6:customer.getCart().flushCart();
						break;
				}	
				System.out.println("Press 9 to leave the shopping spree");
				leave = scan.nextInt();
		}
		
		scan.close();
	}
}
