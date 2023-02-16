package day18_MethodOverloading;


//// write a return method that can return minumum number from an int array
//    //expected output will be number
public class c16_deneme8MinNumberArray {
    public static void main(String[] args) {

        int[] arr1 = {10, 2, 5, 100, 200, 95, 0, -25};
        System.out.println("minNumber(arr1) = " + minNumber(arr1));

        double[] arr2 = {2.5, 10.0, 0.1, 111, 55};
        // minnumber(arr2)
        System.out.println("minNumber(arr2) = " + minNumber(arr2));


    }

    public static int minNumber(int[] numbers) {
        // first I will assume my min numbern is index 0

        int minimum = numbers[0];

        for (int eachnumber : numbers) {
            if (eachnumber < minimum) {
                minimum = eachnumber;
            }
        }
        return minimum;

    }

    public static double minNumber(double[] numbers) {
        // first I will assume my min numbern is index 0

        double minimum = numbers[0];

        for (double eachnumber : numbers) {
            if (eachnumber < minimum) {
                minimum = eachnumber;
            }
        }
        return minimum;
    }
}
