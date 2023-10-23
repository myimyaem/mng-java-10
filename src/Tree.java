import java.util.*;
import filea.*;
import filea.fileb.ClassB;
// import java.util.Random;
// import java.util.Timer;
// import java.util.LinkedList;
// import java.util.ArrayList;

public class Tree {
    public static void main(String[] args) {
        Random r = new Random();
        Timer clock1 = new Timer();
        ClassA aa = new ClassA();
        ClassB bb = new ClassB();
        System.out.println(r.nextInt(100));
        { System.out.println("instance ini");}
        System.out.println(bb.classBNumber());
        ClassA aaa = new ClassA();
        ClassA aaaa = aa;
        aa = null;
        aaaa = null;
       }
}
