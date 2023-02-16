package day14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class c7_deneme1 {

    public static void main(String[] args) {

        String []days={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number :  ");
        int number= scan.nextInt();
        int attempt= 1;


        while (number>7 || number<1){
            System.out.println("Invalid number . ");
            System.out.println("Try again . ");
            number=scan.nextInt();
            attempt++;

            if (attempt==3 && (number>7 || number<1)){
                System.out.println("User tried 3 times ");
                System.out.println("System locked !!");
                System.exit(0);
            }
        }

        String result=days[number-1];
        System.out.println(result);





    }
}
