package day04_ifStatement;

public class c3_logicalOperators {


    public static void main(String[] args) {

        // && --and
        //  -- or
        // ! -- not (opposite)


        //&& -- and

        System.out.println( (5>3) && (3>5)); //(true && false = false
        System.out.println((10<5) && ( 0==0)); // false && true= false
        System.out.println( (1==2) && (2!=2)) ; // false && false= false
        System.out.println((10>=10) && (10<=10)); // true && true = true

        // if you are using and operator only option that you will get your result is all conditions true
        // true && true && true && false && true == false

        System.out.println("***********");


        // || -- or
        System.out.println( (5>3) || (3>5)); //(true && false = true
        System.out.println((10<5) || ( 0==0)); // false && true= true
        System.out.println( (1==2) || (2!=2)) ; // false && false= false
        System.out.println((10>=10) || (10<=10)); // true && true = true


        // shift plus \  == |
        // shift number 7 == &

        // true || true || true || false || true == true
        // false|| true|| false== true

        System.out.println("**********");

        // ! == not (opposite)
        // ! true== false
        // !!false==  ! true ==> !! == false

        boolean bool1=true;
        boolean bool2= !(10  !=15); // !(true) == false
        System.out.println(bool1 && bool2); //  true && false


        Boolean bool3= !!!!!!bool1; // true



        Boolean bool4= !(15>=15); // false

        System.out.println(( bool3||bool4) && true);
        // (true|| false) = true
        // true && true= true

        System.out.println(("Bahast" == "bahast") ||  ("ridvan" !="Ridvan")); //true 1. paragraph false
        // 2. paragraph false > true

        // java is case senstive language  //to be able to ignore 2 string they have to have exact match

        System.out.println(("Pelin"=="Pelin ") || ("Ozgur12")==("Ozgur21"));  //False || false = False

        // what ever you have in the string will be a character either number letter or space or special chacacter











    }
}
