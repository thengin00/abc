package day19_List;

public class c8_denemevalueofMethods {

    public static void main(String[] args) {
        //            valueOf methods: converting string to wrapper class value, returns wrapper class values
        String str="55";
        Integer number=Integer.parseInt(str);
        Integer  number2=Integer.valueOf(str);

        System.out.println(number+25); //80
        System.out.println(number2+25); //80
        System.out.println(str+25); // 5525



        String str2= "55.5";
        Double d1=Double.valueOf(str2);
        System.out.println(d1+5);

        String text = "55"+ "25";
        System.out.println(text);





    }
}