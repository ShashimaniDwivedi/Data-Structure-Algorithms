
class prac2{
    //T describes the input type; int describes the return type.
    public static <T> int count(T arr[], T x)
    {
        int res=0;
        
        for(T e:arr)
        {
            if(e.equals(x))
                res++;
        }
        
        return res;
    }
    
    public static void main (String[] args) {
		
		// Integer arr[] = {10,20,30,40,10,30};
         Character arr[] = {'a', 'b', 'a', 'd', 'e', 'a'};
		
		System.out.println(count(arr,'a'));
	}
}
