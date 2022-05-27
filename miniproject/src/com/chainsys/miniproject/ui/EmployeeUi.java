package com.chainsys.miniproject.ui;
import java.util.Calendar;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class EmployeeUi {
 public static void addNewEmployee()
 {
 Scanner sc = new Scanner(System.in);
 Employee newemp = new Employee();
 System.out.println("Enter employee_Id:");
 String id = sc.nextLine();
      try {
 Validator.checkStringForParseInt(id);
}catch(InvalidInputDataException err) 
      {
   err.printStackTrace();
}
System.out.println("Enter firstName:");
String fname = sc.nextLine();
//validate fname
 try {
Validator.checkStringOnly(fname);
}catch(InvalidInputDataException err) 
 {
 err.printStackTrace();
}
System.out.println("Enter lastName:");
String lname = sc.nextLine();
  try {
   Validator.checkStringOnly(lname);
}catch(InvalidInputDataException err) 
  {
 err.printStackTrace();
 }
    System.out.println("Enter Email:");
    String email = sc.nextLine();
   try {
     Validator.checkEmail(email);
}catch(InvalidInputDataException err)
   {
  err.printStackTrace();
}
Calendar c1 = Calendar.getInstance();
 java.util.Date newDate = c1.getTime();
 newemp.setHire_date(newDate);
 System.out.println("Enter job_Id:");
newemp.setJob_id(sc.nextLine());
System.out.println("Enter salary:");
 newemp.setSalary(sc.nextFloat());
 int result = EmployeeDao.insertEmployee(newemp);
 System.out.println(result);
 sc.close(); 
}
 public static void updateEmployee() {
 java.util.Scanner sc =new java.util.Scanner(System.in); 
 try {
 Employee newemp=new Employee();
 System.out.println("Enter Employee Id :");
 String id=sc.nextLine();

 try {
 Validator.checkStringForParseInt(id);
}catch(InvalidInputDataException err) {
 err.printStackTrace();
return;
}

int empId=Integer.parseInt(id);
   try {
boolean appp = Validator.CheckNumberForGreaterThanZero(empId);
if(appp == false) 
{
throw new InvalidInputDataException("error should be greater then zero");
}
 }catch(InvalidInputDataException err) 
{
  err.printStackTrace();
return;
}
 Employee emp= EmployeeDao.getEmployeeById(empId);
 if(emp==null)
 {
System.out.println("Employee Doesn't Exist For Id "+empId); 
 return ;
}
newemp.setEmp_Id(empId);
System.out.println("Enter First_Name:"); 
 String fName= sc.nextLine();
 //Validate fName 
newemp.setFirst_name(fName);
 System.out.println("Enter Last_Name:");
 newemp.setLast_name(sc.nextLine());
 System.out.println("Enter Email:");
newemp.setEmail(sc.nextLine());
 Calendar c1 =Calendar.getInstance();
java.util.Date newDate =new java.util.Date();
 newemp.setHire_date(newDate);
 System.out.println("Enter Job_id :");
 newemp.setJob_id(sc.nextLine()); 
 System.out.println("Enter Salary:");
newemp.setSalary(sc.nextFloat());
int result =EmployeeDao.updateEmployee(newemp);
System.out.println(result);
}
 finally {
 sc.close();
}
 }
 }
