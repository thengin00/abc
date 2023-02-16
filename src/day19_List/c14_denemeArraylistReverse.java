package day19_List;

import java.util.ArrayList;
import java.util.List;

public class c14_denemeArraylistReverse {
    public static void main(String[] args) {


        ArrayList<Integer> list= new ArrayList<>();

        // add numbers from 1 to 8

        for (int i=1; i<9; i++){
            list.add(i);
        }
        System.out.println(list);
        System.out.println("reverseArraylist(List) = " + reverseArraylist(list));
    }


    // creating a method that will print the arraylist in reversed order

    public static ArrayList<Integer> reverseArraylist(ArrayList<Integer> numbers){

        // last index to first index

        ArrayList<Integer> reversedlist= new ArrayList<>();

        for (int i=numbers.size()-1; i>=0; i--) {
            reversedlist.add(numbers.get(i));

        }
        return  reversedlist;
    }
}
