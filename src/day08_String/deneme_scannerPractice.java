package day08_String;

import java.util.Scanner;

public class deneme_scannerPractice {


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);


        System.out.println("Employee First Name ");
        String firstname= input.next();
        System.out.println("First name is : " +firstname);


        input.nextLine();


        System.out.println("Full name of employee ");
        String fullname= input.nextLine();
        System.out.println("Full name is : "+ fullname);



        System.out.println("Enter employee company name: ");
        String companyname= input.nextLine();
        System.out.println("Company name is "+ companyname);

        System.out.println("enter employee age");
        int age= input.nextInt();
        System.out.println("Age is "+ age);

        input.nextLine();
        System.out.println("Enter employee city");
        String city= input.nextLine();
        System.out.println("City name is "+ city);

        System.out.println("Enter salary of employee");
        double salary= input.nextDouble();
        System.out.println("Salary is" +salary);


    }
}
