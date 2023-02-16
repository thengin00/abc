package day07_Scanner;

import java.util.Scanner;

public class c1_ScannerClass {


    public static void main(String[] args) {


        //First off all scanner is a library under java
        //libraries has ready methods created inside of library
        //to be able to use any library we need call them in our class
        //and create object from that library
        Scanner input = new Scanner(System.in);
        //I called  scanner class (ready library under java) and created an object called input
        //to be able to create object we need to create new Scanner

        //to import library
        // click on option + enter  for mac
        //click on alt + enter for windows

        //to go to libray hold on ctrl or command then click on library name

        System.out.println("Insert your byte number");
        byte b1 = input.nextByte();
        //nextByte method
        //will ask user to enter a number and then it will accept that number and assigned to b1 variable
        System.out.println(b1);

        System.out.println("enter int number");
        //to be able to use library methods you need to call the object
        int numberInt=input.nextInt();
        System.out.println("Number int is " + numberInt);


        Scanner scan=new Scanner(System.in); //this is anothor object comes from Scanner class
        //name of object is scan

        short numberShort=scan.nextShort();
        System.out.println(numberShort);

        //to command everything choose all line in the class and then
        //click on command + / for mac users
        //click on ctrl + / for windows users

        //to create a new project
        //click on file  and click on new project

        //to go previous step
        //click on ctrl + z  or command + z


    }
}





































