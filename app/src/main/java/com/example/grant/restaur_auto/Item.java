
public class Item
{
	private String itemName;
	private String itemDescription;
	private int itemAmount;
	private int noOfItems;
	private double itemPrice;
	
	public Item(String itemName, String itemDescription, int itemAmount, double itemPrice)
	{
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.noOfItems = noOfItems;
	}
	
	public String getItemName()
	{
		return itemName;
	}

	public String getItemDescription()
	{
		return itemDescription;
	}

	public double getItemPrice()
	{
		return itemPrice;
	}

	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	
	public void setItemDescription(String itemDescription)
	{
		this.itemDescription = itemDescription;
	}
	
	public void setItemAmount(int itemAmount)
	{
		this.itemAmount = itemAmount;
	}
	
	public void viewItem()
	{
		System.out.println(itemName);
		System.out.println(itemDescription);
		System.out.println(itemAmount);
	}
}