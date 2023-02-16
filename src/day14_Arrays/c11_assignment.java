package day14_Arrays;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class c11_assignment {
    public static void main(String[] args) {

//(String) Reverse
//Write a return method that can reverse  String
//Ex: Reverse("ABCD"); ==> DCBA
        System.out.println("Question 1 : ");
        String actualtext="ABCD";
        System.out.println(actualtext);


        String reverse= "";
        int lastindex=actualtext.length()-1;
        do {
            reverse+=actualtext.charAt(lastindex);
            lastindex--;
        }while (lastindex>=0);
        System.out.println(reverse);

//(String) Same Letters
//Write a return method that check if a string is build out of the same letters as another string.
//Ex:  same("abc",  "cab"); -> true
//same("abc",  "abb"); -> false:
        System.out.println("--------------------");
        System.out.println("Question 2 : ");

   Scanner input = new Scanner(System.in);
        System.out.println("Enter two word :");
        String string1 = input.nextLine();
        String string2 = input.nextLine();
        char[] char1 = string1.toCharArray();
        char[] char2 = string2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        boolean b = Arrays.equals(char1, char2);
        System.out.println("both words are same :" + b);




//(String) Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC")  ==> ABC
        System.out.println("--------------------");
        System.out.println("Question 3 : ");






//(String) Find the unique
//Write a return  method that can find the unique characters from the String
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
        System.out.println("--------------------");
        System.out.println("Question 4 : ");


        String str="AAABBBCCCDEF";
        System.out.println("Your word is "+ str);

        String uniquestr="";
        for (int i = 0; i < str.length(); i++) {
            int j = 0;
            for (int a = 0; a < str.length(); a++) {
                if (str.charAt(i) == str.charAt(a)) {
                    j++;
                }
            }
            if (j == 1) {
                uniquestr = "" + str.charAt(i);
                System.out.print(uniquestr);
            }
        }



//(Array) Find Maximum
//Write a method that can find the maximum number from an int Array
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Question 5 : ");


    int[] numbers={1,2,3,54,64,-65,6758,948,-56,87,654};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int lastindexnumber=numbers.length-1;
        System.out.println(lastindexnumber);

        System.out.println("Your maximum number is : "+ numbers[10]);

//(Array) Find Minimum
//Write a method that can find the maximum number from an int Array
        System.out.println("--------------------");
        System.out.println("Question 6 : ");

       int []numbers1={65,43,-12,-32,87,0,-56,100,7,};

        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));
        System.out.println("Your minimum number is "+ numbers1[0]);

//(Array) Concat two arrays
//Write a return method that can concate two arrays
        System.out.println("--------------------");
        System.out.println("Question 7 : ");








    }
}
