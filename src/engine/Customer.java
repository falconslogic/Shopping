package engine;
/* Customer Shopping 
 *	By Blake Baker
 */
public class Customer {
	
	private String firstName;
	private String lastName;
	private String address;
	private String cart;
	//all the private instance variables 

	public Customer(String firstName, String lastName, String address, String cart) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.cart = cart;
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
	public String getCart() {
		return cart;
	}
	public void setCart(String cart){
		this.cart = cart;
		}
	public String toString() {
		return firstName + " " + lastName + " " + address + " " + cart;
	}
	//returns all variables used in class
}
