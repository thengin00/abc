package day04_ifStatement;

public class c8_homework2 {

    public static void main(String[] args) {

        //1.Write a Java program that takes 4 numbers as input to calculate and print the average of the numbers.

        int i1= 120;
        int i2= 150;
        int i3= 180;
        int i4= 280;

        int avr= (i1+i2+i3+i4)/4;
        System.out.println(avr);

//2.please write a program that will return max number from 3 numbers

        int x=20;
        int y=30;
        int z=40;

        boolean b1= x>y && x>z;
        boolean b2= y>x && y>z;
        boolean b3= z>x && z>y;

        if (b1){
            System.out.println(x);
        }

        if (b2) {
            System.out.println(y);
        }

        if (b3){
            System.out.println(z);
        }
        //16. Write a Java program to print a face. Go to the editor
//Expected Output
//
//          +"""""+
//         [| o o |]
//          |  ^  |
//          | '-' |
//          +-----+

        System.out.println("+\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");


//32. Write a Java program to compare two numbers. Go to the editor
//Input Data:
//Input first integer: 25
//Input second integer: 39
//Expected Output
//
//25 != 39
//25 < 39
//25 <= 39

        int frs= 25;
        int scd= 39;

        boolean bl1 = 25 != 39;
        boolean bl2 = 25 < 39;
        boolean bl3 = 25 <= 39;

        if(bl1){
            System.out.println("25 != 39");
        }
        if(bl2){
            System.out.println("25 < 39");
        }
        if( bl3){
            System.out.println("25 <=39");
        }

        //3.create a java program to check number is positive or negative

        int nt1= -15;
        int nt2=  15;

        boolean bln1= nt1<0;
        boolean bln2= nt2>0;

        if (bln1){
            System.out.println(nt1 +" is negative number");
        }

        if (bln2){
            System.out.println(nt2+ " is positive number" );
        }

    }
}
