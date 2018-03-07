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
		//cals = table.getApptRange(listapp, today, next);
		
		//assertEquals(1, cals.size());
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
		assertEquals(2, permuted.size());
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
		int[] pv={1,0};
		LinkedList<Appt> permuted = table.permute(listapp, pv);
		
		assertEquals(2,listapp.size());
		assertEquals(2, pv.length);
	 }
	 @Test
	  public void test06()  throws Throwable  {
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		int thisMonth;
    	 int thisYear;
    	int thisDay;
		Calendar rightnow = Calendar.getInstance();
    	//current month/year/date is today
    	thisMonth = rightnow.get(Calendar.MONTH)+1;
		thisYear = rightnow.get(Calendar.YEAR);
		thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		
		 int startHour=11;
		 int startMinute=30;
		 int startDay=thisDay+1;  	
		 int startMonth=thisMonth; 	
		 int startYear=thisYear; 	
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
         listAppts.add(appt);
          
      // create another appointment
         startHour=14;
		 startMinute=30;
		 startDay=thisDay;  	
		 startMonth=thisMonth; 	
		 startYear=thisYear; 	
		 title="Class";
		 description="Rescheduled class.";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         listAppts.add(appt);
         // create another appointment
         startHour=13;
		 startMinute=30;
		 startDay=thisDay;		
		 startMonth=thisMonth;	
		 startYear=thisYear;	
		 title="Meeting Today";
		 description="Meeting with the students.";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         listAppts.add(appt);
         // create another appointment
         startHour=16;
		 startMinute=30;
		 startDay=thisDay+1;		
		 startMonth=thisMonth+1;	
		 startYear=thisYear;	
		 title="Visit";
		 description="Visiting my parents!";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         int[] recurDaysArr={2,3,4};
         appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
         listAppts.add(appt);
		 GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(Calendar.DAY_OF_MONTH,+1);
		TimeTable timeTable=new TimeTable();
        //Create a linked list of calendar days to return
        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		//calDays = new LinkedList<CalDay>();
		calDays = timeTable.getApptRange(listAppts, today, tomorrow);
		
		assertEquals(1, calDays.size());
		LinkedList<Appt> getEm = calDays.get(0).getAppts();
		assertTrue(getEm.get(0).getValid());
		assertTrue(today.before(tomorrow));
	 }
	 @Test //attempt to kill permute mutations.  Can't be done. method broken
	  public void test07()  throws Throwable  {
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		int thisMonth;
    	 int thisYear;
    	int thisDay;
		Calendar rightnow = Calendar.getInstance();
    	//current month/year/date is today
    	thisMonth = rightnow.get(Calendar.MONTH)+1;
		thisYear = rightnow.get(Calendar.YEAR);
		thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		
		 int startHour=11;
		 int startMinute=30;
		 int startDay=thisDay+1;  	
		 int startMonth=thisMonth; 	
		 int startYear=thisYear; 	
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
         listAppts.add(appt);
          
      // create another appointment
         startHour=12;
		 startMinute=30;
		 startDay=thisDay;  	
		 startMonth=thisMonth; 	
		 startYear=thisYear; 	
		 title="Class";
		 description="Rescheduled class.";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         listAppts.add(appt);
         // create another appointment
         startHour=13;
		 startMinute=30;
		 startDay=thisDay;		
		 startMonth=thisMonth;	
		 startYear=thisYear;	
		 title="Meeting Today";
		 description="Meeting with the students.";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         listAppts.add(appt);
         // create another appointment
         startHour=14;
		 startMinute=30;
		 startDay=thisDay+1;		
		 startMonth=thisMonth+1;	
		 startYear=thisYear;	
		 title="Visit";
		 description="Visiting my parents!";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         int[] recurDaysArr={2,3,4};
         appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
         listAppts.add(appt);
		 GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(Calendar.DAY_OF_MONTH,+1);
		TimeTable timeTable=new TimeTable();
        //Create a linked list of calendar days to return
        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		//calDays = new LinkedList<CalDay>();
		calDays = timeTable.getApptRange(listAppts, today, tomorrow);
		
		int[] tester={3,2,1,0};
		LinkedList<Appt> updated=timeTable.permute(listAppts, tester);
		int dayz = 11;
		for(int i = 0;i < updated.size(); i++){
		assertEquals(dayz, updated.get(i).getStartHour());
		dayz++;
		}
		assertEquals(4, updated.size());
		assertNotNull(updated);
	 }
	 @Test
	  public void test08()  throws Throwable  {
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		int thisMonth;
    	 int thisYear;
    	int thisDay;
		Calendar rightnow = Calendar.getInstance();
    	//current month/year/date is today
    	thisMonth = rightnow.get(Calendar.MONTH)+1;
		thisYear = rightnow.get(Calendar.YEAR);
		thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		
		 int startHour=11;
		 int startMinute=30;
		 int startDay=thisDay+1;  	
		 int startMonth=thisMonth; 	
		 int startYear=thisYear; 	
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
         listAppts.add(appt);
          
      // create another appointment
         startHour=14;
		 startMinute=30;
		 startDay=thisDay;  	
		 startMonth=thisMonth; 	
		 startYear=thisYear; 	
		 title="Class";
		 description="Rescheduled class.";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         listAppts.add(appt);
         // create another appointment
         startHour=13;
		 startMinute=30;
		 startDay=thisDay;		
		 startMonth=thisMonth;	
		 startYear=thisYear;	
		 title="Meeting Today";
		 description="Meeting with the students.";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         listAppts.add(appt);
         // create another appointment
         startHour=16;
		 startMinute=30;
		 startDay=thisDay+1;		
		 startMonth=thisMonth+1;	
		 startYear=thisYear;	
		 title="Visit";
		 description="Visiting my parents!";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         int[] recurDaysArr={2,3,4};
         appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
         listAppts.add(appt);
		 GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(Calendar.DAY_OF_MONTH,+1);
		TimeTable timeTable=new TimeTable();
        //Create a linked list of calendar days to return
        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		//calDays = new LinkedList<CalDay>();
		calDays = timeTable.getApptRange(listAppts, today, tomorrow);
		
		assertEquals(1, calDays.size());
		LinkedList<Appt> getEm = calDays.get(0).getAppts();
		assertTrue(getEm.get(0).getValid());
		assertTrue(today.before(tomorrow));
	 }
	 @Test	//tests deleteappt method, bug on i=1
	  public void test09()  throws Throwable  {
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		int thisMonth;
    	 int thisYear;
    	int thisDay;
		Calendar rightnow = Calendar.getInstance();
    	//current month/year/date is today
    	thisMonth = rightnow.get(Calendar.MONTH)+1;
		thisYear = rightnow.get(Calendar.YEAR);
		thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		
		 int startHour=11;
		 int startMinute=30;
		 int startDay=thisDay+1;  	
		 int startMonth=thisMonth; 	
		 int startYear=thisYear; 	
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
         listAppts.add(appt);
          
      // create another appointment
         startHour=14;
		 startMinute=30;
		 startDay=thisDay;  	
		 startMonth=thisMonth; 	
		 startYear=thisYear; 	
		 title="Class";
		 description="Rescheduled class.";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         listAppts.add(appt);
         // create another appointment
         startHour=13;
		 startMinute=30;
		 startDay=thisDay;		
		 startMonth=thisMonth;	
		 startYear=thisYear;	
		 title="Meeting Today";
		 description="Meeting with the students.";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         listAppts.add(appt);
         // create another appointment
         startHour=16;
		 startMinute=30;
		 startDay=thisDay+1;		
		 startMonth=thisMonth+1;	
		 startYear=thisYear;	
		 title="Visit";
		 description="Visiting my parents!";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         int[] recurDaysArr={2,3,4};
         appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
         listAppts.add(appt);
		 GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(Calendar.DAY_OF_MONTH,+1);
		TimeTable timeTable=new TimeTable();
        //Create a linked list of calendar days to return
        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		//calDays = new LinkedList<CalDay>();
		calDays = timeTable.getApptRange(listAppts, today, tomorrow);
		assertEquals(4, listAppts.size());
		LinkedList<Appt> listDeletedAppts=timeTable.deleteAppt(listAppts, listAppts.get(2));
		
		startHour=20;
		 startMinute=30;
		 startDay=thisDay+1;		
		 startMonth=thisMonth+1;	
		 startYear=thisYear;	
		 title="Visit";
		 description="Visiting my parents!";
		Appt appt1 = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
		LinkedList<Appt> listDeletedAppts1=timeTable.deleteAppt(listAppts, appt1);
		LinkedList<Appt> listDeletedAppts2=timeTable.deleteAppt(listDeletedAppts1, appt1);
		
		assertEquals(3, listAppts.size());
		assertEquals(3, listDeletedAppts.size());
		assertNull(listDeletedAppts1);
		assertNull(listDeletedAppts2);
	 }
	@Test	//tests getApptOccurrences
	  public void test10()  throws Throwable  {
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		int thisMonth;
    	 int thisYear;
    	int thisDay;
		Calendar rightnow = Calendar.getInstance();
    	//current month/year/date is today
    	thisMonth = rightnow.get(Calendar.MONTH)+1;
		thisYear = rightnow.get(Calendar.YEAR);
		thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		
		 int startHour=11;
		 int startMinute=30;
		 int startDay=thisDay+1;  	
		 int startMonth=thisMonth; 	
		 int startYear=thisYear; 	
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
				 appt.setRecurrence( null, Appt.RECUR_BY_WEEKLY, 1, Appt.RECUR_NUMBER_FOREVER);
         listAppts.add(appt);
          
      // create another appointment
         startHour=14;
		 startMinute=30;
		 startDay=thisDay;  	
		 startMonth=thisMonth; 	
		 startYear=thisYear; 	
		 title="Class";
		 description="Rescheduled class.";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
		int[] recurDaysArr={4,7,8};
         appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_YEARLY, 1, Appt.RECUR_NUMBER_NEVER);
         listAppts.add(appt);
         // create another appointment
         startHour=15;
		 startMinute=30;
		 startDay=thisDay;		
		 startMonth=thisMonth;	
		 startYear=thisYear;	
		 title="Meeting Today";
		 description="Meeting with the students.";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
		int[] recurDaysArr1={4,7,8};
         appt.setRecurrence( recurDaysArr1, Appt.RECUR_BY_MONTHLY, 1, Appt.RECUR_NUMBER_FOREVER);
         listAppts.add(appt);
         // create another appointment
         startHour=16;
		 startMinute=30;
		 startDay=thisDay+1;		
		 startMonth=thisMonth+1;	
		 startYear=thisYear;	
		 title="Visit";
		 description="Visiting my parents!";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         int[] recurDaysArr2={2,3,4};
         appt.setRecurrence( recurDaysArr2, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
         listAppts.add(appt);
		 GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(Calendar.DAY_OF_MONTH,+2);
		TimeTable timeTable=new TimeTable();
        //Create a linked list of calendar days to return
        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		//calDays = new LinkedList<CalDay>();
		calDays = timeTable.getApptRange(listAppts, today, tomorrow);
		int[] temper = listAppts.get(0).getRecurDays();
		LinkedList<Appt> tempor = calDays.get(0).getAppts();
		LinkedList<Appt> tempor1 = calDays.get(1).getAppts();
		
		assertNotNull(tempor.get(0));
		assertNotNull(tempor.get(1));
		assertEquals(14, tempor.get(0).getStartHour());
		assertEquals(15, tempor.get(1).getStartHour());
		assertEquals(2, tempor.size());
		assertEquals(0, tempor1.size());
		assertNotNull(calDays);
		assertNotNull(calDays.get(0));
		assertEquals(0, temper.length);
		assertEquals(3, listAppts.get(1).getRecurDays().length);
		assertEquals(3, listAppts.get(2).getRecurDays().length);
		assertEquals(3, listAppts.get(3).getRecurDays().length);
		assertEquals(0, listAppts.get(1).getRecurNumber());
		assertEquals(1000, listAppts.get(2).getRecurNumber());
		assertEquals(1000, listAppts.get(3).getRecurNumber());
		assertFalse(listAppts.get(1).isRecurring());
		assertTrue(listAppts.get(2).isRecurring());
		assertTrue(listAppts.get(3).isRecurring());
		assertEquals(2, calDays.size());
		assertTrue(calDays.get(0).isValid());
	 }
	
//add more unit tests as you needed
}
