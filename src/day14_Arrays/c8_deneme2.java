package day14_Arrays;

import java.util.Arrays;

public class c8_deneme2 {
    public static void main(String[] args) {

        int [] numberlist= {2,3,10,-55,209,100,7,9,10,100};

        System.out.println(Arrays.toString(numberlist));
        Arrays.sort(numberlist);
        System.out.println(Arrays.toString(numberlist));

        // print the min number
        System.out.println("Minimum number is " + numberlist[0]);

        //max number from list
        System.out.println("Maximum number is "+ numberlist[numberlist.length-1]);


// medium number
        System.out.println("Medium number is "+ numberlist[numberlist.length/2-1]);


        //largest to smallest
        // create a condition that will print the numbers from largest to smallest
        int [] arr={100,2,5,16,27};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // if i also want to store from large to small
        int [] largetosmall =new int[arr.length];
       // largetosmall[0]==arr [lastindex]

        // to print from largest // my loop will need to start from last index
        //end point =0 first index
        // iteration --

        int j=0;
        for (int i=arr.length-1; i>=0; i--){
            //System.out.print(arr[i]+" ,");
            largetosmall[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(largetosmall));







    }
}
