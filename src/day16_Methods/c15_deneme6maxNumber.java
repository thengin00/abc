package day16_Methods;

public class c15_deneme6maxNumber {

    ///create a method that will accept 2 different number
    //and  it will print me the maximum one

    public static  void maxNumber(int number1, int number2 ){

        if (number1>number2){
            System.out.println(number1+ " is bigger than "+ number2);
        } else if (number2>number1){
            System.out.println(number2+ " is bigger than "+ number1);
        } else  {
            System.out.println(number1+ " is equal to "+ number2);
        }


    }

    public static void main(String[] args) {
        maxNumber(23,34);
    }

}
