package day09_StringMethods;

import java.util.Scanner;

public class c6_denemetwitter {

    public static void main(String[] args) {


        //create a logic that will check login function of facebook.
        //correct username = renastech
        //correct password = renastech123

        //use scanner here to pass usernames and passwords
        //do validation of those usernames and password matching with correct credentials



        String expectedusername="renastech";
        String expectedpassword= "renastech123";
        Scanner input= new Scanner(System.in);


        System.out.println("Enter your username : ");
        String userinputforusername= input.nextLine();
        System.out.println("Enter your password : ");
        String userinputforpassword= input.nextLine();


        if (userinputforusername.equals(expectedusername) && userinputforpassword.equals(expectedpassword)){
            System.out.println("You have succesfully log in. ");
        }else{
            System.out.println("Log in function is failed . ");
        }



    }
}
