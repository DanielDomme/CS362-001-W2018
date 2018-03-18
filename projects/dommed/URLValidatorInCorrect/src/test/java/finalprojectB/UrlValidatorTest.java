//Test code by Daniel Domme and Jonathan Ropp
//Date: 15 March 2018

package finalprojectB;

import junit.framework.TestCase;


//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {


   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest(){
	   //start Daniel Domme's code
//You can use this function to implement your manual testing
		System.out.print("\n Running Manual Testing...");	
		UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
		assertFalse(urlVal.isValid("gogssa"));
		assertTrue(urlVal.isValid("http://www.google.com"));
		assertFalse(urlVal.isValid("www.google.com"));
		assertTrue(urlVal.isValid("http:/www.google.com"));
		assertTrue(urlVal.isValid("http://255.com"));
		assertTrue(urlVal.isValid("http://www.google.com/test1"));
		assertTrue(urlVal.isValid("http://www.google.com/test1"));
	    //assertTrue(urlVal.isValid("http://www.google.com/test1/"));
		//assertTrue(urlVal.isValid("h3t://255.255.255.255"));
		assertTrue(urlVal.isValid("http://localhost/"));
		//assertTrue(urlVal.isValid("h3t://www.google.com:80"));
		//assertTrue(urlVal.isValid("http://www.google.com:80"));
		//boolean t = urlVal.isValid("http://www.google.com:80");
		//System.out.println(t);
		assertTrue(urlVal.isValid("http://255.255.255.255"));
		//assertTrue(urlVal.isValid("ftp://255.255.255.255"));
		//assertTrue(urlVal.isValid("ftp://www.google.com"));
		//assertTrue(urlVal.isValid("http://www.google.com/test1/file"));
		//assertTrue(urlVal.isValid("ftp://localhost/"));	
		//assertFalse(urlVal.isValid("ftp://www.google.com"));
		//assertFalse(urlVal.isValid("ftp://255.255.255.255"));
		//assertTrue(urlVal.isValid("ftp://255.255.255.255"));
		//assertNull(urlVal.isValid("https://www.google.com"));	
		//assertFalse(urlVal.isValid("ftp://www.google.com"));
		//assertFalse(urlVal.isValid("ftp://255.255.255.255"));
		//assertTrue(urlVal.isValid("ftp://255.255.255.255"));
		System.out.print("\n Manual Testing Complete");
		}
   
   
   public void testYourFirstPartition(){
	 //You can use this function to implement your First Partition testing	 
		System.out.print("\n Running Partition Testing...");
		UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);	
		assertTrue(urlVal.isValid("http://go.com/"));
		assertTrue(urlVal.isValid("http://gorandomtestingstuff.com/"));
		assertTrue(urlVal.isValid("http:/www.google.com"));
		assertTrue(urlVal.isValid("http://www.google.com"));
		assertTrue(urlVal.isValid("http://.google.com"));
		assertTrue(urlVal.isValid("http://www.google.edu"));
		
   }
   
   public void testYourSecondPartition(){
		 //You can use this function to implement your Second Partition testing	   
		 UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
		 assertFalse(urlVal.isValid("a"));
		 assertFalse(urlVal.isValid(""));
		 assertFalse(urlVal.isValid(" "));
		 assertTrue(urlVal.isValid("http:"));

   }
   
   public void testYourThirdPartition(){
	 //You can use this function to implement your First Partition testing	 
		UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);	
		
		assertTrue(urlVal.isValid("http:/"));
		assertTrue(urlVal.isValid("http://"));
		assertFalse(urlVal.isValid("http:80"));
		assertTrue(urlVal.isValid("http://80"));
		assertFalse(urlVal.isValid("http://:80"));
		assertTrue(urlVal.isValid("http://?action=edit&mode=up"));
		assertTrue(urlVal.isValid("http://?action=edit&mode=up/"));
		assertTrue(urlVal.isValid("http://?action=edit&mode=up/test"));
		assertTrue(urlVal.isValid("http://?action=edit&mode=up/test/"));
		assertTrue(urlVal.isValid("http://?action=edit&mode=up/file"));
   }
   
   public void testYourFourthPartition(){
	 //You can use this function to implement your First Partition testing	 
		UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);	
		assertFalse(urlVal.isValid("http:www.google.com"));
		assertTrue(urlVal.isValid("http://www.google.edu/test"));
		assertFalse(urlVal.isValid("http://www.google.edu/test/"));	
		assertFalse(urlVal.isValid("http://www.google.edu/file/"));	
		assertTrue(urlVal.isValid("http://www.google.edu/$23?action=view"));
		assertTrue(urlVal.isValid("http://www.google.edu/$23?action=view/"));
		assertTrue(urlVal.isValid("http://www.google.edu/?action=edit&mode=up"));
		assertTrue(urlVal.isValid("http://www.google.edu/?action=edit&mode=up:80"));		
   }
   
   public void testYourFifthPartition(){
		 //You can use this function to implement your Second Partition testing	   
		 UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
		 assertTrue(urlVal.isValid("http://00000000000000000000000000000000000000000000000000000000000000000000000000000"));
		 assertTrue(urlVal.isValid("http://0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
		 assertFalse(urlVal.isValid("http://00000000000000000000000000000000000000000000000000000000000000000000000000000:"));
		 assertTrue(urlVal.isValid("http://0000000000000000000000000000000000000000000000000000 0000000000000000000000000"));
		 assertTrue(urlVal.isValid("http://000000000000000000000000000000000000000000000000000                           00000000000000000000000000"));
		 assertTrue(urlVal.isValid("http://00000000000000000000000000000000000		000000000000000000000000000000000000000000"));
		 assertTrue(urlVal.isValid("http://0 0000000000000000000000000000000000000000000000000000000000000000000000000000"));
		 assertTrue(urlVal.isValid("http://00000000^~@#$^&*();':<>[]{}_+-=?,.000000000000000000000000000000000000000000000000000000000000000000000"));
		 assertFalse(urlVal.isValid("http://00000000000000000000000000000000000000000000000000000000000000000000000000000:80"));
   }
   
   public void testYourSixthPartition(){
	  String[] schemes = {"daniel"};
      UrlValidator urlVal = new UrlValidator(schemes, null, 0);
	  //System.out.print(urlVal.allowedSchemes);
	  assertFalse(urlVal.isValidScheme(schemes[0]));
	  assertFalse(urlVal.isValid("daniel://www.google.com"));
	  assertFalse(urlVal.isValid("DANIEL://www.google.com"));
	  assertFalse(urlVal.isValid("DANIEL"));
	  //end Daniel Domme's code
   }
   
   //You need to create more test cases for your Partitions if you need to 
   
   public void testIsValid()
   {
	   //You can use this function for programming based testing
	    //You can use this function for programming based testing
	   //Start Jonathan Ropp's code
	    System.out.print("\n Start Program-Based Testing...");
	   	
		UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
		//Make string arrays with possible URL building blocks
		String[] schemes = {"http://", "ftp://", "h3t://", ""};
		String[] authority = {"go.com", "255.com", "go.au", ""};
		String[] port = {":80", ":0", ":65535", ""};
		String[] path = {"/test1", "/t123", "/test1/file", ""};
		String[] pathO = {"/t123", "/$23", "/test1//file", "" };
		String[] query = {"action=view", "?action=edit&mode=up", ""};
		
		//Loop through every combination of above strings
		for(int i=0; i<schemes.length; i++){
			for(int j=0; j<authority.length; j++){
				for(int k=0; k<port.length; k++){
					for(int l=0; l<path.length; l++){
						for(int m=0; m<pathO.length; m++){
							for(int n=0; n<query.length; n++){
								//build string based on given iteration of string arrays
								String testUrl = schemes[i]+authority[j]+port[k]+path[l]+pathO[m]+query[n];
								if(urlVal.isValid(testUrl) == true){
									System.out.print("\n " + testUrl + " is valid");
								}
								else{
									//System.out.print("\n " + testUrl + " is invalid");
								}
							}
						}
					}
				}
			}
		}
		System.out.print("/n Finished Testing /n");
		//End Jonathan Ropp's code
   }

   
   


}
