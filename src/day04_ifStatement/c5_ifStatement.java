package day04_ifStatement;

public class                                     c5_ifStatement {


    public static void main(String[] args) {


        boolean bool1= 10> 5; // true
        boolean b2= 10==12; //false

        if (2>2){// opening bracket for if // false
            // if condition is false java will not check  inside if statement
            System.out.println("hello");
            System.out.println("hello");
            System.out.println("hello");


        } // closing bracket for if
        System.out.println("Java");


        if (1==1) {

            //if if statement is true java will go inside of if statement and exicute the code
            System.out.println("world");
            System.out.println("world");
            System.out.println("world");
        }

        if (b2){ // false

           System.out.println(b2); // this wont be printed

        }

        if (true){ //if is true java will exicute inside if statement
            //inside if

            System.out.println("b2 is " + b2); // b2 is false

        }






    } // closing bracket for main
} // closing bracket for class
