package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import org.junit.Test;
import java.util.LinkedList;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {
		  long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {				
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				TimeTable table = new TimeTable();
				GregorianCalendar today = new GregorianCalendar();
				LinkedList<CalDay> cals = new LinkedList<CalDay>();
				LinkedList<Appt> listapp = new LinkedList<Appt>();
				int numAppts;
			
			for (int i = 0; i < NUM_TESTS; i++) {
				numAppts = listapp.size();
				
				
				int startHour=ValuesGenerator.RandInt(random);
				int startMinute=ValuesGenerator.RandInt(random);
				int startDay=ValuesGenerator.RandInt(random);
				int startMonth=ValuesGenerator.getRandomIntBetween(random, 0, 10);
				int startYear=ValuesGenerator.RandInt(random);
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
				int p = ValuesGenerator.RandInt(random);
				int[] recurDays;
				if(p == 0){
					recurDays= null;
					}
				else{
						int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);
					}
				int recur=ApptRandomTest.RandomSelectRecur(random);
				int recurIncrement = ValuesGenerator.RandInt(random);
				int recurNumber=ApptRandomTest.RandomSelectRecurForEverNever(random);
				appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
						   
				int askDel = ValuesGenerator.getRandomIntBetween(random, 0, 1);
				if(askDel==1){
					if(numAppts>0){
					int oneDel = ValuesGenerator.getRandomIntBetween(random, 0, numAppts-1);
					LinkedList<Appt> del = table.deleteAppt(listapp,listapp.get(oneDel));
					}
					else{
						askDel = ValuesGenerator.getRandomIntBetween(random, 0, 1);
						if(askDel == 0){
						LinkedList<Appt> nullList = null;
						LinkedList<Appt> del = table.deleteAppt(nullList,appt);
						}
						else{
							Appt appt1 = null;
							LinkedList<Appt> del = table.deleteAppt(listapp, appt1);
						}
					}
				}
				listapp.add(appt);
				//GregorianCalendar FirstDay = new GregorianCalendar(ValuesGenerator.RandInt(random),ValuesGenerator.RandInt(random),ValuesGenerator.getRandomIntBetween(random, 0, 10));
				//GregorianCalendar tomorrow = new GregorianCalendar(ValuesGenerator.RandInt(random),ValuesGenerator.RandInt(random),ValuesGenerator.getRandomIntBetween(random, 0, 10));
				//if(FirstDay.before(tomorrow)){
				//cals = table.getApptRange(listapp, FirstDay, tomorrow);
				//}
				//numAppts = listapp.size();
				//int askDel = ValuesGenerator.getRandomIntBetween(random, 0, 1);
				//if(askDel==1){
				//	if(numAppts>=3){
				//	int oneDel = ValuesGenerator.getRandomIntBetween(random, 1, numAppts-1);
				//	LinkedList<Appt> del = table.deleteAppt(listapp,listapp.get(oneDel));
				//	}
				//}
				
			}
			GregorianCalendar FirstDay = new GregorianCalendar(ValuesGenerator.RandInt(random),ValuesGenerator.RandInt(random),ValuesGenerator.getRandomIntBetween(random, 0, 10));
				GregorianCalendar tomorrow = new GregorianCalendar(ValuesGenerator.RandInt(random),ValuesGenerator.RandInt(random),ValuesGenerator.getRandomIntBetween(random, 0, 10));
				if(FirstDay.before(tomorrow)){
				cals = table.getApptRange(listapp, FirstDay, tomorrow);
				}
				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");	 
		 
		 
		}
	 


	
}
