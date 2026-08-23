import java.io.*;
//give classcast exception
class Pair{
    Object x;
    Object y;
}
class prac1 {
	public static void main (String[] args) {
	Pair p= new Pair();
	
	p.x=12;
	p.y="GFG";
	//can't convert int to string
	String str=(String)p.x;
	}
}