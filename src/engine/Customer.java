package engine;

/*  Customer Shopping 
 *	 By Blake Baker
 */
public class Customer {
	
	
	private String firstName;
	private String lastName;
	private String address;
	private ShoppingCart cart;
	//all the private instance variables 

	public Customer(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		cart = new ShoppingCart();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
		}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;	
		}
	public ShoppingCart getCart() {
		return cart;
		} 
	
		
	public String toString() {
		return firstName + " " + lastName + " " + address;
	}
	//returns all variables used in class 
}
