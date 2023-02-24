package Testpack1;

public class TestClass {

	public static void main(String[] args) {
	
		
//		try {
//			//exceptional code
//		}
//		catch(         )
//		{
//		    //alternative code 
//			//solution of exception 
//		}
//		
//		finally
//		{
//		    //the code will execute either exception is handled or not 
//		}
		
		 
		System.out.println("START") ;
		System.out.println("AfterMethod");
        System.out.println("AfterClass");
        System.out.println("BeforeClass");
        System.out.println("BeforeMethod");
        System.out.println("Test");
        System.out.println();
        
		int a= 23;
		int b=0;
		int c= 0;
		int i=7;
		int d[] = {56,67,45,90} ;
		
		try {
			
		c=a/b ;
		System.out.println("HELLO");
		 try 
		 { 
		    System.out.println(d[i]);		
		 }
		 
		 catch (ArithmeticException e) {
			System.out.println("Alternative code");
			b=1 ;
			c = a/b ;
			System.out.println("Hello");
			
			try {
				System.out.println(d[i]);
			}
			
			catch(ArrayIndexOutOfBoundsException t)
			{
				System.out.println("Alternative ArrayIndexOutOfBoundsException");
			}
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Alternative ArrayIndexOutOfBoundsException");
			System.out.println("Hello");
			System.out.println("ArrayOutOfBoundException");
			System.out.println("NoSuchElementFoundException");
			System.out.println("TestNGexception");
			System.out.println("StaleElementException");
			System.out.println("ElementNotInteractableException");
			System.out.println("WindowNotFoundException");
			System.out.println("ArrayOutOfBoundException ");
			System.out.println("test thread count");
			System.out.println("Thread.sleep");
			System.out.println("get text");
			System.out.println("get attribute");
			System.out.println("ElementNotClickableException");
			System.out.println("get Method");
			System.out.println("get aftermethod");
			System.out.println("get test");
			System.out.println("get after class");
			System.out.println("get before class");
			System.out.println("get ");
			System.out.println("");
			

		}
		
		
		//NormalFlow 
		
		
		System.out.println(c);
		System.out.println("End");
	
		//1.exception is not generated
		//try -> Normal Flow  
		
		//2.Exception is generated and get handle 
		//try -> catch -> Normal Flow 
		
		//3. exception is generated but not handle
		//try -> ------------
		
		System.out.println("hiiii");
		System.out.println("HELLOO");
		System.out.println("After method");
		System.out.println("before method");
		System.out.println("before method");
		System.out.println("Test");
		System.out.println("Before class");
		System.out.println("before method");
		System.out.println("before test");	
		System.out.println("before test");
		
		//final - keyword 
		//used with variable , methods, class 
		//final variable - value can't be change 
		//final method - cant be override 
		//final class - cant be inherited
		
		
		//finally - block
		// it is used to placed to importance code which should be execute
		//either exception is handled or not 
		
		//finalize - method
		//used to execute the memory cleanup activity code
		
		
		}
		
}

	
	
	