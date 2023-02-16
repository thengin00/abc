package day16_Methods;

public class c9_evde {



    public static void main(String[] args) {


        String[] array = {"A", "B", "B", "C"};
        System.out.println(array.toString());

        for (int p = 0; p < array.length; p++) {
            int count = 0;
            for (int w = 0; w < array.length; w++) {
                if (array[p] == array[w]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(array[p]);
            }
        }
    }
}
 /*Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B

                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C */