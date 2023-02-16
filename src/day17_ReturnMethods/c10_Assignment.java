package day17_ReturnMethods;

public class c10_Assignment {
    public static void main(String[] args) {
        System.out.println("Question 1:  ");

        System.out.println(sleepin(true, false));
        System.out.println(sleepin(false, true));
        System.out.println(sleepin(false, false));
        System.out.println("-------------------------");
        System.out.println("Question 2:  ");
        System.out.println(monkeytrouble(true,true));
        System.out.println(monkeytrouble(false,false));
        System.out.println(monkeytrouble(true,false));
        System.out.println("-------------------------");
        System.out.println("Question 3:  ");
        System.out.println(sumdoumle(12,32));
        System.out.println(sumdoumle(5,5));
        System.out.println("-------------------------");
        System.out.println("Question 4:  ");
        System.out.println(absolutedifferences(25));
        System.out.println(absolutedifferences(18));
        System.out.println(absolutedifferences(21));
        System.out.println("-------------------------");
        System.out.println("Question 5:  ");
        System.out.println(parrottrouble(true, 23));
        System.out.println(parrottrouble(false, 16));
        System.out.println("-------------------------");
        System.out.println("Question 6:  ");
        System.out.println(givenint(8,1));
        System.out.println(givenint(8,2));
        System.out.println(givenint(1,10));
        System.out.println("-------------------------");
        System.out.println("Question 7:  ");
        System.out.println(front("Hello"));
        System.out.println(front("All"));
        System.out.println(front("S"));
        System.out.println("-------------------------");
        System.out.println("Question 8:  ");
    }

    //task1
//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in
//if it is not a weekday or we're on vacation. Return true if we sleep in.
//sleepIn(false, false) → true
//sleepIn(true, false) → false
//sleepIn(false, true) → true
    public static boolean sleepin(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == false) {
            return false;
        } else if (weekday == false || vacation == true) {
            return true;
        } else {
            return true;
        }

    }
    //task2
    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
// We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

//monkeyTrouble(true, true) → true
//monkeyTrouble(false, false) → true
//monkeyTrouble(true, false) → false

    public static boolean monkeytrouble( boolean smile, boolean notsmile){

        if (smile && notsmile){
            return true;
        }else if (!smile && !notsmile){
            return true;
        } else  {
            return false;
        }
    }

//task3
//Given two int values, return their sum. Unless the two values are the same, then return double their sum.
//sumDouble(1, 2) → 3
//sumDouble(3, 2) → 5
//sumDouble(2, 2) → 8

public static double sumdoumle(int number1, int number2){

     if (number1==number2){
         return 2*(number1+number2);
     }else {
         return number1+number2;
     }
}
//task4

//Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

//diff21(19) → 2
//diff21(10) → 11
//diff21(21) → 0
//diff21(24) ->6

    public static int absolutedifferences(int number) {
        int dif = 21;
        if (number <= dif) {
            return dif - number;

        } else {
            return (number - dif) * 2;
        }

    }

//task5
//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble
// if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

//parrotTrouble(true, 6) → true
//parrotTrouble(true, 7) → false
//parrotTrouble(false, 6) → false


public static boolean parrottrouble(boolean talk, int hour ){
        if (talk== true && (hour<7 || hour>20 )){
            return true;
        }else{
            return false;
        }

}

//task6
//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

//makes10(9, 10) → true
//makes10(9, 9) → false
//makes10(1, 9) → true
public static boolean givenint(int number1, int number2){
if (number1+number2==10 || number1==10 ||number2==10)    {
    return true;
}   else{
    return false;
}

}
//task7
//Given a string, return a new string where "not " has been added to the front. However,
// if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

//notString("candy") → "not candy"
//notString("x") → "not x"
//notString("not bad") → "not bad"

    public static String front (String word){
        if (word.length() >=3 && word.substring(0,3).equals("not")){
            return word;
        }else{
            return "not " + word;
        }
    }
    //task8
//Given a string, return a new string where the first and last chars have been exchanged.

//frontBack("code") → "eodc"
//frontBack("a") → "a"
//frontBack("ab") → "ba"

    }










