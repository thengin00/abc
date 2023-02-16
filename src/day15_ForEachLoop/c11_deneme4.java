package day15_ForEachLoop;

public class c11_deneme4 {

    public static void main(String[] args) {

    //create a java program that will print count off odd numbers and even numbers from int array
        int []numberList={33,0,2,4,6,7,5,3,100,25,30,200};

        //output will say 6 even numbers
        //4 odd numbers

        int evencount=0;
        int oddcount=0;

        for (int number: numberList){
            if (number%2==0){
                evencount++;
            }else {
                oddcount++;
            }
        }
        System.out.println("Even count is "+ evencount);
        System.out.println("Odd count is "+ oddcount);

        for (int i=0; i< numberList.length; i++){
            if (numberList[i]%2==0){
                evencount++;
            }else {
                oddcount++;
            }
        }


        System.out.println("Even count is "+ evencount);
        System.out.println("Odd count is "+ oddcount);





    }


}
