package day07_Scanner;

import java.util.Scanner;

public class c7_Deneme {

    public static void main(String[] args) {


        int number= 6;
        String Dayname= "";

        switch (number) {
            case 1:
                Dayname = "Monday";
                break;
            case 2:
                Dayname= "Tuesday";
                break;
            case 3:
                Dayname= "Wendesday";
                break;
            case 4:
                Dayname="Thursday";
                break;
            case 5:
                Dayname="Friday";
                break;
            case 6:
                Dayname="Saturday";
                break;
            case 7:
                Dayname="Sunday";
            default:
                Dayname="Invalid. ";


        }

        System.out.println(Dayname);

        String daytype="";

        switch (number){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            daytype= "Week Day";
            break;
            case 6:
            case 7:
                daytype= "Weekend";
                break;
            default:
                daytype="invalid";
        }

        System.out.println(daytype);
    }
}
