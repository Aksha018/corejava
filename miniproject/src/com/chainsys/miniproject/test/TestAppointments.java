package com.chainsys.miniproject.test;

import java.util.List;
import java.util.*;
import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Appointment;
import com.chainsys.miniproject.ui.AppointmentsUI;

public class TestAppointments{
     public static void testGetAllAppointment() {
    	 List<Appointment> allAppointment = AppointmentsDao.getAllAppointment();
    	 Iterator<Appointment> appIterator = allAppointment.iterator();
    	 while(appIterator.hasNext()) {
    		 Appointment app = appIterator.next();
    		 System.out.println(app.getApp_id()+" "+app.getPatient_name()+" "+app.getDoc_id()+" "+app.getPatient_name()+" "+app.getFees_collected());
    	 }
     }
     public static void testGetAppointmentById() {
    	 Appointment app = AppointmentsDao.getAppointmentById(11);
    	 System.out.println(app.getApp_id()+" "+app.getPatient_name()+ " "+app.getFees_collected());
     }
     public static void testInsertAppointment() {
    	 Appointment newapp = new Appointment();
    	 newapp.setApp_id(11);
    	 newapp.setDoc_id(211);
    	 newapp.setPatient_name("sam");
    	 newapp.setFees_collected(2374);
    	 newapp.setApp_date(18/12/2003);
    	 int result = AppointmentsDao.insertAppointment(newapp);
    	 System.out.println(result);
   }
public static void testUpdateAppointment() {
	 Appointment oldapp = AppointmentsDao.getAppointmentById(11);
	 System.out.println(oldapp.getDoc_id()+ " "+oldapp.getFees_collected()+" "+oldapp.getPatient_name());
	 oldapp.setApp_id(11);
	 oldapp.setPatient_name("SAM");
	 oldapp.setFees_collected(2000);
	 oldapp.setApp_date(18/12/2003);
	 int result = AppointmentsDao.updateAppointment(oldapp);
	 System.out.println(result);
}

public static void testDeleteAppointment() {
	 int result = AppointmentsDao.deleteAppointment(11);
}
}
