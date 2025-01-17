package org.tekassesment.solution.test;

import java.util.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tekassesment.solution.Calculator;
import org.tekassesment.solution.Item;
import org.tekassesment.solution.Order;
import org.tekassesment.solution.OrderLine;

public class OrderUnitTests {
	
	
	Order c1;
	Map<String, Order> o;
	Item item,item1,item2;
	OrderLine orderLine,orderLine1,orderLine2;
	Order order;

	@Before
	public void setup() throws Exception{
		o = new HashMap<String, Order>();
		item = new Item("Book",10.0f);
		orderLine = new OrderLine(item,2);
		
		c1 = new Order();

		c1.add(new OrderLine(new Item("book", (float) 12.49), 1));
		c1.add(new OrderLine(new Item("music CD", (float) 14.99), 1));
		c1.add(new OrderLine(new Item("chocolate bar", (float) 0.85), 1));

		o.put("Order 1", c1);

		item1 = new Item("Book",10.0f);
		item2 = new Item("Perfume",20.0f);
		orderLine1 = new OrderLine(item1,2);
		orderLine2 = new OrderLine(item2,4);
		order = new Order();
    }
	
	@Test
	public void roundingEqualTest(){
		Assert.assertEquals(8.24, Calculator.rounding(8.2365),0);
	}
	@Test
	public void roundingNotEqualTest(){
		Assert.assertNotEquals(8.23, Calculator.rounding(8.2365),0);
	}
	
	@Test
	public void getDescriptionTest(){
		Assert.assertEquals("Book",item.getDescription());
	}
	
	@Test
	public void getPriceTest(){
		Assert.assertEquals(10.0, item.getPrice(), 0.0);
	}
	
	@Test
	public void orderLineNotNullExceptionTest() throws Exception{
		order.add(orderLine1);
		order.add(orderLine2);
	}

	@Test
	public void orderSizeTest() throws Exception{
		order.add(orderLine1);
		order.add(orderLine2);
		Assert.assertEquals(2,order.size(),0);
	}	
	
	@Test
	public void getQuantityTest(){
		Assert.assertEquals(2, orderLine.getQuantity());
	}

}
