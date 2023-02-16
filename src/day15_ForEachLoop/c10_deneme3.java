package day15_ForEachLoop;

public class c10_deneme3 {
    public static void main(String[] args) {

    int []numbers={1,2,3,4,5};

    for (int eachnumber: numbers){
        System.out.println(eachnumber);
    }
// string example
    String [] names={"Yad", "Mesut", "Ozgur"};

    for (String name:names){
        System.out.println(name);
    }

    // example
        String sentence=" Hello world java is here";

        String[] words= sentence.split(" ");

        for (String word:words){
            System.out.println(word);
        }

        for (int i=0; i< words.length; i++){
            System.out.println(words[i]);
        }

        int [] numberlist={1,2,5,20,4,-8,9,100};

        for (int number: numberlist){
            System.out.println("hello");
            System.out.println(number);
        }










    }
}
