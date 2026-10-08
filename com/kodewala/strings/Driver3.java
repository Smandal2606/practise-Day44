
   package com.kodewala.strings;
   
   class Driver3
   {
    public static void main(String[] args)
   {
    String s = "Kodewala";
	s.concat(" Academy");
	System.out.println(s); // Kodewala because s.concat does not modify the existing 
	                      // string . It create a new String bur didn't store it  
   
   }
   }