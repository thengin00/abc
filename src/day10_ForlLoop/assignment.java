package day10_ForlLoop;

import java.util.Locale;

public class assignment {

    public static void main(String[] args) {


        //Task 1 : String Methods
//Sentence =hello my name is hello worlD.     i am 25 years old. i am living in new yorK .       i have been in the IT industry for about 6 years.    i starteD as a manUal tesTer and now doing AutOMation for about 4 years.   i have experience in different DOmains: education, Energy, finance.i have Scrum Master and Oracle Java Programmer certificates.my main lanGuage is JAVA. i designed and deveLoped many automation test scripts by using BDD framework


//first create one string and copy pass above paragraf.
//then create multiple strings to store each sentence that you see in the paragraf.
//Do below modification for your sentences :
//make sure each sentence first letter capital .
//make sure city names start with capital .
//rest needs to be small cases.
//make sure to change name,age and city information with your personal information
//make sure to trim your sentences
//after those modifications
//print each sentence length , last index number
//print first,last and fifth character from each sentence.

        String paragraph="hello my name is hello worlD.     i am 25 years old. i am living in new yorK .       i have been in the IT industry for about 6 years." +
                "    i starteD as a manUal tesTer and now doing AutOMation for about 4 years.   " +
                "i have experience in different DOmains: education, Energy, finance.i have Scrum Master and Oracle Java Programmer certificates.my main lanGuage is JAVA. " +
                "i designed and deveLoped many automation test scripts by using BDD framework\n";



        String sentence="hello my name is hello worlD.     ";
        String sentence1=sentence.substring(0,1).toUpperCase().concat(sentence.substring(1).toLowerCase().
                replace("hello world","Esra Gonca Kilic").trim());
        System.out.println(sentence1);
        System.out.println("This sentence length is "+ sentence.length()+  "\nThe first, fifth and last character are "+ sentence.charAt(0)
                +","+sentence.charAt(4)+" and"+sentence.charAt(sentence.length()-1)+ ". ");


        System.out.println("--------------------");
        String sntc2="i am 25 years old.";
        String sentence2=sntc2.substring(0,1).toUpperCase().concat(" ").concat(sntc2.substring(1).toLowerCase().replace("25","45").trim());
        System.out.println(sentence2);

        System.out.println("This sentence length is "+sentence2.length()+ "\nThe first, fifth and last character are "
                +sentence2.charAt(0)+ "," +sentence2.charAt(4)+" and " +sentence2.charAt(sentence2.length()-1)+" .");

        System.out.println("------------------");











    }
}
