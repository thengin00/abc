package da03_variablesContinue;

public class c6_assignment {

   //create 3 different number
   //second number should be = first number +7
   // third number should be = second number +8
    // ex: x=25 , y=32 , z=40
    // ex: x=20 , y=27 , z=35

    public static void main(String [] args ){

        int x= 20;
        int y= x+7;
        //y 20+7= 27
        int z= y+8;
        //z 27+ 8= 35

        // print x, y, z
        System.out.println("X is : " + x);
        System.out.println("Y is : " + y);
        System.out.println("Z is : " + z);

        // sum of 3 numbers
        System.out.println("X+Y+Z = " +(x+y+z));


        //if the x is divisible by 2,3,5
        // 3. check if x divisible by 2,3,5 (check for each number)
        //          if it is divisible print: x is divisible by 2 true
        //          if it is not divisible print: x is divisible by 2 false

       // System.out.println("20 is divisible by 2 True"); we need to define number and true condition

        boolean divisibleby2forx= x % 2==0; //if reminder is equal 0 that means number will be divided
        // by 2 without reminder
        // which makes the number divisible by 2

        boolean divisibleby3forx = x% 3== 0;
        boolean divisibleby5forx = x% 5 == 0;


        System.out.println( x+ " is divisible by 2 " + divisibleby2forx);
        System.out.println( x+ " is divisible by 3 " +divisibleby3forx);
        System.out.println(x+ " is divisible by 5 " +divisibleby5forx);




    }




}
