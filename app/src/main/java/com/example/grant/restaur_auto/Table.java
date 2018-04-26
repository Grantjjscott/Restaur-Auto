import java.util.*;

public class Table
{
	int tableNum = 0;
	int numOfSeats = 0;
	String status = "unoccupied";
	static LinkedList<Table> table = new LinkedList<Table>();
	

	public Table (int tableNum, int numOfSeats, String status)
	{
		this.tableNum = tableNum;
		this.numOfSeats = numOfSeats;
		this.status = status;
	}
	
	public Table()
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
	
	public void setStatus(String status)
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
	
	public String getStatus()
	{
		return status;
	}
	
	public void addTable(int tableNum, int numOfSeats)
	{
		Table t = new Table(tableNum, numOfSeats, "Unoccupied");
		table.add(t);
	}
	
	public void removeTable(Table t)
	{
		table.remove(table.indexOf(t));
	}
	
	//didn't implement merge table
}
