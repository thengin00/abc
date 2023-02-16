package day05_ifcontinue;

public class c5_ternary {
    // this is just another way of using if else block
    // create a java program that prints max number from 2 number

    public static void main(String[] args) {

        int number1=10;
        int number2=20;

        int max=0; // this is to store max number
        String message = ""; // this will be message that we will print at the end

        if (number1>number2){ // 10>20 false
            max= number1; // it is not going to check here
        } else { // this will be true
            max=number2;

        }

        //System.out.println("maximum number is "+max);

        message = "maximum number is " +max;
        // text + number == text (20)
        System.out.println(message);



        /// ternary (another way to if else block)
        int number3=35;
        int number4=45;

        int max2;

        max2= (number3>number4) ? number3: number4;
        // if present ?
        // else present :
        System.out.println(max2);

        String result = "";
        result =(false) ? "Java" : "Phyton";

        System.out.println(result);

        if (false){
            result="java";

        }else {
            result="python";
        }
        System.out.println(result);



    }



}
