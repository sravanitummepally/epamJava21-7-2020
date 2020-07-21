package java8;

import java.util.*; 
import java.util.stream.IntStream; 

public class Average_of_Integers {
	 public static void main(String[] args) 
	    {
	        IntStream stream = IntStream.of(2, 3, 3, 4, 6, 7, 8); 
	        OptionalDouble objj1 = stream.average(); 
	        if (objj1.isPresent()) { 
	            System.out.println(objj1.getAsDouble()); 
	        } 
	        else { 
	            System.out.println("-1"); 
	        } 
	    } 

}