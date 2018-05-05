package com.example.grant.restaur_auto;

import java.io.Serializable;

public class Employee implements Serializable{
    protected int empID;
    private String name;
    private double payrate;
    private String startdate;
    //private float hoursThisPeriod;
    //private float hoursThisYear;
    {
    	
    }
	public Employee(int empID, String name, double payrate) {
		super();
		this.empID = empID;
		this.setName(name);
		this.payrate = payrate;
		//this.startdate = startdate;
		//this.hoursThisPeriod = hoursThisPeriod;
		//this.hoursThisYear = hoursThisYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    }
