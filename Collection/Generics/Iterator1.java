/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Iterator1 {

    // static void removeEven(Collection<Integer> C) {
    // Iterator<Integer> it = C.iterator();

    // while (it.hasNext()) {
    // int x = (Integer) it.next();

    // if (x % 2 == 0)
    // it.remove();
    // }

    // }

    // More gernalized accept any type
    static void removeEven(Collection<?> C) {
        Iterator<?> it = C.iterator();

        while (it.hasNext()) {
           int x=(int) it.next();
            if(x%2==0)
            it.remove();
        }
    }

    public static void main(String[] args) {

        Collection<Integer> C = new ArrayList<Integer>();

        C.add(10);
        C.add(15);
        C.add(20);

        removeEven(C);

        System.out.println(C);

    }
}
