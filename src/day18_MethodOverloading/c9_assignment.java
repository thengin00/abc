package day18_MethodOverloading;

import java.time.LocalDate;

public class c9_assignment {

    /*
    1. create an array of string, store five of your friends names in it
    2. create Array of localdates and store their birthdays in the same order
    3. use for loop to print out your friends' names and their birthdays
     */

    public static void main(String[] args) {

        String [] friends = {"Meral", "Fusun", "Yonca", "Eda", "Sefika"};

        LocalDate [] birthday =
                {       LocalDate.of(1985, 12, 25),
                        LocalDate.of(1971,11,18),
                        LocalDate.of(1985,8,29),
                        LocalDate.of(1978,9,30),
                        LocalDate.of(1983,7,12)};
        for (int i=0; i<= friends.length-1; i++){
            System.out.println("My friend is "+ friends[i]+ "'s birthday is "+birthday[i]);
        }



    }



}
