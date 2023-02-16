package day19_List;

public class c2_deneme1wrapperlist {
    public static void main(String[] args) {

       int  i1=10; // primitive type
       Integer myInt=10; // wrapper class object

        System.out.println(i1);
        System.out.println(myInt);


        Double mydouble= 5.5; //wrapper class
      Character ch='b'; // wrapper class

        short sh1=100; // primitive
        int i2= sh1; // primitive

        Integer myint2= i2; // wrapper class
        // Integer myint3=sh1; //Integer is another form of int primitive data type
        // you cannot assign different forms it has to be int. You can assign only short

        Byte b1=10;// wrapper
        byte b2=15;// primitive
        Byte b3=b2; // wrapper

       //  Integer myint3=b2;
       //  Integer myint3=b3;


        System.out.println("b3 = " + b3);

        // to string method is used to convert wrapper objects to string

        Integer myInt5= 155;
        String str=myInt5.toString(); //"155''
        System.out.println("str = " + str);
        System.out.println("str.length() = " + str.length());


    }
}
