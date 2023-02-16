package day19_List;

import java.util.ArrayList;

public class c15_Assignment {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }

        System.out.println("Question 1 : ");
        System.out.println("list = " + list);
        System.out.println("reverseArraylist(List) = " + reverseArraylist(list));
        System.out.println("--------------------");
        System.out.println("Question 2 : ");
        String name = "hello 5world a1b2c3";
        System.out.println("sumofnum(name) = " + sumofnum(name));


        System.out.println("--------------------");
        System.out.println("Question 3 : ");

//        write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
//
//        ex: list==> {1,1,2,3,3,4,5,6}
//        uniques ==> {2,4,5,6}

        ArrayList<Integer> uniquelist = new ArrayList<>();
        uniquelist.add(1);
        uniquelist.add(1);
        uniquelist.add(2);
        uniquelist.add(3);
        uniquelist.add(3);
        uniquelist.add(4);
        uniquelist.add(5);
        uniquelist.add(6);

        for (Integer eachLetter : uniquelist) {
            int count = 0;
            for (Integer eachletter2 : uniquelist) {
                if (eachletter2.equals(eachLetter)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(" " + eachLetter);

            }
        }

        System.out.println();
        System.out.println("--------------------");
        System.out.println("Question 4 : ");
//        write a program that can combine two String arrays into one arrayList
//        ex:
//        arr1 = {"A", "B", "C"};
//        arr2 = {"D", "E", "F", "G"};
//        list ==> {"A", "B", "C", "D", "E", "F", "G"}

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        System.out.println("combine(arr1,arr2) = " + combine(arr1, arr2));

        System.out.println("--------------------");
        System.out.println("Question 5 : ");
        ArrayList<Integer> mnumber1 = new ArrayList<>();
        mnumber1.add(1);
        mnumber1.add(3);
        mnumber1.add(29);
        mnumber1.add(123);
        System.out.println(mnumber1);
        System.out.println("maxnumber(mnumber1) = " + maxnumber(mnumber1));


        System.out.println("--------------------");
        System.out.println("Question 6 : ");
        System.out.println(mnumber1);
        System.out.println("minnumber(mnumber1) = " + minnumber(mnumber1));


        System.out.println("--------------------");
        System.out.println("Question 7 : ");
        //1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        ArrayList<String> colornames = new ArrayList<>();
        String colorname = "white, black, yellow, green, blue";
        colornames.add("White");
        colornames.add("Yellow");
        colornames.add("Red");
        colornames.add("Blue");
        colornames.add("Green");
        colornames.add("Black");

        System.out.println("colornames = " + colornames);

        System.out.println("--------------------");
        System.out.println("Question 8 : ");
////   2. Write a Java program to iterate through all elements in a array list.
        ArrayList<Integer> numb1 = new ArrayList<>();
        numb1.add(3);
        numb1.add(5);
        numb1.add(8);
        numb1.add(11);
        System.out.println("numb1 = " + numb1);


        System.out.println("--------------------");
        System.out.println("Question 9 : ");
        //4. Write a Java program to retrieve an element (at a specified index) from a given array list

        ArrayList<String> myletter = new ArrayList<>();

        myletter.add("Sarp");
        myletter.add("Engin");
        myletter.add("Ali");
        myletter.add("Meral");
        System.out.println("myletter = " + myletter);

        String Letterindex = myletter.get(0);
        System.out.println("Letterindex = " + Letterindex);


    }


    //  /* Task 1 :
//     write a program that can print the list of integers in reversed order
//        ex:
//            list=> {1,2,3,4,5,6}
//            output: 6 5 4 3 2 1
//     */

    public static ArrayList<Integer> reverseArraylist(ArrayList<Integer> numbers) {
        ArrayList<Integer> reversedlist = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversedlist.add(numbers.get(i));

        }
        return reversedlist;
    }

 /*Task : 2
    write a program that can return the sum of all the digits from a string
            ex:
                input: "hello 5world a1b2c3"
                output: 11
                    (1+2+3 + 5=11)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
     */

    public static int sumofnum(String str) {

        String name = "hello 5world a1b2c3";
        int sum = 0;

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) >= 48 && name.charAt(i) <= 57) {
                sum += Integer.parseInt(name.substring(i, i + 1));
            }
        }
        return sum;
    }

// task 4
//    write a program that can combine two String arrays into one arrayList
//    ex:
//    arr1 = {"A", "B", "C"};
//    arr2 = {"D", "E", "F", "G"};
//    list ==> {"A", "B", "C", "D", "E", "F", "G"}
//     */

    public static ArrayList<String> combine(String[] str1, String[] str2) {

        ArrayList<String> bothofstr = new ArrayList<>();

        for (int i = 0; i < str1.length; i++) {
            bothofstr.add(String.valueOf(str1[i]));
        }
        for (int a = 0; a < str2.length; a++) {
            bothofstr.add(String.valueOf(str2[a]));

        }
        return bothofstr;
    }

    //task 5
//write a return method that will print max number from arraylist
    public static int maxnumber(ArrayList<Integer> numbers) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }

        }
        // System.out.println("max = " + max);

        return max;
    }

    //task 6
    //write a retunr method that will print min number from arraylist
    public static int minnumber(ArrayList<Integer> number1) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < number1.size(); i++) {

            if (number1.get(i) < min) {
                min = number1.get(i);

            }
        }
        return min;

    }
    //task 7
    //1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

}
