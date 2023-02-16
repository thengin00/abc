package day05_ifcontinue;

public class c8_deneme1 {
    public static void main(String[] args) {
        // Write a Java program to compare two numbers. Go to the editor
        //Input Data:
        //Input first integer: 25
        //Input second integer: 39
        //Expected Output
        //
        //25 != 39
        //25 < 39
        //25 <= 39

        int i1= 25;
        int i2=39;
        if (i1!=i2){
            System.out.println("Hello");
        }
        if(i1<i2){
            System.out.println("World");
        }
        if(i1<=i2){
            System.out.println("Hello World");
        }

        // 2 number
        // please create a java program to check if this 2 number equal or not
        // if it is equal print :  numbers are equal
        // if it is not print: numbers are not equal


        if( i1!=i2){
            System.out.println(" Your numbers are not equal . ");
        } else{
            System.out.println("Your numbers are equal . ");
        }
        System.out.println("---------------");
        int e1=10;
        int e2=20;
        int max;
        if(e1>e2){
            max= e1;
            System.out.println("Your max number is " + e1);
        }else {
            System.out.println("Your max number is "+ e2);
            max= e2;
        }

        System.out.println("-----------------");
        int number3=35;
        int number4=45;

        int max2;

        max2 = (number3>number4)?number3:number4;
        System.out.println(max2);


        System.out.println("------------------------------");
        //task 1: create a java program that will check if number is divisible by 2 and 5 same time

        int ber= 300;

        if (ber%2==0 && ber%5==0){
            System.out.println("Your number is divisible 2 and 5 " + ber);
        }

        //task 2: write  java program to find the largest among three numbers. 1) Using if-else..if
        int ei1= 18;
        int ei2= 34;
        int ei3= 46;

        if(ei1>ei2 && ei1> ei3){
            System.out.println("Your largest number is "+ ei1);
        } else if (ei2>ei1 && ei2> ei3){
            System.out.println("Your largest number is "+ ei2);
        } else{
            System.out.println("Your largest number is "+ ei3);
        }

    }
}
