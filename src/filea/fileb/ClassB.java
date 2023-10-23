package filea.fileb;
import filea.ClassA;
public class ClassB {
    public ClassB(){
        System.out.println("ClassB is created");
    }
    public static void main(String[] args) {
        ClassA ca = new ClassA();
        System.out.println("ClassA age is "+ca.age);
    }
    public int classBNumber(){
        return 0;
    }
}
