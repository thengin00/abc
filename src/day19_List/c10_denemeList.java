package day19_List;

import java.util.ArrayList;

public class c10_denemeList {

    public static void main(String[] args) {
        // ArrayList<DataType>  listName = new ArrayList<DataType>();
        //ArrayList <int>        list1    =new ArrayList<int>(); collections doesnt accept primitives
        ArrayList <Integer> list2= new ArrayList<Integer>();
        // size of list 2 is zero for now, and this size is flexible

        //add() this method will add date to your list
        list2.add(25); // size 1, index 0
        list2.add(55); // size 2, index 1
        list2.add(100); // size 3, index 2
        list2.add(200); // size 4, index 3

        System.out.println(list2);


        // array example
        int [] numbers= new int[10]; // size is fixed

        // get() that will give you specific number from list
        Integer numIndex1=list2.get(1);
        System.out.println("numIndex1 = " + numIndex1);
        System.out.println(list2.get(3));
        //System.out.println(list2.get(4)); // IndexOutOfBoundsException


        list2.get(0); // will return 25 as a wrapper object


        int number0=list2.get(0);
        // we are doing unboxing
        // unboxing will help us to store wrapper object to primitive data types
        System.out.println(number0);


        ArrayList<String> namelist= new ArrayList<>(); // size 0
        namelist.add("Meral");
        namelist.add("Recep");
        namelist.add("Musab");
        namelist.add("Bawer");// size is 4, index is 3

        System.out.println(namelist);


        // size () will give us size of arraylist
        System.out.println("Size of name list is "+ namelist.size());
        System.out.println("Names are : ");
        for (int i=0; i<=namelist.size()-1; i++){
            System.out.println("namelist.get("+i+") = " + namelist.get(i));

                                                         // namelist[i] ==> array
        }



        namelist.add("Ridvan"); // size 5 index 4
        namelist.add("Jessica"); // size 6 index 5
        System.out.println(namelist.size());


        // add
        //get
        //size

    }
}
