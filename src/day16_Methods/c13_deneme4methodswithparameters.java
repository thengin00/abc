package day16_Methods;

import java.util.Scanner;

public class c13_deneme4methodswithparameters {
    //decleration of the method
    // public               static           void               main        (String [] args){
    // Access-modifer       specifier        return-type        methodName  (paramater){
    //statments ,code
    //}

    public static void main(String[] args) {
        // hello method is void method without parameters
        hello();
        ageCategory(-2);

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age ");
        int age= input.nextInt();
        ageCategory(age);

    }

    public static void hello(){
        System.out.println("hello");
    }

    //crete a method that will check given age and print the category of each age
    //if age is 0-5 baby
    //if age is 5-18 young
    //if age is 18-80 mature
    //if age is bigger then 80 print  old

    public static void ageCategory(int age){
        String result="";
        if (age>+0&& age<5){
            result=age +" is a baby. ";
        }else if (age>=5 && age<18){
            result= age + " is a young. ";
        } else if (age>=18 && age<80){
            result= age+ " is a mature.";
        }else if (age>=80){
            result= age+ " is old. ";
        }else {
            result= age+ " is not exist. ";
        }
        System.out.println(result);
    }





}
