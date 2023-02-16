package day16_Methods;

public class c14_deneme5reversestring {

    public static void main(String[] args) {
        reverseString("Hello World");
        String name1= "Ridvan Oral";
        reverseString(name1);



    }

    //we will create our own reverse library method
    //this method will accept a string
    //as a result it should return reverse of the string
    public static void reverseString(String name){
        String result= "";
        for (int i= name.length()-1; i>=0; i--){

            result += name.charAt(i);
        }

        System.out.println(result);

    }

}
