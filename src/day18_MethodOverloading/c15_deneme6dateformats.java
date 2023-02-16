package day18_MethodOverloading;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class c15_deneme6dateformats {
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter1= DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate Localdate1= LocalDate.now();
        System.out.println("Localdate1 = " + Localdate1);
        System.out.println(Localdate1.format(dateTimeFormatter1)); // 29/09/2021

        DateTimeFormatter dateTimeFormatter2= DateTimeFormatter.ofPattern("E MMMM/dd/yy");
        System.out.println(Localdate1.format(dateTimeFormatter2));


        // E; day of name
        // MMM Jan MMMM January
        // yy : 21, yyyy: 2021


// to print time as well we will need to use LocalDateTime instead of LocalDate
        LocalDateTime Localdatetime1= LocalDateTime.of(2012,9,15,7,25,35);
        LocalDateTime Localdatetime2= LocalDateTime.of(2012,9,15,15,25,35);
        System.out.println("Localdatetime1 = " + Localdatetime1);
        System.out.println("Localdatetime2 = " + Localdatetime2);

        DateTimeFormatter dateTimeFormatter3= DateTimeFormatter.ofPattern("EEE, MM/dd, hh:mm a");
        System.out.println(Localdatetime2.format(dateTimeFormatter3));

    }
}
