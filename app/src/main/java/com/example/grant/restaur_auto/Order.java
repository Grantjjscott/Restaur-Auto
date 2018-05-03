import java.util.*;

public class Order
{
	LinkedList<Item> order = new LinkedList<Item>();
	public int status = 0 ; // 0= received, 1= prepared, 2 = served, 3 = paid 
	
	public int orderNum;
	public Table table; 
	
	
	public Order()
	{
		
	}
	
	public Order(int orderNum, Table table)
	{
	
		this.orderNum = orderNum;
		this.table= table;
		this.order = new LinkedList<Item>();
	}
	
	
	public  void printItems() {
	int i = 0;
		while  (i < order.size()){
			System.out.println(order.get(i).getItemName());
			i++;
		}
		
	}
	public void removeItems(Item item, int quantity) {
		while (quantity > 0 ) {
			order.removeFirstOccurrence(item);
			quantity--;
		}
	}
	
	public void generateReceipt() {
		System.out.println("Item             Price");
		double subtotal = 0;
		double taxrate = .06;
		double total = 0;
		double tax =0;
		int i = 0;
		while (i < order.size()){
			subtotal = subtotal + order.get(i).getItemPrice();
			System.out.println(order.get(i).toString());
			i++;
		}
		System.out.println("Subtotal:  " + subtotal);
		tax   = subtotal * taxrate;
		total = subtotal + tax; 
		System.out.println("Tax:       " + tax);
		System.out.println("Total:     "+ total);
	}
	
	@Override
	public String toString() {
		return "Order [status=" + status + ", orderNum=" + orderNum + ", table=" + table + "]";
	}

	public int getOrderNum()
	{
		return orderNum;
	}
	
	public int getOrderStatus()
	{
		return status;
	}
	
	public void setOrderStatus(int status)
	{
		this.status = status;
	}
	
	public void setOrderNum(int orderNum)
	{
		this.orderNum = orderNum;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	
	}
	
		

