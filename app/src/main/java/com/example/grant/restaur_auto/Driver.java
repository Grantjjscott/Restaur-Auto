import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Driver {
	static File emps = new File("emp.txt");
	static File items = new File("items.txt");
	public static void main(String[] args) throws FileNotFoundException {
		// generated employees
		Server server01 = new Server(01, "Nate", 7.25);
		// generated items
		
		Item item01 = new Item("Hot Dog", null, 99, 2.5); 
		Item item02= new Item("French Fries", null, 99, 2.50);
		Item item03= new Item ("Soft Drink", null, 99, 1.00);
		// menu
		Menu2 menu = new Menu2(); 
		menu.add(item01);
		menu.add(item02);
		menu.add(item03);
		System.out.println(menu.get(0));
		
		//Table
		Table tab01 = new Table(01, 2, "unoccupied");
		LinkedList<Table> tables = new  LinkedList<Table>();
		tables.add(tab01);
		
		
		
		
		
		
	 }
		 
	 
	}


