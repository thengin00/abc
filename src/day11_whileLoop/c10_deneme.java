package day11_whileLoop;

import java.util.Scanner;

public class c10_deneme {
    public static void main(String[] args) {

        //create a java logic that will sum the given numbers
//ex if input is 5 ;
//output will be 1 + 2 +3 + 4 +5 == 15

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number= input.nextInt();
        System.out.println("number is "+number);

        int start=0;
        int sum=0;
        while (start<=number){

            sum+=start;
            start++;

        }

        System.out.println("Sum of the number is "+sum);




    }
}
