package com.example.grant.restaur_auto;
import java.io.Serializable;
import java.util.*;


public class Table implements Serializable
{
	int tableNum;
	int numOfSeats;
	int status = 0;// 0 = uncoppuied, 1 = in use// 2 == dirty
	static LinkedList<Table> table = new LinkedList<Table>();
	

	public Table (int tableNum, int numOfSeats, int status)
	{
		this.tableNum = tableNum;
		this.numOfSeats = numOfSeats;
		this.status = status;
	}
	
	public Table(int i, int i1)
	{
		
	}
	
	public void setTableNum(int tableNum)
	{
		this.tableNum = tableNum;
	}
	
	public void setNumOfSeats(int numOfSeats)
	{
		this.numOfSeats = numOfSeats;
	}
	
	public void setStatus(int status)
	{
		this.status = status;
	}
	
	public int getTableNum()
	{
		return tableNum;
	}
	
	public int getNumOfSeats()
	{
		return numOfSeats;
	}
	
	public int getStatus()
	{
		return status;
	}
	
	public void addTable(int tableNum, int numOfSeats)
	{
		Table t = new Table(tableNum, numOfSeats, 0);
		table.add(t);
	}
	
	public void removeTable(Table t)
	{
		table.remove(table.indexOf(t));
	}


	@Override
	public String toString() {
		String tableString;
		if(getStatus() == 0)
			tableString =  ("Table Number: " + getTableNum()+ "\nNumber of Seats: " + getNumOfSeats() +  "\nStatus: Unoccupied");
		else
			tableString =  ("Table Number: " + getTableNum()+ "\nNumber of Seats: " + getNumOfSeats() +  "\nStatus: Occupied");
		return tableString ;
	}
//didn't implement merge table
}
