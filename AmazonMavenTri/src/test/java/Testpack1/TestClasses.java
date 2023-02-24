package Testpack1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import TestNGPack.TestNGClassFinal;

//generic declaration
public class TestClasses <Y,D>{
	 
	int a ;
	Y b ; //generic use 
	D c ;
	
	Y demo(D c)
	{
	  System.out.println(b);
	  return b ;
	}
	
	// Insertion
	//deletion
	//retrieval
	
	public static void main(String[] args) {
	
		//heterogeneous collection
		
		ArrayList a= new ArrayList() ;
		a.add(34) ;
		a.add('&') ;
		a.add("velocity") ;
		a.add(4567.56) ;
		
		//homogeneous collection 
		ArrayList <Integer> b = new ArrayList<Integer>() ;
		//insertion
		b.add(56);
		b.add(93);
		b.add(78);
		b.add(93);
		b.add(28);
		b.add(82);
		System.out.println("==================");
		System.out.println("Size ="+b.size( ) );
		
		for(int i =0;i<b.size() ;i++)
		{
			System.out.println( b.get(i) );
		}
		
		//deletion
		b.remove(3) ;
		System.out.println("=============");
		
		System.out.println("Size = " + b.size() );
		for(int i=0 ; i<b.size() ; i++)
		{                    //Retrieval
			System.out.println( b.get(i) );
		}
		
		HashSet<String> t = new HashSet<String> () ;
		//Insertion
		
		t.add("Velocity") ;
		t.add("Testing") ;
		t.add("Class") ;
		t.add("Batch") ;
		t.add("2023") ;
		t.add("Class") ;
		
		//Advance for loop
		//for each 
		
		//Retrieval 
		
		for(String x:t )
		{
			System.out.println(x);
		}
		System.out.println("===============");
		
		t.remove("Batch") ;
		for(String x:t )
		{
			System.out.println(x);
		}
		List<String> c = new ArrayList<String>() ;
		c.add("fgh") ;
		c.add("bedfukeuy") ;
		       
		      //Key, value
         HashMap<Integer,String> map = new HashMap<Integer,String> () ;
		//insertion
         map.put(34, "Class") ;
         map.put(84, "Test") ;
         map.put(45, "Pune") ;
         map.put(77, "Velocity") ;
         map.put(87, "Class") ;
         
         //Retrieval
         
         for(Map.Entry<Integer, String> s:map.entrySet() )
         {
        	 System.out.println("Key =" + s.getKey() + "value = "+s.getValue() );
         }
         
         //Deletion
         map.put(null,"Testing") ;
         System.out.println("============");
         for(Map.Entry<Integer,String> s:map.entrySet() )
         {
        	 System.out.println("Key =" + s.getKey() + "value = "+s.getValue() );
         }
         System.out.println("=============");
                  //key,value
         Hashtable<Character,Integer> table = new  Hashtable<Character,Integer>() ;
         
         //Insertion
         
         table.put('&', 34) ;
         table.put('&', null) ;
         table.put('8', 34) ;
         table.put('H', 90) ;
         table.put('l', 23) ;
         
         for(Map.Entry<Integer,String> s:map.entrySet() )
         {
        	 System.out.println("Key =" + s.getKey() + "value = "+s.getValue() );
         }
         System.out.println("============");
         table.put('H', 99) ;
         
         for(Map.Entry<Integer,String> s:map.entrySet() )
         {
        	 System.out.println("Key =" + s.getKey() + "value = "+s.getValue() );
         }
         
         Hashtable <String,Float>student1=new Hashtable<String,Float>() ;
         
         //insertion
         student1.put("Maths", 50f) ;
         student1.put("Science",67f) ;
         student1.put("History", 78f) ;
         student1.put("Marathi", 96f) ;
         student1.put("English", 82f) ;
         student1.put("Java", 89f) ;
         student1.put("Selenium", 55f);
         student1.put("Jira", 44f) ;
         student1.put("Sql",45f);
         student1.put("Api",63f) ;
         student1.put("Project1",88f);
         student1.put("Project2", 89f) ;
         student1.put("Manual1", 74f) ;
         student1.put("Manual2",85f) ;
         student1.put("English",56f);
         student1.put("Framework",65f);
         student1.put("hindi",33f);
         student1.put("Environment", 64f);
         student1.put("french", 84f) ;
                  
         //deletion
         
         map.remove(87) ;
         
         System.out.println("================");
         
		TestClasses x=new TestClasses () ;
		x.a=23;
//		x.b=45;
//		x.b="Velocity" ;
//		x.b='&' ;
//		x.b=56.86 ;
//		x.b= new TestNGClassFinal() ;
	
		
		TestClasses<String,Character> Y = new TestClasses <String, Character>();
		Y.a=56;
		Y.b="Velocity" ;
        Y.c= '&' ;
        String data = Y.demo('&') ;
        
        TestClasses<Integer,String> z = new TestClasses<Integer,String>() ;
        z.b =67 ;
    //  z.b ='&' ;
        z.c="Velocity" ;
        
	
	}
	
}
