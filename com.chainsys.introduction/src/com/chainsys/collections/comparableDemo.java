package com.chainsys.collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class comparableDemo {


	public static void main(String[] args) {
		SortComparebleEmp();
		
	}
public static void compareEmp()
{
	Emp e1 = new EmpComparable(100);
	e1.Name = "Sam";
	Emp e2 = new EmpComparable(200);
	e2.Name = "Musk";
	Emp e3 = new EmpComparable(300);
	e3.Name = "Jobs";
	List<EmpComparable> empList = new ArrayList();
	empList.add(e3);
	emplist.add(e2);
	empList.add(e1);
	System.out.println(empList);
	System.out.println(empList);
}
public static void SortComparebleEmp()
{
	Emp e1=new EmpComparable(100);
	e1.Name = "Sam";
	Emp e2=new EmpComparable(200);
	e2.Name = "Musk";
	Emp e3=new EmpComparable(300);
	e3.Name = "Jobs";
	List<EmpComparable> empList = new ArrayList<>();
	empList.add(e3);
	emplist.add(e2);
	empList.add(e1);
	//System.out.println(empList);
     Iterator<EmpComparable> emp_iterator=empList.iterator();
     while(emp_iterator.hasNext())
     {
    	 System.out.println(emp_iterator.next().getID());
     }
     Collections.sort(empList);
     System.out.println("-------");
     emp_iterator=empList
	
}

}
