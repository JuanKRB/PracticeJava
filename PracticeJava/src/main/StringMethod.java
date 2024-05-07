package main;

public class StringMethod {

	public static void main(String[] args) {
		
		String str1 = "Hi";
		
		String str2 = " you";
		
		String str3 = str1 + str2;
		
		System.out.println(str1.length());
		
		//Get characters
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        
        //Concat
        System.out.println(str1.concat(str2));
        
        //Get from 0 to 4 
        System.out.println(str3.substring(0, 4));
        
        //Compare
        System.out.println(str2.equals(str1));
        
        //Check if it contains
        System.out.println(str3.contains("Hi"));
        
        //To change to lower case or upper case
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        
        //Remove White Spaces
        System.out.println(str2.trim());

        
	}

}
