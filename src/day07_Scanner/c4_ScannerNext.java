package day07_Scanner;

import java.util.Scanner;

public class c4_ScannerNext {

    public static void main(String[] args) {
        //for the strings to be able to use scanner you will need to call next method from librarry
        //2 way to create string scanner
        //next and nextLine

        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Name ");
        //String firstName="Ozer";
        String firstName=input.next();
        System.out.println("First name is " + firstName);

        System.out.println("enter last name ");
        String lastName = input.next();
        System.out.println("last name is "+ lastName);

        String fullName= firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println("Grade for student ");
        int grade = input.nextInt();
        System.out.println(fullName + " grade is " + grade);


        //Deneme 1


        Scanner yeni= new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String fname= yeni.next();
        System.out.println("Your first name is "+ fname);

        System.out.println("Enter your last name : ");
        String lname= yeni.next();
        System.out.println("Your last name is "+lname);

        String fullname= fname+ " "+lname;

        System.out.println("Grade for student ");
        int gr= yeni.nextInt();
        System.out.println("Your grade is "+ gr);



    }
}
