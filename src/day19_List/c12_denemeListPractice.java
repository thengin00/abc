package day19_List;

import java.util.ArrayList;

public class c12_denemeListPractice {

    public static void main(String[] args) {
        //create an list of Integers
        //add 4 numbers
        //return maximumnumber

        ArrayList<Integer> numberlist= new ArrayList<>();
        numberlist.add(200);
        numberlist.add(100);
        numberlist.add(0);
        numberlist.add(55);
        numberlist.add(290);
        numberlist.add(-100);



         //int maximum= numberlist.get(0) assuming number zero is maximum

        int maximum= Integer.MIN_VALUE; //-2147483648 // we assume min int number is max
        System.out.println(maximum);

        // create a for loop to compare my list with maximum number
        // if its bigger i will reassigned to max
        for (int i=0; i<numberlist.size(); i++){
            if (numberlist.get(i)>maximum){
                maximum=numberlist.get(i);
            }
        }
        System.out.println(maximum);
        System.out.println("maximum = " + maximum);


        //create a logic to print minumum
        System.out.println("minNumber(numberlist) = " + minNumber(numberlist));


    }
  public static Integer minNumber  (ArrayList<Integer> List) {

      // Integer minimum=List.get(0); assuming index 0 is minimum
      Integer minimum = Integer.MAX_VALUE;   //2147483648
      System.out.println("First minimum = " + minimum);
      for (int i=0; i<List.size(); i++){
          if (List.get(i)< minimum){
              minimum=List.get(i);
          }
      }
return minimum;



  }


}
