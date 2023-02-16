package day17_ReturnMethods;

public class c7_deneme3ReturnMethod {

    public static void main(String[] args) {
        minNum(10, 5);
        String result = minNum2(10, 5);
        System.out.println(result);

        System.out.println(minNum2(7, 80));

        // found the minimum add 10;
        String min2 = minNum2(7, 8);
        System.out.println(min2 + " **** number is the small number");

        System.out.println(division(20, 2));

        int resultofdivision = division(20, 5);
        System.out.println(resultofdivision * 10);
    }
    //decleration of the method
    // public               static           void               main        (String [] args){
    // Access-modifer       specifier        return-type        methodName  (paramater)
    //statments ,code
    //}

    //Access-Modifer =public, protected ,default ,priavate
    //specifier   : static ,final ,abstract ,synchronized
    //return type : void , any datatype(int,string,char , int [] .......)
    //some method has paramertes some dont have parameter

    // create a method that will print minimum number from 2 number
    public static void minNum(int i1, int i2) {
        String result = "";
        if (i1 < i2) {
            result = i1 + " is minimum number. ";
        } else {
            result = i2 + " is minimum number. ";
        }
        System.out.println(result);
    }
    // void means any data type.

    public static String minNum2(int i1, int i2) {
        String result = "";
        if (i1 < i2) {
            result = i1 + " is minimum number. ";
        } else {
            result = i2 + " is minimum number. ";
        }

        return result;
    }

    // create a division function
    public static int division(int number, int number2) {
        System.out.println(" Hello this is division Method !!! ");
        System.out.println("Division of " + number + " , " + number2);
        return number / number2;
    }

    // addition method
    public static void addition(int number1, int number2) {

        System.out.println(number1 + number2);

    }

    public static int addition2(int number1, int number2) {
        return number1 + number2;
    }

    public static byte addition3(byte number1, byte number2) {
        return (byte) (number1 + number2);// addition of number 1 and number 2 might be bigger than byte
    }
}