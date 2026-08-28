/* /*package whatever //do not write package name here */
/* 
import java.io.*;
import java.util.*;



class prac7{
    
       
    
    public static void main (String[] args) {
		

        //Queue<Integer> q= new ArrayDeque<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(15);
        list.add(20); 

        Object[] arr= list.toArray();

        for(Object x: arr)
        {
            System.out.print(x+" ");
        }
		
    }
}
 */


/*package whatever //do not write package name here */
/* 
import java.io.*;
import java.util.*;



class prac7{
    
       
    
    public static void main (String[] args) {
		

        
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(15);
        list.add(20); 

        

        //array created internally and referenced to arr
        Integer[] arr=list.toArray(new Integer[0]);


        for(Integer x: arr)
        {
            System.out.print(x+" ");
        }
		
    }
} */

    //with generics

    /*package whatever //do not write package name here */

import java.io.*;
import java.util.*;



class GFG{
    
       
    
    public static void main (String[] args) {
		

       
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(15);
        list.add(20); 

        Integer[] arr= new Integer[list.size()];

        arr=list.toArray(arr);


        for(Integer x: arr)
        {
            System.out.print(x+" ");
        }
		
    }
}
