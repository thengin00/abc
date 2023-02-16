package da03_variablesContinue;

public class c9_homework {


//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//Expected Output :
//Hello
//Alexandra Abramov

    public static void  main(String [ ] args) {



        int qn1=1;
        System.out.print(qn1 + " -");
        System.out.println(" Hello" + "\n\tAlexandra Abramov");


//2. Write a Java program to print the sum of two numbers.
//Test Data:
//74 + 36
//Expected Output :
//110
//
        int qn2=2;
        int i1 = 74;
        int i2 = 36;
        System.out.println((qn2 +" - ")+ "The Sum of 74 + 36 =" +(i1+ i2));


//3. Write a Java program to divide two numbers and print on the screen.
//Test Data :
//50/3
//Expected Output :
//16
//
        int qn3 =3;
    int in1= 50;
    int in2= 3;

    System.out.println( (qn3 + " - ")+ "Divide 50 by 3 = "+(in1/ in2));


//4. Write a Java program to print the result of the following operations.
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
//
        int qn4= 4;
    int i3=-5;
    int i4= 8;
    int i5= 6;

    System.out.println( (qn4 + " -  a. ")+  ((i4*i5)+i3));

    int i6= 55;
    int i7=9;
    System.out.println( " \t b. " +(i6+i7) %i7);

    int i9=20;
    int i10= -3;
    int i11=5;
    int i12=8;
    System.out.println(" \t c. " + (i9+i10*i11/i12));

    int i13=15;
    int i14=2;
    System.out.println("\t d. " + (i11+i13/in2*i14-i12%in2) );


//5. Write a Java program that takes two numbers as input and display the product of two numbers.
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125
//

      int i15=25;
      String s1= " 25 * 5 = ";
      int qn5= 5;
      System.out.println((qn5+" - ")+s1 +(i15*i11) );

//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//
      int qn6= 6;
      int i16=125;
      int i17= 24;
      System.out.println((qn6+ " - ") + (i16 +" + " + i17 +" =") +(i16+i17));
      System.out.println(("\t") + (i16 +" - " + i17 +" =") +(i16-i17));
      System.out.println(("\t") + (i16 +" * " + i17 +" =") +(i16*i17));
      System.out.println(("\t") + (i16 +" / " + i17 +" =") +(i16/i17));

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
        int qn7=7;
        int i18=1;
        System.out.println((qn7+" - ")+i12+ " * "+i18 +" = " +(i12*i18));
        System.out.println(("\t")+i12+ " * "+ (++i18)+ " = " + (i12*+i18));
        System.out.println(("\t")+i12+ " * "+ (++i18)+ " = " + (i12*+i18));
        System.out.println(("\t")+i12+ " * "+ (++i18)+ " = " + (i12*+i18));
        System.out.println(("\t")+i12+ " * "+ (++i18)+ " = " + (i12*+i18));
        System.out.println(("\t")+i12+ " * "+ (++i18)+ " = " + (i12*+i18));
        System.out.println(("\t")+i12+ " * "+ (++i18)+ " = " + (i12*+i18));
        System.out.println(("\t")+i12+ " * "+ (++i18)+ " = " + (i12*+i18));
        System.out.println(("\t")+i12+ " * "+ (++i18)+ " = " + (i12*+i18));
        System.out.println(("\t")+i12+ " * "+ (++i18)+ " = " + (i12*+i18));

//8. Write a Java program to display the following pattern.
//Sample Pattern :
//
//   J    a   v     v  a
//   J   a a   v   v  a a
//J  J  aaaaa   V V  aaaaa
// JJ  a     a   V  a     a
//
        int qn8=8;
        System.out.println(qn8+ " - "+ "Sample Pattern : ");
        System.out.println("\tJ    a   v     v  a");
        System.out.println("\tJ   a a   v   v  a a");
        System.out.println("\tJ  J  aaaaa   V V  aaaaa");
        System.out.println("\tJJ  a     a   V  a     a");

//9. Write a Java program to compute the specified expressions and print the output.
//Test Data:
//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//Expected Output
//2.138888888888889
//
        int qn9= 9;
        double d1= 25.5;
        double d2=3.5;
        double d3=40.5;
        double d4=4.5;
        System.out.println((qn9+" - ")+(d1*d2-d2*d2)/(d3-d4));

//10. Write a Java program to compute a specified formula.
//Specified Formula :
//4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
//Expected Output
//2.9760461760461765

        int qn10= 10;
        int m1=1;
        int m2=m1+2;
        int m3=m2+2;
        int m4=m3+2;
        int m5=m4+2;
        int m6=m5+2;
        double m7=4.0;
        double m8=1.0;
        System.out.println((qn10+" - ")+m7* (m1- (m8/m2) + (m8/m3) - (m8/m4) + (m8/m5) - (m8/m6)));
//11. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        int qn11=11;
        int b1= 38;
        int b2= 46;
        int b3=58;
        System.out.println((qn11+" - ")+"Average of "+b1+" - "+b2+" - "+b3 +" = " + ((b1+b2+b3)/3));

    }
}
