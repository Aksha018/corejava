package com.chainsys.miniproject.ui;

import java.util.Calendar;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

public class DoctorUi {
	public static void addNewDoctor() {
		Scanner sc = new Scanner(System.in);
		Doctor newdoc = new Doctor();
		System.out.println("Enter Doctor_id:");
		String id = sc.nextLine();
		newdoc.setDoc_id(Integer.parseInt(id));

		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		System.out.println("Enter Doctor_Name:");
		newdoc.setDoc_name(sc.nextLine());
		try {
			Validator.checkStringOnly(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		System.out.println("Enter the DOB:");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		newdoc.setDob(newDate);
		System.out.println("Enter the speciality:");
		newdoc.setSpeciality(sc.nextLine());
		System.out.println("Enter the City:");
		newdoc.setDoc_city(sc.nextLine());
		System.out.println("Enter the phonenumber:");
		newdoc.setPhone(sc.nextLong());
		System.out.println("Enter standard_fees:");
		newdoc.setStandard_fees(sc.nextInt());
		int result = DoctorDao.insertDoctor(newdoc);
		System.out.println(result);

		sc.close();
	}

	public static void updateDoctor() {
		Scanner sc = new Scanner(System.in);
		Doctor newdoc = new Doctor();
		System.out.println("Enter Doctor_id:");
		String id = sc.nextLine();
		newdoc.setDoc_id(Integer.parseInt(id));
		System.out.println("Enter Doctor_Name:");
		newdoc.setDoc_name(sc.nextLine());
		try {
			Validator.checkStringOnly(id);
			;
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		System.out.println("Enter the DOB:");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		newdoc.setDob(newDate);
		System.out.println("Enter the speciality:");
		newdoc.setSpeciality(sc.nextLine());
		System.out.println("Enter the City:");
		newdoc.setDoc_city(sc.nextLine());
		System.out.println("Enter the phonenumber:");
		newdoc.setPhone(sc.nextLong());
		System.out.println("Enter standard_fees:");
		newdoc.setStandard_fees(sc.nextInt());
		int result = DoctorDao.updateDoctor(newdoc);
		System.out.println(result);
      sc.close();
}
	public static void deleteDoctor() {
		Scanner sc = new Scanner(System.in);
		Doctor newdoc = new Doctor();
		System.out.println("Enter Doctor_id:");
		String id = sc.nextLine();
		newdoc.setDoc_id(Integer.parseInt(id));
		int result = DoctorDao.deleteDoctor(newdoc.getDoc_id());
		System.out.println(result);
      sc.close();
	}
}
