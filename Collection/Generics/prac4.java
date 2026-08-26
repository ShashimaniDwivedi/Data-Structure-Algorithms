class MyGen<T>
{
     static int count;
     
     MyGen()
     {
         count++;
     }
}

class prac4{
    
    public static void main (String[] args) {
		
		MyGen<Integer> m1= new MyGen<>();
		MyGen<String> m2 = new MyGen<>();
		
		System.out.println(MyGen.count);
	}
}
 
