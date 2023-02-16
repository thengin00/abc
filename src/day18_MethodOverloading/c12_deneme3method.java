package day18_MethodOverloading;

public class c12_deneme3method {
    public static void main(String[] args) {
        System.out.println("String main");
        int [] numbers={1,2,3,4};
        main(numbers);

    }
    public static void main(double[] args){

        System.out.println("Double main");

    }
    public static void main(int []args ){
        System.out.println("Int main");

    }
}
