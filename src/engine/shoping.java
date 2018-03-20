package engine;
import java.util.Scanner;

public class shoping {

	public static void main(String[] args) {
	
		Customer customer = new Customer("Blake", "Baker", "123 leftover ln", "grain");
	
			int question;
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Would you like to view your profile? \n Please type 1 to view your profile.");
				//Allows customer to view their profile
				question = scan.nextInt();
					
					if (question != (1)){
						System.out.println("OK. Thank you");
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
					System.out.println("Your cart consist of:" + " " + customer.getCart());
				}
				scan.close();
			System.out.println("\n Thank you for shopping with us!");	
	}
}
