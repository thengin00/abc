package reverseString;

import java.util.Scanner;

public class c5_reverseString {

    public static void main(String[] args) {
        //how can you reverse a string
        //input   hello
        //output  olleh

        String word="Hello";
        //01234

        String reverseWord =""+ word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println(reverseWord);

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your word ");
        String word2=input.nextLine();
        //since we dont know the word we need get last index of word to be able to reverse string from last char
        //to get last index number length -1
        System.out.println("Length of your word " + word2.length());
        int lastIndex=word2.length() -1 ;

        String reverseWord2="";

        //what is starting point for loop
        //starting point last index
        //ending point will be 0
        //iteration --
        for (int i =lastIndex ; i >= 0  ; i--){ // last index lastindex-1 ......0 (11 10 9 ..0)
            //System.out.println(word2.charAt(i));//11
            reverseWord2 += word2.charAt(i);//11
            //System.out.println(reverseWord2);
        }
        System.out.println(reverseWord2);
        System.out.println("--------------------");
        System.out.println("Enter your word : ");
        String word3=input.nextLine();
        System.out.println("Length of your word "+ word3.length());
        int lastindex1=word3.length()-1;
        String reverseword3="";
        for (int w=lastindex1; w>=0; w--){
            reverseword3+=word3.charAt(w);
        }
        System.out.println(reverseword3);






    }
}