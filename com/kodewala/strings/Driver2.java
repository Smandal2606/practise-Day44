
   package com.kodewala.strings;
   
   class User{
    String firstName;
	
	User(String firstName){
	this.firstName = firstName;
	}
   }
   class Driver1
   {
     public static void main(String[] args)
   {
    String s1 = "Kodewala";
	String s2 = "Kodewala";
	
	// compare the address of an object
	
	System.out.println(s1 == s2);  // true
	
	User user1 = new User("kodewala");
	User user2 = new User("kodewala");
	
	// .equals() compare the content. By default equals()compare the reference
	System.out.println(s1.equals(s2));  // false; 
   
   }
   }