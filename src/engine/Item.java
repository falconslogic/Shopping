package engine;

public class Item {
	
	private String itemName;
	private String itemDescription;
	private double itemPrice;
	//all the private instance variables 
	
		public Item(String itemName, String itemDescription, double itemPrice) {
			this.itemName = itemName;
			this.itemDescription = itemDescription;
			this.itemPrice = itemPrice;
		}
		//sets the instance variables equal to constructor variables
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
			}
		public String getItemDescription() {
			return itemDescription;
		}
		public void setItemDescription(String itemDescription) {
			this.itemDescription = itemDescription;
			}
		public double getItemPrice() {
			return itemPrice;
		}
		public void setItemPrice(double itemPrice) {
			this.itemPrice = itemPrice;
			}
		public String toString() {
			return itemName + " " + itemDescription + " " + itemPrice; 
		}
		//returns all variables used in class


}
