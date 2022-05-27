package com.chainsys.miniproject.ui;

import java.util.Calendar;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.pojo.Appointment;

public class AppointmentsUI {
	public static void addNewAppointment() {
		Scanner sc = new Scanner(System.in);
		Appointment newapp = new Appointment();
		System.out.println("Enter Appointment_Id:");
		String id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		System.out.println("Enter the Appointment_Date");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		newapp.setApp_date(newDate);
		System.out.println("Enter the Doctor_Id: ");
		String id1 = sc.nextLine();

		try {
			Validator.checkStringForParseInt(id1);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		System.out.println("Enter the patient_name: ");

		String name = sc.nextLine();
		// validate name
		try {
			Validator.checkStringOnly(name);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		System.out.println("Enter the fees_collected: ");
		newapp.setFees_collected(sc.nextInt());
		int result = AppointmentsDao.insertAppointment(newapp);
		System.out.println(result);
		sc.close();
	}

	public static void updateAppointment() {
		Scanner sc1 = new Scanner(System.in);
		Appointment newapp = new Appointment();
		System.out.println("Enter Appointment_Id:");
		String id1 = sc1.nextLine();
		newapp.setApp_id(Integer.parseInt(id1));
		try {
			Validator.checkStringForParseInt(id1);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newapp.setApp_id(0);

		System.out.println("Enter the Appointment_Date");
		String id2 = sc1.nextLine();
		newapp.setApp_id(Integer.parseInt(id2));
		try {
			Validator.checkStringForParseInt(id2);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newapp.setApp_date(null);
		System.out.println("Enter the Doctor_Id: ");
		try {
			Validator.checkStringForParseInt(id2);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newapp.setDoc_id(0);
		System.out.println("Enter the patient_name: ");
		String pa = sc1.nextLine();
		try {
			Validator.checkStringOnly(pa);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newapp.setPatient_name(pa);
		System.out.println("Enter the fees_collected: ");
		int fee = sc1.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(fee);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newapp.setFees_collected(fee);
		int result = AppointmentsDao.updateAppointment(newapp);
		System.out.println(result);
		sc1.close();
	}

	public static void deleteAppointment() {
		Scanner sc = new Scanner(System.in);
		Appointment newapp = new Appointment();
		System.out.println("Enter Appointment_Id:");
		String id1 = sc.nextLine();
		newapp.setApp_id(Integer.parseInt(id1));
		try {
			Validator.checkStringForParseInt(id1);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newapp.setApp_id(0);
		newapp.setApp_id(Integer.parseInt(id1));
		System.out.println("Enter the Appointment_Date");
		String id2 = sc.nextLine();
		newapp.setApp_id(Integer.parseInt(id2));
		try {
			Validator.checkStringForParseInt(id2);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newapp.setApp_date(null);
		System.out.println("Enter the Doctor_Id: ");
		newapp.setDoc_id(sc.nextInt());
		String id = sc.nextLine();
		newapp.setApp_id(Integer.parseInt(id));
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newapp.setApp_date(null);
		System.out.println("Enter the patient_name: ");
		String pa = sc.nextLine();
		try {
			Validator.checkStringOnly(pa);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newapp.setPatient_name(pa);
		System.out.println("Enter the fees_collected: ");
		int fee = sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(fee);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newapp.setFees_collected(fee);
		int result = AppointmentsDao.deleteAppointment(fee);
		System.out.println(result);
		sc.close();
	}
}
