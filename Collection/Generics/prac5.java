/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Student{
    
}

class EnggStudent extends Student{
    
}

class Test{
    
    public static void main (String[] args) {
        Student s1= new Student();
		EnggStudent s2 = new EnggStudent();
		//without generics assigning is possible
		s1=s2;
		
		// ArrayList<Student> al1 = new ArrayList<>();
		// ArrayList<EnggStudent> al2 = new ArrayList<>();
		//With Generics inheritance type reference is not possible so there is a concept of wildcard in generics
		// al1=al2;


        //Wild Card Assign any type
        // ArrayList<?> al1 = new ArrayList<>();
		// ArrayList<EnggStudent> al2 = new ArrayList<>();
		
		// al1=al2;

        //Upper Bounding
		// ArrayList<EnggStudent> al2 = new ArrayList<>();
        // ArrayList<? extends Student> al1 = new ArrayList<>();
		// al1=al2;

        // Lower Bounding
		ArrayList<Object> al2 = new ArrayList<>();
        ArrayList<? super Student> al1 = new ArrayList<>();
		
		al1=al2;
		
	}
}
