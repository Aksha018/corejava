package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

public class TestDoctorDao {
	public static void testInsertEmployee() {
		Doctor ndoc = new Doctor();
		ndoc.setDoc_id(12);
		ndoc.setDoc_name("sam");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		ndoc.setDob(newDate);
		ndoc.setSpeciality("dentist");
		ndoc.setDoc_city("chennai");
		ndoc.setPhone(9954373);
		ndoc.setStandard_fees(1500);
		int result = DoctorDao.insertDoctor(ndoc);
		System.out.println(result);

	}

	public static void testUpdateDoctor() {
		Doctor newdoc = new Doctor();
		newdoc.setDoc_id(11);
		// System.out.println(newdoc.getDOCTOR_ID()+" "+newdoc.getDOCTOR_NAME()+"
		// "+newdoc.getDOB()+" "+newdoc.getSPECIALITY()+" "+newdoc.getCITY()+"
		// "+newdoc.getPHONE_NO()+" "+newdoc.getSTANDARD_FEES());
		newdoc.setDoc_name("mithu");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = new java.util.Date();
		newdoc.setDob(newDate);
		newdoc.setSpeciality("Allergists");
		newdoc.setDoc_city("Chennai");
		newdoc.setPhone(1234567);
		newdoc.setStandard_fees(10000);

		int result = DoctorDao.updateDoctor(newdoc);
		System.out.println(result + "row updated!");
	}

	public static void testUpdateDoctorName() {
//		   Doctor newdoc=new Doctor();
//	   	newdoc.setDOCTOR_ID(5);
//	   	newdoc.setDOCTOR_NAME("pandi");
		int result = DoctorDao.updateDoctorName(5, "raj");
		System.out.println(result);
	}

	public static void testUpdateDoctorFees() {
		Doctor newdoc = new Doctor();
		newdoc.setDoc_id(03);
		newdoc.setStandard_fees(7000);
		int result = DoctorDao.updateStandardFees(03, 70000);
		System.out.println(result);
	}

	public static void testDeleteDoctor() {
		// Doctor newdoc=new Doctor();
		int result = DoctorDao.deleteDoctor(12);
		System.out.println(result);
	}

	public static void testGetDoctorById() {
		Doctor result = DoctorDao.getDoctorById(1);
		System.out.println(result.getDoc_id() + " " + result.getDoc_name() + " " + result.getDob() + " "
				+ result.getSpeciality() + " " + result.getDoc_city() + " " + result.getPhone() + " "
				+ result.getStandard_fees());
	}

	public static void testGetAllDoctors() {
		List<Doctor> allDoctors = DoctorDao.getAllDoctors();
		Iterator<Doctor> drIterator = allDoctors.iterator();
		while (drIterator.hasNext()) {
			Doctor dr = drIterator.next();
			System.out.println(dr.getDoc_id() + " " + dr.getDoc_name() + " " + dr.getDob() + " "
					+ dr.getSpeciality() + " " + dr.getDoc_city() + " " + dr.getPhone() + " " + dr.getStandard_fees());
		}
	}
}
