package day17_ReturnMethods;

import java.util.Arrays;

public class c5_deneme1UniqueLetter {
    //Write a program that can print out the unique values from a String Array
    //            Ex:
    //                if arr -> {"A", "A", "B", "C", "C"}
    //                output: B
    //
    //                if arr -> {"A", "B", "B", "C"}
    //                output:  A
    //                         C
    // */

    //the ones only available in array for one time will be unique doesn't repeat it
    //count of string or letter will be only one
    //I should only print letters that has count==1
    //to check letter count you will need to compare with all letters and when it equals count will be increased
    //count 1 are unique
    //count 2,3,4,5 .... are not unique

    public static void main(String[] args) {
        String [] letters={"A", "A", "B", "C", };

        for (String eachletter: letters){

            int count=0;
            for (String eachletter2:letters){
                if (eachletter2.equals(eachletter)){
                    count++;
                }
            }
           if (count==1){
               System.out.println(eachletter);
           }
        }
        System.out.println("------------");
        String []  arr ={"A", "B", "B", "C"};
        uniqueFromArray(arr);

    }

    public static void uniqueFromArray(String[] letters){
       // String [] letters={"A", "A", "B", "C", };
        //no need this one because we want make sure to run this method for different String arrays
        for (String eachletter: letters){

            int count=0;
            for (String eachletter2:letters){
                if (eachletter2.equals(eachletter)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(eachletter);
            }
        }





    }
    public static void uniqueFromArray2(String[] letters){
        //String [] letters = {"A", "A", "B",  "C","D","D"};
        //no need this one because we want make sure to run this method for different
        System.out.println(Arrays.toString(letters));

        for (int i=0; i <letters.length; i++){
            int count=0;
            for (int i1=0; i1<letters.length; i1++){
                if (letters[i1]== letters[i]){
                    count++;
                }
            }
           if (count==1){
               System.out.println(letters[i]);
           }
        }
    }

}
