package org.tekassesment.solution;


/*
 * represents an order line which contains the @link Item and the quantity.
 *
 */

public class OrderLine {

	private int quantity;
	private Item item;
	

	/*
	 * @param item Item of the order
	 * 
	 * @param quantity Quantity of the item
	 */
	public OrderLine(Item item, int quantity) throws Exception {
		if (item == null) {
			System.err.println("ERROR - Item is NULL");
			throw new Exception("Item is NULL");
		}
		assert quantity > 0;
		this.item = item;             //for referencing the current object's item
		this.quantity = quantity;     //for referencing the current object's quantity
	}

	public Item getItem() {
		return item;
	}

	public int getQuantity() {
		return quantity;
	}
}