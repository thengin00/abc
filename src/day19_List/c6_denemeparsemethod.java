package day19_List;

public class c6_denemeparsemethod {
    public static void main(String[] args) {
        String str="3555";
        // String str ="zzzzz3555"; expection error
        System.out.println(str+25); // text+ number 355525 string



        int number=Integer.parseInt(str); // 3555 as number
        System.out.println(number+25);//3580



        String str2="10.55";
        float f1=Float.parseFloat(str2);
        double d1=Double.parseDouble(str2);

        System.out.println("f1 = " + (f1+2));
        System.out.println("d1 = " + (d1+2));




        String str3="true";
        String str4="false";
        String str5="TruE";
        String str6="FalSE";
        String str7="hello world";

        boolean bool=Boolean.parseBoolean(str3); // true
        boolean bool1=Boolean.parseBoolean(str4); // false
        boolean bool2=Boolean.parseBoolean(str5);// true case doesnt change result
        boolean bool3=Boolean.parseBoolean(str6);// false
        boolean bool4=Boolean.parseBoolean(str7);// anything is not equalcase true or false will be false

        System.out.println("bool = " + bool);
        System.out.println("bool1 = " + bool1);
        System.out.println("bool2 = " + bool2);
        System.out.println("bool3 = " + bool3);
        System.out.println("bool4 = " + bool4);


    }
}
