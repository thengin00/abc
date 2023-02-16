package day18_MethodOverloading;

public class c10_deneme1method {
    public static void main(String[] args) {

method();
method(10);
method(3.54);
method(5);

byte b1=5;
method(5);
method(b1);
method("Hello ");
    }
    public static void method(){ // this method doesnt have load it is without parameters
        System.out.println("Method ");

    }
    public static void method(int number){
        System.out.println("backup method");

    }
    public static void method(double number){
        System.out.println(number+ " double method ");
    }
    public static void method(byte number){
        System.out.println(number + "byte method");
    }
    public static void method(String text){
        System.out.println(text+" String method" );
    }
}
