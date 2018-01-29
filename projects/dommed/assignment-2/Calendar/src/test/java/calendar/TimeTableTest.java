package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		TimeTable table = new TimeTable();
		LinkedList<CalDay> cals = new LinkedList<CalDay>();
		LinkedList<Appt> listapp = new LinkedList<Appt>();
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 int[] days ={1,3,4};
		 //Construct a new Appointment object with the initial data	 
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		appt1.setRecurrence(days, Appt.RECUR_BY_MONTHLY, 0, Appt.RECUR_NUMBER_NEVER);
		listapp.add(appt1);
		startHour=22;
		startMinute=33;
		startDay=14;
		startMonth=01;
		startYear=2018;
		 		 appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		
		appt1.setRecurrence(days, Appt.RECUR_BY_YEARLY, 3, Appt.RECUR_NUMBER_FOREVER);
		listapp.add(appt1);
		startHour=20;
		startMinute=33;
		startDay=16;
		startMonth=01;
		startYear=2018;
		 		 appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		
		appt1.setRecurrence(days, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
		listapp.add(appt1);
		startHour=19;
		startMinute=33;
		startDay=18;
		startMonth=01;
		startYear=2018;
		 		 appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		int[] days1 ={706,305,100};
		appt1.setRecurrence(days1, Appt.RECUR_BY_WEEKLY, 1000, Appt.RECUR_NUMBER_FOREVER);
		listapp.add(appt1);
		startHour=20;
		startMinute=60;
		startDay=16;
		startMonth=01;
		startYear=2018;
		 		 appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		listapp.add(appt1);
		appt1.setRecurrence(days, Appt.RECUR_BY_MONTHLY, 4, Appt.RECUR_NUMBER_FOREVER);
		GregorianCalendar today = new GregorianCalendar(2018,13,01);
		GregorianCalendar next = new GregorianCalendar(2018,17,01);
		cals = table.getApptRange(listapp, today, next);
		LinkedList<Appt> del = table.deleteAppt(listapp,listapp.get(1));
		
		assertEquals(4, listapp.size());
		assertEquals(120, cals.size());
		
		 
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 TimeTable table = new TimeTable();
		LinkedList<CalDay> cals = new LinkedList<CalDay>();
		LinkedList<Appt> listapp = new LinkedList<Appt>();
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		listapp.add(appt1);
		GregorianCalendar today = new GregorianCalendar(2018,17,01);
		GregorianCalendar next = new GregorianCalendar(2018,13,01);
		cals = table.getApptRange(listapp, today, next);
		
		assertEquals(1, cals.size());
	 }
	 @Test
	 public void test03()  throws Throwable  {
		 TimeTable table = new TimeTable();
		LinkedList<CalDay> cals = new LinkedList<CalDay>();
		LinkedList<Appt> listapp = new LinkedList<Appt>();
		 int startHour=21;
		 int startMinute=60;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		listapp.add(appt1);
		GregorianCalendar today = new GregorianCalendar(2018,13,01);
		GregorianCalendar next = new GregorianCalendar(2018,17,01);
		cals = table.getApptRange(listapp, today, next);
		LinkedList<Appt> del = table.deleteAppt(listapp,listapp.get(0));
		
		assertEquals(21, listapp.get(0).getStartHour());
		assertFalse(listapp.get(0).getValid());
	 }
	  @Test
	  public void test04()  throws Throwable  {
		 TimeTable table = new TimeTable();
		LinkedList<CalDay> cals = new LinkedList<CalDay>();
		LinkedList<Appt> listapp = new LinkedList<Appt>();
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		listapp.add(appt1);
		startHour=22;
		startMinute=33;
		startDay=14;
		startMonth=01;
		startYear=2018;
		 		 appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		listapp.add(appt1);
		GregorianCalendar today = new GregorianCalendar(2018,13,01);
		GregorianCalendar next = new GregorianCalendar(2018,17,01);
		cals = table.getApptRange(listapp, today, next);
		int[] pv={1,0};
		LinkedList<Appt> permuted = table.permute(listapp, pv);
		
		assertEquals(15, listapp.get(0).getStartDay());
	 }
	  @Test
	  public void test05()  throws Throwable  {
		 TimeTable table = new TimeTable();
		LinkedList<CalDay> cals = new LinkedList<CalDay>();
		LinkedList<Appt> listapp = new LinkedList<Appt>();
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		listapp.add(appt1);
		startHour=22;
		startMinute=33;
		startDay=14;
		startMonth=01;
		startYear=2018;
		 		 appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		listapp.add(appt1);
		GregorianCalendar today = new GregorianCalendar(2018,13,01);
		GregorianCalendar next = new GregorianCalendar(2018,17,01);
		cals = table.getApptRange(listapp, today, next);
		int[] pv={1,0,2};
		LinkedList<Appt> permuted = table.permute(listapp, pv);
		
		assertEquals(2,listapp.size());
		assertEquals(3, pv.length);
	 }
//add more unit tests as you needed
}
