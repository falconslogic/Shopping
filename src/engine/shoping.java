package engine;
import java.util.Scanner;
/* Customer Shopping 
 *	By Blake Baker
 */
public class shoping {

	public static void main(String[] args) {
	
		Customer customer = new Customer("Blake", "Baker", "123 leftover ln", "Empty");
		//Uses the Customer class to create a customer
		Item sodiePop = new Item("Sprite", "liquid candy", 1);
		Item grain = new Item("Rice", "Minature beans", 3);
		Item water = new Item("Aquafino", "Manly water", .5);
		
		//Uses the Item class to create an Item
		sodiePop.setItemName("Coke"); 
		sodiePop.setItemDescription("Highly liquid candy");
		sodiePop.setItemPrice(1.5);
			
			int question;
		
			Scanner scan = new Scanner(System.in);
			
			
			System.out.println("Would you like to view your profile? \n Please type 1 to view your profile.");
				//Allows customer to view their profile
				question = scan.nextInt();
					
					if (question != (1)){
						System.out.println("OK. Thank you\n");
					}
					else {
						System.out.println("Name: \n"  + customer.getFirstName() + " " + customer.getLastName());
						System.out.println("Your address:" + " " + customer.getAddress() + "\n");
					}
					
			System.out.println("Would you like to see what is in your cart \n Please type 1 to view your cart.");
				//prints the customers entire shopping cart
				question = scan.nextInt();
			
				if (question != (1)){
					System.out.println("OK. Thank you");
				}
				else {
					System.out.println("Your cart consist of:\n" + " " + "Item Name:" + " " + sodiePop.getItemName());
					System.out.println(" Item Description:" + " " + sodiePop.getItemDescription());
					System.out.println(" Item price:" + " " + sodiePop.getItemPrice());
					//prints out the item and description
				}
				scan.close();
			
		System.out.println("\n Thank you for shopping with us!\n");	
			
			
			
	}

}
