package day17_ReturnMethods;

public class c6_deneme2calculater {
    public static void main(String[] args) {
        calculate(30,20, '+');
        calculate(20,10, '-');
        calculate(30,20, '*');
        calculate(30,20, '/');
        calculate(30,20, '%');
        calculate(30,20, '#');

    }

    // write a method that will take 3 parameters
    // 2 numbers and one operator
    // it will do the calculation

    //ex : 20 10 /
    //result 2

    //ex 30 3 *
    //result 90

    public static void calculate(double number1, double number2, char operator){

        switch (operator){
            case '+':
                System.out.println(number1+number2);
            break;
            case '-':
                System.out.println(number1-number2);
            break;
            case '*':
                System.out.println(number1*number2);
                break;
            case '/':
                System.out.println(number1/number2);
                break;
            case '%':
                System.out.println(number1%number2);
                break;
            default:
                System.out.println("Invalid operator "+operator);







        }

    }
}
