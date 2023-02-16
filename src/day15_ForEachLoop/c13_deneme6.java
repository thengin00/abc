package day15_ForEachLoop;

public class c13_deneme6 {

    public static void main(String[] args) {
        //from 2d array
        //create a java logic that will print odd and even numbers
        //count of even and odd
        //also it will print sum of oddnumbers and sum of even numbers


        int[] [] number2D={
                {1,2,3,4},
                {5,6,7},
                {8,9,10}
        };

        int countofodd=0;
        int countofeven=0;
        int sumEven=0;
        int sumOdd=0;

        for (int [] each1D : number2D){

            for (int eachnumber: each1D){


                if (eachnumber%2==0){

                    countofeven++;
                    sumEven+=eachnumber;
                    System.out.println(eachnumber+ " is even number .");
                    System.out.println(sumEven);
                    System.out.println(countofeven);
                } else {
                    System.out.println();
                    countofodd++;
                    sumOdd+=eachnumber;
                    System.out.println(eachnumber+ " is odd number .");
                    System.out.println(sumOdd);
                    System.out.println(countofodd);
                }
            }

        }

        System.out.println("Count of even numbers : "+countofeven + " sum of even numbers "+ sumEven);
        System.out.println("Count of odd numbers : "+countofodd + " sum of odd numbers "+ sumOdd);
    }
}
