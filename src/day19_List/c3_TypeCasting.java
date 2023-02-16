package day19_List;

public class c3_TypeCasting {
    //Type Casting
    //1.Autoboxing: Converting a primitive value into an object of the corresponding wrapper class is called autoboxing.
    // For example, converting int to Integer class. The Java compiler applies autoboxing when a primitive value is:
    //Passed as a parameter to a method that expects an object of the corresponding wrapper class.
    //Assigned to a variable of the corresponding wrapper class.
    //2.Unboxing: Converting an object of a wrapper type to its corresponding primitive value is called unboxing.
    // For example conversion of Integer to int. The Java compiler applies unboxing when an object of a wrapper class is:
    //Passed as a parameter to a method that expects a value of the corresponding primitive type.
    //Assigned to a variable of the corresponding primitive type.
    //The following table lists the primitive types and their corresponding wrapper classes,
    // which are used by the Java compiler for autoboxing and unboxing:
    //Primitive Data Type	Wrapper Class
    //byte	                Byte
    //short	                Short
    //int	                Integer
    //long	                Long
    //float	                Float
    //double	            Double
    //boolean	            Boolean
    //char	                Character


    public static void main(String[] args) {
        //create an Integar object
        Integer myInt1 = new Integer(10);

        int i1=myInt1; //unboxing
        //converting an object of wrapper Inegar corresponding value int

        Character myCh='w';//autoboxing
        //we take char 'w' and assigned to wrapper classes
        //Converting a primitive value into an object of the corresponding wrapper class is

        char ch2=myCh; //unboxing

        System.out.println("myCh = " + myCh);
        System.out.println("ch2 = " + ch2);

        int number= 100; //primitive

        Integer myInt=number;//autoboxing

        Byte myBytte=25;
        byte b1=myBytte; //unboxing

        //Integer myInt2=b1; error
    }
}

//git hub assignment ;
// you created one project and pushed to Github
// who ever created that project needs to give a collabration access to others
//others will accept and clone the project in their local
//each member will have branch that has their name (make sure to work at your branch)
// have extra dev-test branch
// then each member will create a package call their names.
// practice git comments, practice full requests from github