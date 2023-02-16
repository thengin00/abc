package day08_String;

public class deneme_StringMethods {

    public static void main(String[] args) {


    String str= "Hello";


    char    letter0= str.charAt(0);
        System.out.println(letter0);
        System.out.println(str.charAt(3));

        String word= "hello world";
        //            012345678910

        System.out.println(" word char5 is "+ word.charAt(6));


        ///////////////////

        String firstname ="Esra Gonca";
        String lastname= "Kilic";
        System.out.println(firstname.concat(" "+lastname));
        System.out.println(firstname.concat(" ").concat(lastname));

        String fullname =firstname.concat(" ").concat(lastname);
        System.out.println(fullname);


        System.out.println("************");
        System.out.println(fullname.concat(" ").concat(str).concat(""+letter0));

        int score=90;
        System.out.println(fullname.concat(" "+score));
        System.out.println(firstname.concat(" ").concat(lastname).concat(" score is ").concat(""+score));


        System.out.println("****************");
        String sentence= "Java dss kljfkf2342@#";
        System.out.println(sentence.contains("a")); //true
        System.out.println(sentence.contains("A"));// false
        System.out.println(sentence.contains("Ja")); // true
        System.out.println(sentence.contains("Ja ")); // false
        System.out.println(sentence.contains("va ")); //true


        boolean example = sentence.contains(" ");
        System.out.println(example);

        System.out.println("****************");

        String sentence2="Hello world Java 47";
        System.out.println(sentence2.endsWith("7"));
        System.out.println(sentence2.endsWith("47"));
        System.out.println(sentence2.endsWith(" 47"));
        System.out.println(sentence2.endsWith("Java 47"));
        System.out.println(sentence2.endsWith("Hello world Java 47"));
        System.out.println(sentence2.endsWith("Java 47"));

    }
}
