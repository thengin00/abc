package day15_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class c9_deneme2 {

    public static void main(String[] args) {

        int[]   number={1,2,3};
        System.out.println(Arrays.toString(number));



        int [] []number2D= {{1,2},{2,3,4},{4}};
        System.out.println(Arrays.toString(number2D)); // hashtag
        System.out.println(Arrays.toString(number2D[0])); // one container
        System.out.println(Arrays.deepToString(number2D));//[[1, 2], [2, 3, 4], [4]]



    }
}
