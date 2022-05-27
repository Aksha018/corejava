package com.chainsys.doctorproject.entry;
import com.chainsys.miniproject.ui.AppointmentsUI;
import com.chainsys.miniproject.ui.DoctorUI;

public class Startup {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("1.To Operation with doctor details");
		System.out.println("2.To Operation with Appointment details");
		int operation=sc.nextInt();
		switch(operation) {
		case 1:
			DoctorUI.doctorOperations();
			break;
		case 2:
			AppointmentsUI.AppointmentOperation();
			break;
		default:
			System.out.println("enter valid number! please try again!");
		}
		sc.close();
	}

}

