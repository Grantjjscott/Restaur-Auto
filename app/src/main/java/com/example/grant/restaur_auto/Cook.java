package com.example.grant.restaur_auto;
public class Cook extends Employee {

	public Cook(int empID, String name, double payrate) {
		super(empID, name, payrate);
		// TODO Auto-generated constructor stub
	}
	public void SetordertoPrepared(Order order){
		order.setOrderStatus(1);
		System.out.println(getName() +" has finished Order #" +order.orderNum);
	}
}
