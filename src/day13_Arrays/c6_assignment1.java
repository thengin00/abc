package day13_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class c6_assignment1 {

    public static void main(String[] args) {

        //Question 1
    //
    //Write Java statements that do the following:
    //a) Declare an array numArray of 15 elements of type int.
    //b) Output the value of the tenth element of the array alpha.
    //c) Set the value of the fifth element of the array alpha to 35.
    //d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
        System.out.println("Question 1 : ");
        System.out.println("--------------------");
        int[] numbers = {12,14,16,18,20,22,24,26,28,32,34,36,38,42,44};

        int lengthofnumbers = numbers.length;
        System.out.println("- Your numbers length is "+lengthofnumbers);


        System.out.println("- Tenth number is " + numbers[10]);


        numbers[5] = 35;
        System.out.println("- Your fifth number is " +numbers[5]);

        //d) Set the value of the ninth element of the array alpha
        // to the sum of the sixth and thirteenth elements of the array alpha.
        numbers[9] = numbers[6] + numbers[13];
        System.out.println("- Your ninth number is sum of the "+ numbers[6] + " + " + numbers[13]+ " = "+numbers[9] );

        //Question 2
//
//a) Write a statement that declares a string array initialized with the following strings:
//"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
//b) Write a loop that displays the contents of each element in the array that you declared.
        System.out.println("Question 2 : ");
        System.out.println("--------------------");

        String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i <= days.length-1; i++) {
            System.out.println(days[i]);
        }

//Question 3
//
//Write a program that creates an array of 10 elements size.
// Your program should prompt the user to input numbers in array and then display the sum of all array elements.
        System.out.println("Question 3 : ");
        System.out.println("--------------------");
        Scanner input=new Scanner(System.in);
        int[] Number = new int[10];
        int sum =0;

        for (int i = 0; i <= Number.length-1; i++) {
            System.out.println("Enter your ten numbers  here : ");
            Number[i] = input.nextInt();
        }


        for (int i1 = 0; i1 <=Number.length-1; i1++) {
            sum += Number[i1];
        }
        System.out.println("Sum of numbers is " + sum);

        //Question 4
//
//The variable list1 and list2 are reference arrays that each have 5 elements.
// Write code that copies the values in list1 to list2. Values in list1 are input by user.
        System.out.println("Question 4 : ");
        System.out.println("--------------------");

       Scanner output = new Scanner(System.in);

      //  for (int i = 0; i < list1.length; i++) {
       //     list1[i] =output.nextInt();

       //     list1[i] = list2[i];
      //  }


      //  System.out.println(list1);



        int [] list1=new int[5];
        int [] list2=new int[5];

        System.out.println("Enter 5 numbers : ");

        for (int i=0; i<list1.length; i++){
            list1[i]=output.nextInt();
            list1[i]=list2[i];
        }
        System.out.println("new list1" + Arrays.toString(list1));
        System.out.println("new list2" + Arrays.toString(list2));

    }









    }

