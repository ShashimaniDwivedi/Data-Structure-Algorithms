class Pair<T,S>
{
    T x;
    S y;
}


class prac3 {
	public static void main (String[] args) {
		
		Pair<Integer,String> p = new Pair<Integer,String>();
		
		p.x=12;
		p.y="GFG";
		//This give compile time error due to generics
		String str= (String)p.x;
	}
} 
