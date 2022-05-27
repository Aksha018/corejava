package com.chainsys.miniproject.entry;

import com.chainsys.miniproject.ui.AppointmentsUI;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUi;

public class Startup {
	public static void main(String[] args) throws Exception {
		loadEmployeeMenu();
		loadDoctorMenu();
		loadAppointmentMenu();

	}

	private static void loadMenu() {
		System.out.println("Enter Menu : 1 is EmployeeMenu,, 2 is Doctor Menu, 3 is Appointment Menu");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				loadEmployeeMenu();
				break;
			case 2:
				loadDoctorMenu();
				break;
			case 3:
				loadAppointmentMenu();
				break;
			}
		} finally {
			sc.close();
		}
	}

	private static void loadEmployeeMenu() {
		System.out.println("Enter Employee Method : 1=addEmployee, 2=updateEmployee");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				EmployeeUi.addNewEmployee();
				break;
			case 2:
				EmployeeUi.updateEmployee();
				break;
			}
		} finally {
			sc.close();
		}
	}

	private static void loadDoctorMenu() {
		System.out.println("Enter Doctor Method : 1=addNewDoctor,2=updateDoctor , 3=deleteDoctor ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				DoctorUi.addNewDoctor();
				;
				break;
			case 2:
				DoctorUi.updateDoctor();
				break;
			case 3:
				DoctorUi.deleteDoctor();
				break;
			}
		} finally {
			sc.close();
		}
	}

	private static void loadAppointmentMenu() {
		System.out.println("Enter Method : 1=addNewAppointment , 2=updateAppointment, 3=deleteAppointment");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int op = sc.nextInt();
			switch (op) {
			case 1:
				AppointmentsUI.addNewAppointment();
				break;
			case 2:
				AppointmentsUI.updateAppointment();
				break;
			case 3:
				AppointmentsUI.deleteAppointment();
				break;
			}
		} finally {
			sc.close();
		}
	}
}
