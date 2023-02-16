package day04_ifStatement;

public class c9_deneme1 {
    public static void main(String[] args) {

        //Write a Java program to print the result of the following operations.
    //Test Data:
    //a. -5 + 8 * 6
    //b. (55+9) % 9
    //c. 20 + -3*5 / 8
    //d. 5 + 15 / 3 * 2 - 8 % 3
    //Expected Output :
    //43
    //1
    //19
    //13
        int i1= 5;
        int i2= 8;
        int i3= 6;
        int i4= 55;
        int i5= 9;
        int i6= 20;
        int i7= -3;
        int i8= 15;
        int i9= 3;
        int i10= 2;
        int i11= -5;

        int first1= i11+ (i2*i3);
        System.out.println(first1);
        int second= (i4+i5)%i5;
        System.out.println(second);
        int third= i6+ (i7*i1)/i2;
        System.out.println(third);
        int fourth= i1+ (i8/i9*i10)- (i2%i9);
        System.out.println(fourth);


        System.out.println("-------------------");

        //5. Write a Java program that takes two numbers as input and display the product of two numbers.
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125
int firstnumber= 25;
int secondnumber= 5;
        System.out.println("Your result is "+ firstnumber*secondnumber);

        System.out.println("-------------------");
        //7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
//Test Data:
//Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80
//

        int q1= 8;
        int q2= 1;

        System.out.println(q1 + " * "+ q2+ " = "+q1 * q2++);
        System.out.println(q1 + " * "+ q2+ " = "+q1 * q2++);
        System.out.println(q1 + " * "+ q2+ " = "+q1 * q2++);
        System.out.println(q1 + " * "+ q2+ " = "+q1 * q2++);
        System.out.println(q1 + " * "+ q2+ " = "+q1 * q2++);
        System.out.println(q1 + " * "+ q2+ " = "+q1 * q2++);
        System.out.println(q1 + " * "+ q2+ " = "+q1 * q2++);
        System.out.println(q1 + " * "+ q2+ " = "+q1 * q2++);
        System.out.println(q1 + " * "+ q2+ " = "+q1 * q2++);
        System.out.println(q1 + " * "+ q2+ " = "+q1 * q2++);

//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

        int nbr1= 34;
        int nbr2= 46;
        int nbr3= 68;

        System.out.println((nbr1+nbr2+nbr3)/3);
    }
}
