// /*package whatever //do not write package name here */

// import java.io.*;
// import java.util.*;
// import java.util.function.*;

// class prac8 {
   
// 	public static void main (String[] args) {
	
// 	String a[] = {"GFG","IDE","Courses"};
// 	String b[] = {"gfg","ide","courses"};
	
// 	if(Arrays.equals(a,b,String::compareToIgnoreCase))
// 	    System.out.println("Yes");
	
// 	else
// 	    System.out.println("No");
	
// 	}
	
// }

/*package whatever //do not write package name here */


import java.util.*;

class prac8 {
   
	public static void main (String[] args) {
	
		List<Integer> al= new ArrayList<>(Arrays.asList(10,20,7,8));
		
		al.forEach(prac8::printSquare);
	}
	
	public static void printSquare(Integer x)
	{
	    System.out.println(x*x);
	}
}