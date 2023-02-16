package day16_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class c10_deneme1 {
    public static void main(String[] args) {
        //create a java program that will ask for 5 string  name to store in the array
        //and print first and last letter from each string

        //example
        //input : berkan , firas ,merve ..
        //output : bn , fs ,me

        // scanner
        // String [] names
        // loop
        // charat

        Scanner input= new Scanner(System.in);

        // we will need to create string array
        // we say array size is fix
        String[]namelist= new String[5];

       // namelist[0]=input.next(); 5 times

        for (int i=0; i<=namelist.length-1; i++){

            System.out.println("Enter name "+ (i));
            namelist[i]=input.next();
        }

        System.out.println(Arrays.toString(namelist));
        String firstandlastletter= "";
        for (String eachname: namelist){
            firstandlastletter=""+ eachname.charAt(0)+ eachname.charAt(eachname.length()-1);
            System.out.println(firstandlastletter);
        }
        // charat method return char what do need to do? we put only ""



    }
}
