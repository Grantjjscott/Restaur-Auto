import java.util.*;

public class Order
{
	static LinkedList<Order> order = new LinkedList<Order>();
	public String status;
	public int orderNum;

	public Order()
	{
		
	}
	
	public Order(String status, int orderNum)
	{
		this.status = status;
		this.orderNum = orderNum;
	}
	
	public int getOrderNum()
	{
		return orderNum;
	}
	
	public String getOrderStatus()
	{
		return status;
	}
	
	public void setOrderStatus(String status)
	{
		this.status = status;
	}
	
	public void setOrderNum(int orderNum)
	{
		this.orderNum = orderNum;
	}

		
}
