package _09_NArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    /**
     * Summary: 
     * 1. [0-127], same number will auto boxing to same object
     * 2. [128-], same number will auto boxing to different object
     * 3. use equals() to compare the real int value
     * 4. when using '==', if one side is explicit int, then the other 
     *    side will automatically de-boxing to int
     */
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(2, 3, 2, 128, 128));
        l.add(128);
        l.add(128);
        lessThan127(l);
        explicitBoxing();
        moreThan127();
        deBoxing();
    }
    
    // 1. for number [0 - 127], same number will auto boxing to the same
    //    object
    private static void lessThan127(final List<Integer> l) {
        ArrayList<Integer> list = new ArrayList<>(l);
        if (list.get(0) == list.get(2)) {
            System.out.println("goes here");
        } else {
            System.out.println("not here");
        }
    }

    // for explicit auto boxing, they will auto boxing to different objects
    private static void explicitBoxing() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(1));
        if (list.get(0) == list.get(1)) {
            System.out.println("not here");
        } else {
            System.out.println("goes here");
        }
    }

    // number that is larger than 127 will auto boxing to different objects
    // use equals() to compare their real value
    private static void moreThan127() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(129);
        list.add(129);
        if (list.get(0) == list.get(1)) {
            // comparing two reference values
            System.out.println("not here");
        } else {
            System.out.println("goes here");
        }
        if (list.get(0).equals(list.get(1))) {
            // comparing two real int values
            System.out.println("goes here");
        } else {
            System.out.println("not here");
        }
    }

    private static void deBoxing() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(129);
        int number = 129;
        if (list.get(0) == 129) {
            // comparing two reference values
            System.out.println("goes here");
        } else {
            System.out.println("not here");
        }

        if (list.get(0) == number) {
            // comparing two reference values
            System.out.println("goes here");
        } else {
            System.out.println("not here");
        }
        
    }
    
}
