package day04_ifStatement;

public class c1_postPreConditions {

    public static void main(String[] args) {

        byte x= 21;

        System.out.println(x); //21
        System.out.println(--x); // pre decrease number by one //20

        // post
        int w=30;
        System.out.println(w--); //post //30 it will be 29 on next line
        System.out.println(w--); //post //29 but it will be 28 on next line
        System.out.println(--w); //pre 28-1= 27 next line will still be 27
        System.out.println(w); //27
        System.out.println(w++);// post // 27 it will be 28 on next line
        System.out.println(w); //28

        System.out.println("--------------");
byte bt=4;
        System.out.println(bt);
        System.out.println(bt++);
        System.out.println(bt++);
        System.out.println(bt++);

    }
}
