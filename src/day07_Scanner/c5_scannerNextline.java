package day07_Scanner;

import java.util.Scanner;

public class c5_scannerNextline {

    public static void main(String[] args) {

//        Scanner scan=new Scanner(System.in);
//        System.out.println("enter full name");
//       // String fullName=scan.next(); // next only accept one word so if you have 2 word better to use nextline
//        String fullName=scan.nextLine();
//        System.out.println(fullName);

        Scanner input =  new Scanner(System.in);
        System.out.println("Employe first name");
        String firstName=input.next();
        System.out.println("firt name "+firstName);

        input.nextLine(); //this will accept enter

        System.out.println("Employee full name ");
        String fullNAme=input.nextLine(); //accept enter
        System.out.println("full name "+fullNAme);



        // deneme:

        Scanner me=new Scanner(System.in);
        System.out.println("Enter your first name :");
        String fname=me.next();
        System.out.println("First name is "+fname);

        me.nextLine();
        System.out.println("Enter your last name : ");
        String lname=me.nextLine();
        System.out.println("Last name is "+lname);



    }
}
