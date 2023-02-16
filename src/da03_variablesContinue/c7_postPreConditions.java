package da03_variablesContinue;

public class c7_postPreConditions {

    public static void main(String [] args){
        int x= 10;

        System.out.println(x);
        // pre condition
        System.out.println(++x); // pre condition will increase your number by one immediately
        System.out.println(x);


        System.out.println(+x); // one plus wont add anything it will effect number if positive or negative

        int y= 20;

        System.out.println(y);
        System.out.println(y++); //post condition will increase the number on next step //11
        System.out.println(y);

        //pre: this will change the value of number immidiately
        //post: first wont gonna change anything on the variable, at the end it will change it


        x= x + 5;

    }

}
