 package engine;
 import java.util.*;


 
public class ShoppingCart {
	
	private Item item;
	private ArrayList<Item> cart = new ArrayList<Item>();

	public void addItem(Item item){
		cart.add(item);
		//adds a single item to the array
		}
	public void removeItem(Item item){
		cart.remove(item);
		//removes a single item from the array
		}
	public void flushCart(){
		cart.clear();
		//removes all item from the array
		}
	public double calculateT(){
		double value = 0;
		int length = 0;
		while(cart.size() > length) {
			 value += cart.get(length).getItemPrice();
			 length++;
		}
		return value;
		//adds the total cost of all items in the array
		}
	
	 public String toString() {
		return cart.toString();
		}
		
			
		 //returns all Items in the cart
	 
}
	
	

		
			



	
