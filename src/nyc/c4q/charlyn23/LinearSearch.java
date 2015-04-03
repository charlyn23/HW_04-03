package nyc.c4q.charlyn23;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by charlynbuchanan on 4/1/15.
 * You are given an ArrayList of unknown size containing integers. Write a class called
 * LinearSearch which implements a static method search which accepts as input an ArrayList
 * alist and an integer x, and returns the first index it sees of x in alist. If the
 * integer is not present return in the list return -1
 */

public class LinearSearch {
    public static int search(ArrayList<Integer> alist, int number) {


        int index;
        //Integer index = alist.get(number);
        for (int i = 0; i < alist.size(); i++) {
            //while (true){
            if (alist.contains(number)) {
                return alist.indexOf(number);

            } else {
                System.out.println("-1");
                return -1;
            }
        }
        return -1;
    }

//    public static int search(ArrayList<Integer> alist, int number) {
//        return alist.indexOf(number);
//    }


    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<Integer>();
        alist.add(3);
        alist.add(45);
        alist.add(1);
        alist.add(2);
        alist.add(99);
        alist.add(1);
        System.out.println(alist);

        System.out.println(search(alist, 1));
    }
}
