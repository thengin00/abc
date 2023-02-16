package day19_List;

public class c4_denemeTypeCasting {
    public static void main(String[] args) {
        // create an Integer object

        Integer myInt1=new Integer(10);

        int i1=myInt1; // we do unboxing
        // converting an object of wrapper Integer corresponding value int

        Character mych='w'; //auto boxing
        // we take char variable and assign to wrapper classes
        // Conventing a primitive value into an object of the corresponding wrapper class is

        char ch2=mych; // this is going to be unboxing

        System.out.println("mych = " + mych);
        System.out.println("ch2 = " + ch2);



        int number= 100; // this is primitive
        Integer myInt=number;  //autoboxing

        Byte mybyte= 25;
        byte b1=mybyte; // autoboxing

        //Integer myInt2=b1; error



    }
}
