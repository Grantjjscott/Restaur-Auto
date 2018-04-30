import java.util.*;

public class Server extends Employee 
{

	public Server(int empID, String name, double payrate) {
		super(empID, name, payrate);
		// TODO Auto-generated constructor stub
	}

	public void addOrder(String status, int orderNum)
	{
		Order order = new Order(status, orderNum);
		Order.order.add(order);
	}
	
	public void changeOrder(Order o)
	{
		Order.order.set(o.getOrderNum(), o );
	}
	
	public void removeOrder(Order o)
	{
		Order.order.remove(o.getOrderNum());
	}
	
//	public void setOrdertoServed(int orderNum)
//{
//	Order.order.get(orderNum-1).setOrderStatus("Served");
//}
	
	public void setToDirty(Table t)
	{
		Table.table.get(t.getTableNum()).setStatus("dirty");
	}
}
