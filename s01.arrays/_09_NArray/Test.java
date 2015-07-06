package _09_NArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(2, 3, 2));
        l.add(3);
        l.add(3);
        foo(l);
    }
    
    private static void foo(final List<Integer> l) {
        ArrayList<Integer> list = new ArrayList<>(l);
        // now list is [1, 1]
        if (list.get(3) == list.get(4)) {
            System.out.println("aa");
        } else {
            System.out.println("there");
        }
        
    }

}
