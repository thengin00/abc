package day17_ReturnMethods;

import java.util.Arrays;

public class c11_Assignment2 {
    public static void main(String[] args) {
        System.out.println("****************");
        System.out.println("Question 1 : ");

        int[] numbers = {2, 6, 14, 78, 90, 54, 64};
        int[] numbers2 = {-9, 87, 65, 43, 24, 1, 4, 7, 876, 625};
        System.out.println(Arrays.toString(ascending(numbers)));
        System.out.println("****************");
        System.out.println("Question 2 : ");

        System.out.println(Arrays.toString(descending(numbers2)));
        System.out.println("****************");
        System.out.println("Question 3 : ");

        finra(30);
        System.out.println();
        System.out.println("****************");
        System.out.println("Question 4 : ");
        divisibleby15(100);
        System.out.println();
        divisibleby3(100);
        System.out.println();
        divisibleby5(100);

        System.out.println();
        System.out.println("****************");
        System.out.println("Question 5 : ");

      evenoddnumber(15);
        evenoddnumber(20);


    }
    //(Array) Sort Ascending
//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//Ex:
//            int[] arr = {10, 9, 8, 7};
//
//             arr = Sort(arr);         ==>{ 7, 8, 9, 10};

    public static int[] ascending(int[] arr) {

        Arrays.sort(arr);
        int[] ascendnumber = new int[arr.length];
        int firstindex = 0;
        for (int i = 0; i < ascendnumber.length; i++) {
            ascendnumber[i] = arr[firstindex];
            firstindex++;


        }
        // System.out.println(Arrays.toString(ascendnumber));
        return ascendnumber;
    }

    //(Array) Sort Descending
//Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
//Ex:  int[] arr = {10,20,7, 8, 90};
//                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};

    public static int[] descending(int[] arr) {

        Arrays.sort(arr);
        int[] descendnumber = new int[arr.length];
        int lastIndex = arr.length - 1;

        for (int i = 0; i < descendnumber.length; i++) {
            descendnumber[i] = arr[lastIndex];
            lastIndex--;


        }
        return descendnumber;


    }

    //(Numbers) FINRA
//Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
// print "FIN" instead of the number and for numbers which are a multiple of 5,
// print "RA" instead of the number. for numbers which are a multiple of both 3 and 5,
// print "FINRA" instead of the number.
    public static void finra(int number) {


        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 5 == 0 ) {
                System.out.print("FIN ");
            } else if ( i%3==0 ) {
                System.out.print("RA ");
            }else{
                System.out.print(i +" ");
            }
        }

    }


    //(Numbers) Divisible by 3, 5, 15
//Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
//if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
//if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
//if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
//ex:
//OutPut:
//Divisible By 15 15 30 45 60 75 90
//Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
//Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
public static void divisibleby15(int number15){
        int n1=0;
        for (int i=0; i<=number15; i++){
            if (i%3==0 && i%5==0 && i%15==0){
                n1=i;
                System.out.print(n1+ " ");
            }

        }
}
public static void divisibleby3(int number3){
        int n2=0;
        for (int i=0; i<=number3; i++){
            if (i%3==0 && i%15!=0){
                n2=i;
                System.out.print(n2+ " ");
            }

        }
}
    public static void divisibleby5(int number5){
        int n3=0;
        for (int i=0; i<=number5; i++){
            if (i%5==0 && i%15!=0){
                n3=i;
                System.out.print(n3+ " ");
            }

        }
    }
    //(Numbers) Odd & Even numbers
//Write  a method which can identifies given number is even or odd
public static void evenoddnumber(int evenodd){

            if (evenodd%2==0){
                System.out.print( evenodd+ " is a even number.  ");
            } else if (evenodd%2!=0){
                System.out.print(evenodd+ " is an odd number. ");
            }

}

}







