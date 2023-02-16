package day18_MethodOverloading;

import java.time.LocalDate;

public class c14_deneme5dates {
    public static void main(String[] args) {
// localdate class is coming from Java library as well
        LocalDate localDate1=LocalDate.of(2021, 10, 01);
        // objects creating from classes
        System.out.println(localDate1);


        LocalDate localDte2=LocalDate.of(2020, 6,5);
        System.out.println(localDte2);

        boolean b1= localDate1.isAfter(localDte2); // true
        boolean b2= localDate1.isBefore(localDte2); // false
        boolean b3= localDate1.isEqual(localDte2);// false

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        //to print today date
        LocalDate todayDate= java.time.LocalDate.now();
        System.out.println(todayDate);
        String todayDateString= todayDate.toString();
        todayDateString= todayDateString.replace("-", " . ");
        System.out.println("todayDateString = " + todayDateString);


        //replace - with dot on today date result

    }
}
