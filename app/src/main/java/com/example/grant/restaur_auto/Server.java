package com.example.grant.restaur_auto;
import java.util.*;

public class Server extends Employee {

//constructor
	public Server(int empID, String name, double payrate) {
		super(empID, name, payrate);
		// TODO Auto-generated constructor stub
	}
//take order and remove item
	public void Removefromorder(Order order, Item item, int quantity) {
		order.removeItems(item, quantity);
	}
// add item to given order
	public void addToOrder(Order order, Item item, int quantity) {
		while (quantity > 0) {

			order.order.add(item);
			quantity--;
		}
	}
// set order status
	public void setOrdertoServe(Order order) {
		order.setOrderStatus(2);
		System.out.println(getName() + " has served Order #" + order.orderNum);

	}
// set order status
	public void setOrdertoPaid(Order order) {
		order.setOrderStatus(3);
		System.out.println(getName() + " has taken payment for Order #" + order.orderNum);
	}
// set table status
	public void setToDirty(Table t) {
		Table.table.get(t.getTableNum()).setStatus(2);
	}
// create  order
	public Order newOrder(int num, Table table) {
		Order order = new Order(num, table);
		return order;
	}
}

