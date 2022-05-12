package com.chainsys.classmethods;
/**
 * 
 * @author aksh3106
 *
 */
public class employee {
	private final int empID;
	private String name;
	private String city;
	private long salary;
	//constructor
	public employee(int id)
	{
		this.empID=id;
	}
    public String getName()
    {
    	return name;
    }
    public void setName(String name)
    {
    	this.name = name;
    }
    public int getempID()
    {
    	return empID;
    }
    public String getCity() {
    return city;
    }
    public void setCity(String city)
    {
    	this.city = city;
    }
    public long getsalary()
    {
    	return salary;
    }
  public void setsalary(long salary)
  {
	  this.salary = salary; 
  }
  }



