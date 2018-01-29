package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		CalDay calday = new CalDay();
		Iterator<?> temp = calday.iterator();
		String holder = calday.toString();
		
		assertFalse(calday.isValid());
		assertEquals(null, temp);

	 }
	 @Test
	  public void test02()  throws Throwable  {
		  GregorianCalendar today = new GregorianCalendar();
		 CalDay calday1 = new CalDay(today);
		 int day = calday1.getDay();
		 int month = calday1.getMonth();
		 int year = calday1.getYear();
		 
		 assertTrue(calday1.isValid());
		 assertEquals(calday1.day, today.get(today.DAY_OF_MONTH));
		 assertEquals(calday1.month, today.get(today.MONTH));
		 assertEquals(calday1.year, today.get(today.YEAR));
		 assertEquals(today.get(today.DAY_OF_MONTH),day);
		 assertEquals(today.get(today.MONTH), month);
		 assertEquals(today.get(today.YEAR), year);
	 }
	 @Test
	  public void test03()  throws Throwable  {
		  GregorianCalendar today2 = new GregorianCalendar();
		 CalDay calday2 = new CalDay(today2);
		  int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		calday2.addAppt(appt1);
		startHour=22;
		startMinute=33;
		startDay=14;
		startMonth=01;
		startYear=2018;
		 		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		calday2.addAppt(appt2);
		startHour=20;
		startMinute=33;
		startDay=16;
		startMonth=01;
		startYear=2018;
		 		 Appt appt0 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		calday2.addAppt(appt0);
		Iterator<?> temp = calday2.iterator();
		LinkedList<Appt> temp2 = calday2.getAppts(); 
		String holder = calday2.toString();
		
		assertTrue(calday2.isValid());
		assertTrue(temp2.get(0).getValid());
		assertTrue(temp2.get(1).getValid());
		assertTrue(temp2.get(2).getValid());
		assertEquals(16, temp2.get(0).getStartDay());
		assertEquals(15, temp2.get(1).getStartDay());
		assertEquals(14, temp2.get(2).getStartDay());
		assertEquals(3, calday2.getSizeAppts());
		 
	 }
	 @Test
	  public void test04()  throws Throwable  {
		 GregorianCalendar today = new GregorianCalendar();
		 CalDay calday3 = new CalDay(today);
		 int startHour=21;
		 int startMinute=60;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		calday3.addAppt(appt);
		 
		assertFalse(appt.getValid());
		assertEquals(0, calday3.getSizeAppts());
	 }
//add more unit tests as you needed	
}
