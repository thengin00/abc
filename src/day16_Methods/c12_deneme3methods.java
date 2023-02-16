package day16_Methods;

public class c12_deneme3methods {

    public static void main(String[] args) {
        printJava10();
        hello();
        hello();
        evenNumbers100();
        hello();




    }
    //decleretion of the method
    //    // public               static           void               main        (String [] args){
    //    // Access-modifier       specifier        return-type        methodName  (parameter)
    //    //statements ,code
    //    //}
    //
    //    // Access-Modifier : public, protected ,default ,priavate(ozel)
    //    //specifier   : static ,final ,abstract ,synchronized methods type
    //    //return type : void , any datatype (int,string,char , int [] .......)
    //    //some method has parameters some don't have parameter(istedigin ismi verebilirsin)
    public static void hello(){ // function of this method is to print hello
        System.out.println("Hello");


    }

    // create a method  that will print java ten times
    public static void printJava10(){
        for (int i=0; i<=10; i++){
            System.out.println("Java");
        }

    }

    //create a method that will print even numbers between 1-100
    //    //name this method evenNumbers100
    public static  void evenNumbers100(){
        //1 -100
        // 2 4  6 8 10 ...94 96 98 100
        for (int i =2 ; i<101 ; i +=2){
            System.out.print(i + " ");
        }
        System.out.println();

    }


}
