package com.example.grant.restaur_auto;

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
		Cook   cook01  =  new Cook(02, "Pam", 15.00); 
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
		Table tab01 = new Table(01, 2, 0);
		LinkedList<Table> tables = new  LinkedList<Table>();
		tables.add(tab01);
		
		// ORder
		Order order01 = new Order(01, tab01); 
		server01.addToOrder(order01, item01, 2);
		server01.addToOrder(order01, item02, 2);
		server01.addToOrder(order01, item03, 2);
		System.out.println(order01.toString());
		order01.printItems();
		//server01.Removefromorder(order01, item01, 2);
		order01.printItems();
		// serving
		cook01.SetordertoPrepared(order01);
		server01.setOrdertoServe(order01);
		server01.setOrdertoPaid(order01);
		
		order01.generateReceipt();
		
		
		
		
		
	 }
		 
	 
	}


