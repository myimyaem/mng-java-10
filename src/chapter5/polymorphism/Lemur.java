package chapter5.polymorphism;

public class Lemur extends Primate implements HasTail {

    @Override
    public boolean isTailStriped() {
       return false;
    }
    public int age = 10;
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        // System.out.println(hasTail.age);

        Primate primate  = lemur;
        // Lemur lemur2 = new Primate();
        System.out.println(primate.hasHair());
        
        // System.out.println(primate.isTailStriped());
    }
    
}
