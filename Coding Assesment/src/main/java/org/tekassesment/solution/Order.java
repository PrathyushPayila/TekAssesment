package org.tekassesment.solution;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<OrderLine> orderLines;
	
	public Order()                         // Intialize orderlines
	{
		this.orderLines=new ArrayList<>();
	}
	
	public Order(Order o)                   //copy contructor
	{
		this.orderLines=new ArrayList<>(o.orderLines);
	}

	public void add(OrderLine o) throws Exception {
		if (o == null) {
			System.err.println("ERROR - Order is NULL");
			throw new IllegalArgumentException("Order is NULL");
		}
		orderLines.add(o); 
	}

	public int size() {
		return orderLines.size();
	}

	public OrderLine get(int i) {
		return orderLines.get(i);
	}

	public void clear() {
		this.orderLines.clear();

	}
}
