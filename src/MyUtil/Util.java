package MyUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Util {

    //we will create our own reverse library method
    //this method will accept a string
    //as a result it should return reverse of the string
    public static void reverseString(String name){
        String result="";
        for (int i =name.length()-1 ; i >=0 ;i--){
            result += name.charAt(i);
        }
        System.out.println(result);
    }

    public static void hello(){//function of this method is to print hello
        System.out.println("Hello");
    }

    //create a method that will print java 10 times
    public static void printJava10(){
        for (int i =1 ; i <= 10 ; i++){
            System.out.println("Java");
        }
    }
    //create a method that will print array in descending order
    public static void descendingSort(int [] arr){
        //first sort the array
        //and reverse the array with loop
        Arrays.sort(arr);

        int [] descArr=new int[arr.length];
        int lastIndex= arr.length-1;

        for (int i=0 ; i <descArr.length ; i++){
            descArr[i]=arr[lastIndex];
            lastIndex--;
            // descArr[0]=arr[lastIndex];
            // descArr[1]=arr[lastIndex-1];
            // descArr[2]=arr[lastIndex-2];
            // descArr[3]=arr[lastIndex-3];

        }

        System.out.println(Arrays.toString(descArr));



    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        for (int i=1; i<=6;i++){

        }

        System.out.println("reverseArraylist(List) = " + reverseArraylist(list));

    }
    //  /*
//     write a program that can print the list of integers in reversed order
//        ex:
//            list=> {1,2,3,4,5,6}
//            output: 6 5 4 3 2 1
//     */
    ArrayList<Integer> list= new ArrayList<>();
    public static ArrayList<Integer> reverseArraylist(ArrayList<Integer> numbers){
        ArrayList<Integer> reversedlist= new ArrayList<>();
        for (int i=numbers.size()-1; i>=0; i--) {
            reversedlist.add(numbers.get(i));

        }
        return  reversedlist;
    }

}
