package day06_nestedIf_Switch;

public class c5_deneme1 {

    public static void main(String[] args) {
        //3 case with a b c
        //if the case is a result should be Hello a
        //if the case is b result should be Hello b
        //if the case is c result should be Hello c
        //if letter is something else then Hello Invalid.

        //result = "add as"  this is how you reassigned the variable
        //if you want to add something to your variable and same time keep what you have
        //you will either do result = result + "a"; //hello a
        //or shortcut result += "a" ; //hello a

        char letter='B';
        String result="Hello";

        switch (letter){
            case 'A':  result += " a";
            break;
            case 'B': result += " b";
            break;
            case 'C': result += " c";
            break;
            default: result += "Invalid ";
            break;


        }
        System.out.println(result);

    }
}
