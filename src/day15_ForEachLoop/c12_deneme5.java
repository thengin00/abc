package day15_ForEachLoop;

public class c12_deneme5 {

    public static void main(String[] args) {



        int[] arr={10,5,5};
        for (int each: arr){
            System.out.println(each);
        }

        int [] [] arr2d={{1,2,3}, {4,5}, {6,7,8,9,10}};


        for (int []each1D:arr2d){
            for (int eachNUMBER: each1D){
                System.out.print(eachNUMBER+" ");
            }
        }
    }
}
