package day16_Methods;

import java.util.Arrays;
import java.util.Locale;

public class c11_deneme2 {
    public static void main(String[] args) {

        // create a java logic that will count letter a or A from given string
        //example
        //JavA
        //output should be 2

        // we will need to create string you can store de sentence
        // i will need to check each letter
        // how do i check each letter to charat  or split ve can use
        //we pretefe to use split
        // we need to use count how many letter  count is integer
        // how do i check each letter? for each loop method
        // how do you look at is equal= equalignore
        // how do you compare string == egualignore


        String  sentence="Java is best , JavA is fun , Python is Also fun, Hello world";

        String[] letters= sentence.split("");
        System.out.println(Arrays.toString(letters));
        int countletter=0;
        for (String eachletter:letters){

            if (eachletter.equalsIgnoreCase("a")){
                countletter++;
            }
        }
        System.out.println("count of A is : "+countletter);

        // the other method is like that ignorecase
        //sentence.toLowerCase(); or sentence.uppercase()






    }
}
