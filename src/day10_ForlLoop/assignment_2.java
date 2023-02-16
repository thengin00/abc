package day10_ForlLoop;

import java.util.Scanner;

public class assignment_2 {

    public static void main(String[] args) {

        //Question 1
        //Write a program to print numbers from 1 to 10.
        System.out.println("Question 1 : ");
        Scanner input= new Scanner(System.in);
        for (int i=1; i<=10; i++ ){
        System.out.println(i);
        }
        System.out.println("--------------------");

        //Question 2
        //Write a program to calculate the sum of first 10 natural number.
        System.out.println("Question 2 : ");
                int num = 10, sum = 0;
                for(int i = 1; i <=num; i++)
                {
                    // sum = sum + i;
                    sum += i;
                }
                System.out.println("Sum of the first 10 natural number is " + sum);
        System.out.println("--------------------");

        //Question 3
        //Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
        System.out.println("Question 3 : ");

        Scanner multi= new Scanner(System.in);
        System.out.println("Enter a number");
        int nmb= multi.nextInt();

        for (int i=0; i<10; i++){
            System.out.println(nmb + " * "+ (i+1) + " = "+ (nmb*(i+1)));
        }
        System.out.println("--------------------");

        //Question 4
        //Write a program to find the factorial value of any number entered through the keyboard.

        System.out.println("Question 4 : ");
        System.out.println("Enter your number : ");
        int number1;
        int factor = 1;

        Scanner newscan= new Scanner(System.in);
        number1 = newscan.nextInt();

        for(int i=1; i<=number1; i++)
        {
            factor *= i;
        }

        System.out.println(number1 + " != " + factor);

        System.out.println("--------------------");
//Question 5
//Two numbers are entered through the keyboard.
// Write a program to find the value of one number raised to the power of another.
// (Do not use Java built-in method)

        System.out.println("Question 5 : ");

                Scanner raise = new Scanner(System.in);

                int main;
                int other;
                int result = 1;

                System.out.print("Enter the main number : ");
                main = raise.nextInt();

                System.out.print("Enter the other number : ");
                other = raise.nextInt();

                for(int i = 1; i <= other; i++)
                {
                    result *= main;
                }

                System.out.println("Result: "+ result);
        System.out.println("--------------------");
//Question 6
//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
//For example, if the input is 12345, the output should be 54321.
        System.out.println("Question 6 : ");

        Scanner reversenumber= new Scanner(System.in);
        System.out.println("Enter an integer number : ");
       int  nbr1=reversenumber.nextInt();
       String number= " "+nbr1;
       int snnumber= number.length()-1;
       String reverse= " ";

       for( int i=snnumber; i>=1; i--){
           reverse += number.charAt(i);
       }
        System.out.println("Reverse of Your Integer Number is : ");
        System.out.println(reverse);
        System.out.println("--------------------");

    //Question 7
    //Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        System.out.println("Question 7 : ");


        Scanner scanne= new Scanner(System.in);
        int odd = 0;
        int even = 0;

        for (int i = 1; i <= 4; i++){
            System.out.println("Please enter " + i+" number : " + " ");
            int number3 = scanne.nextInt();
            if (number3 % 2 == 0){
                even= even+number3;
            }else{
                odd= odd+number3;
            }
        }

        System.out.println("Sum of the even numbers : " + even);
        System.out.println("Sum of the odd numbers : "+ odd);
        System.out.println("--------------------");


//Question 8
//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.

//Note : prompt the user to input means : ask user to put input which you need a scanner class
        System.out.println("Question 8 : ");

        System.out.println("Enter positive number");
        int prime=input.nextInt();

        if(prime%2!=0 && prime%3!=0 && prime%5!=0 && prime%7!=0){
            System.out.println("This number is a prime number");
        }else{
            System.out.println("This number is not a prime number");
        }

    }

    }

