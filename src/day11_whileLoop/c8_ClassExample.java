package day11_whileLoop;

class c8_classExample {

    public static void main(String[] args) {

         /*
Write a program using while loop  that calculates the sum of the even numbers between  0 and 30

 */

       int sum=0;

       for (int i=0; i<=30; i++){
           if (i%2==0){

               //System.out.println("Adding this to sum"+ i);
               sum +=i;


           }
          // System.out.println(sum);

            i++;
       }

        System.out.println("The sum of the number "+sum);




}
}


