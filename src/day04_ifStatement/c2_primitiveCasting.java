package day04_ifStatement;

public class c2_primitiveCasting {

    public static void main(String[] args) {

        //we have 2 type of primitive casting
        //1. implicit casting (done automaticly from java)
        //2. explicit casting (needs to be handle manually

        // double > float> long> int> short> byte



        byte b1=20; // -128 to 127
        long l1= b1; // this is implicit casting( done will automaticly by java)


        int i1= 10;
        byte b2= (byte) i1; //explicit casting, this will done by you manually.

        double d1= 2.3;
        float f1=(float) d1; // explicit casting

        int i2= 200;
        long l2=i2; //implicit casting

        short s=155;






    }
}
