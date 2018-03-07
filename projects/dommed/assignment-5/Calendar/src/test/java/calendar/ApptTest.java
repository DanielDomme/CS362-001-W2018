package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 
	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=24;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
			
	// assertions
		 assertTrue(appt2.getValid());
		 assertEquals(24, appt2.getStartHour());
		 assertEquals(30, appt2.getStartMinute());
		 assertEquals(15, appt2.getStartDay());
		 assertEquals(01, appt2.getStartMonth());
		 assertEquals(2018, appt2.getStartYear());
		 assertEquals("Birthday Party", appt2.getTitle());
		 assertEquals("This is my birthday party.", appt2.getDescription()); 
		 
	 }
	 @Test
	  public void test03()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=0;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt3 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		String toStringtest2 = appt3.toString();
			
	// assertions
		 assertFalse(appt3.getValid());
		 assertEquals(21, appt3.getStartHour());
		 assertEquals(30, appt3.getStartMinute());
		 assertEquals(0, appt3.getStartDay());
		 assertEquals(01, appt3.getStartMonth());
		 assertEquals(2018, appt3.getStartYear());
		 assertEquals("Birthday Party", appt3.getTitle());
		 assertEquals("This is my birthday party.", appt3.getDescription()); 
		 assertEquals(null, toStringtest2);
		 

		 
	 }
	 @Test
	  public void test04()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=00;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt4 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
			
	// assertions
		 assertFalse(appt4.getValid());
		 assertEquals(21, appt4.getStartHour());
		 assertEquals(30, appt4.getStartMinute());
		 assertEquals(15, appt4.getStartDay());
		 assertEquals(00, appt4.getStartMonth());
		 assertEquals(2018, appt4.getStartYear());
		 assertEquals("Birthday Party", appt4.getTitle());
		 assertEquals("This is my birthday party.", appt4.getDescription()); 
		 

		 
	 }
	 @Test
	  public void test05()  throws Throwable  {
		 int startHour=21;
		 int startMinute=60;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt5 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
			
	// assertions
		 assertFalse(appt5.getValid());
		 assertEquals(21, appt5.getStartHour());
		 assertEquals(60, appt5.getStartMinute());
		 assertEquals(15, appt5.getStartDay());
		 assertEquals(01, appt5.getStartMonth());
		 assertEquals(2018, appt5.getStartYear());
		 assertEquals("Birthday Party", appt5.getTitle());
		 assertEquals("This is my birthday party.", appt5.getDescription()); 
		 assertFalse(appt5.isRecurring());
		 
	 }
	 @Test
	  public void test06()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt6 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		String tmp=null;
		String tmp2=null;
		appt6.setStartHour(20);
		appt6.setStartMinute(29);
		appt6.setStartDay(12);
		appt6.setStartMonth(02);
		appt6.setStartYear(2017);
		appt6.setTitle(tmp);
		appt6.setDescription(tmp2);
		appt6.setRecurrence(null, 2, 3, 5);
		int recurnum = appt6.getRecurNumber();
		int recurby = appt6.getRecurBy();
		int[] recurDays = appt6.getRecurDays();
		String toStringTest = appt6.toString();
		
	// assertions
		 assertTrue(appt6.getValid());
		 assertEquals(20, appt6.getStartHour());
		 assertEquals(29, appt6.getStartMinute());
		 assertEquals(12, appt6.getStartDay());
		 assertEquals(02, appt6.getStartMonth());
		 assertEquals(2017, appt6.getStartYear());
		 assertEquals("", appt6.getTitle());
		 assertEquals("", appt6.getDescription()); 
		 assertEquals(5, recurnum);
		 assertEquals(2, recurby);
		 assertTrue(appt6.isRecurring());
		 assertEquals(3, appt6.getRecurIncrement());		 
		 
	 }
	 @Test
	  public void test07()  throws Throwable  {
		 int startHour=0;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt7 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		String toStringTest3 = appt7.toString();
			
	// assertions
		 assertTrue(appt7.getValid());
		 assertEquals(0, appt7.getStartHour());
		 assertEquals(30, appt7.getStartMinute());
		 assertEquals(15, appt7.getStartDay());
		 assertEquals(01, appt7.getStartMonth());
		 assertEquals(2018, appt7.getStartYear());
		 assertEquals("Birthday Party", appt7.getTitle());
		 assertEquals("This is my birthday party.", appt7.getDescription()); 
		 
	 }
	  @Test
	  public void test08()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=1;	//bug month is one month ahead
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt6 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		String tmp=null;
		String tmp2=null;
		appt6.setStartHour(0);
		assertTrue(appt6.getValid());
		appt6.setStartHour(23);
		assertTrue(appt6.getValid());
		appt6.setStartMinute(00);
		assertTrue(appt6.getValid());
		appt6.setStartMinute(59);
		assertTrue(appt6.getValid());
		appt6.setStartDay(1);
		assertTrue(appt6.getValid());
		appt6.setStartDay(31);		//app thinks it is february
		assertTrue(appt6.getValid());
		appt6.setStartMonth(1);
		assertTrue(appt6.getValid());
		/*appt6.setStartMonth(12);
		assertTrue(appt6.getValid());*/
		appt6.setTitle(tmp);
		appt6.setDescription(tmp2);
		appt6.setRecurrence(null, 2, 3, 5);
		int recurnum = appt6.getRecurNumber();
		int recurby = appt6.getRecurBy();
		int[] recurDays = appt6.getRecurDays();
		String toStringTest = appt6.toString();
		
	// assertions
		 assertTrue(appt6.getValid());
		 assertEquals("", appt6.getTitle());
		 assertEquals("", appt6.getDescription()); 
		 assertEquals(5, recurnum);
		 assertEquals(2, recurby);
		 assertTrue(appt6.isRecurring());
		 assertEquals(3, appt6.getRecurIncrement());		 
		 
	 }
	@Test
	  public void test09()  throws Throwable  {
		 int startHour=0;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt7 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		String toStringTest3 = appt7.toString();
			
	// assertions
		assertEquals(2, appt7.getRecurBy());
	 }
	 @Test
	  public void test10()  throws Throwable  {
		 int startHour=0;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt7 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		int[] days ={1,3,4};		 
		appt7.setRecurrence(days, Appt.RECUR_BY_MONTHLY, 0, Appt.RECUR_NUMBER_NEVER);
		
		assertEquals(days,appt7.getRecurDays());
	 }
	 @Test
	  public void test11()  throws Throwable  {
		 int startHour=21;
		 int startMinute=60;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt6 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		appt6.setStartMinute(29);
		
		assertTrue(appt6.getValid());		 
	 }
	 @Test
	  public void test12()  throws Throwable  {
		 int startHour=21;
		 int startMinute=29;
		 int startDay=40;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt6 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		appt6.setStartDay(15);
		
		assertTrue(appt6.getValid());		 
	 }
	 	 @Test
	  public void test13()  throws Throwable  {
		 int startHour=10;
		 int startMinute=29;
		 int startDay=15;
		 int startMonth=0;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt6 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		appt6.setStartMonth(2);
		
		assertTrue(appt6.getValid());		 
	 }
	 @Test
	  public void test14()  throws Throwable  {
		 int startHour=10;
		 int startMinute=29;
		 int startDay=15;
		 int startMonth=2;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt6 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		String check = "\t";
		String check2 = appt6.toString();
		
		assertEquals(check.charAt(0), check2.charAt(0));
		assertTrue(appt6.getValid());		 
	 }
	 @Test
	  public void test15()  throws Throwable  {
		 int startHour=12;
		 int startMinute=29;
		 int startDay=15;
		 int startMonth=2;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt6 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		String check = "p";
		String check2 = appt6.toString();
		String check3 = "1";
		
		assertEquals(check.charAt(0), check2.charAt(18));
		assertEquals(check3.charAt(0), check2.charAt(14));
		assertTrue(appt6.getValid());		 
	 }
	 @Test
	  public void test16()  throws Throwable  {
		 int startHour=11;
		 int startMinute=29;
		 int startDay=15;
		 int startMonth=2;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt6 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		String check = "a";
		String check2 = appt6.toString();
		String check3 = "1";
		
		assertEquals(check.charAt(0), check2.charAt(19));
		assertEquals(check3.charAt(0), check2.charAt(14));
		assertEquals(check3.charAt(0), check2.charAt(15));
		assertTrue(appt6.getValid());		 
	 }
	  @Test
	  public void test17()  throws Throwable  {
		 int startHour=11;
		 int startMinute=29;
		 int startDay=15;
		 int startMonth=2;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt6 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		startHour=10;
		startMinute=50;
		startDay=14;
		startMonth=1;
		startYear=2017;
		//Construct a new Appointment object with the initial data	 
		 Appt appt7 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		int resNum = appt6.compareTo(appt7);
		
		assertEquals(-17,resNum);
	 }
//add more unit tests as you needed
	
}
