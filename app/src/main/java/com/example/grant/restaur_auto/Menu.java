
public class Menu
{
	private String menuName;
	private String menuDescription;
	private int noOfItems;
	private double menuPrice;
	
	public Menu(String menuName, String menuDescription, double menuPrice)
	{
		this.menuName = menuName;
		this.menuDescription = menuDescription;
		this.menuPrice = menuPrice;
		this.noOfItems = noOfItems++;
	}
	
	public Menu(Class<Void> class1) {
		// 
	}

	public void setMenuName(String menuName)
	{
		this.menuName = menuName;
	}
	
	public void setMenuDescription(String menuDescription)
	{
		this.menuDescription = menuDescription;
	}
	
	public void setMenuPrice(double menuPrice)
	{
		this.menuPrice = menuPrice;
	}

	public void viewMenu()
	{
		System.out.println(menuName);
		System.out.println(menuDescription);
		System.out.println(menuPrice);
	}
}