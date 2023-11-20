package chapter4;

public class ConstructorOverloadSample {
    public static void main(String[] args) {
    Mouse mouse = new Mouse(15);
    mouse.print(); 
    MouseHouse Disney =new MouseHouse(12, 20, 15);
    System.out.println(Disney.volume);
    // Disney.volume=4000;
    InitializationOrderSimple init = new InitializationOrderSimple();
}
    
}

class Mouse {

    private int numTeeth;
    private int numWhiskers;
    private int weight;
    public Mouse(int weight) { // calls constructor with 2 parameters
        this(weight, 16); 
    } 
    public Mouse(int weight, int numTeeth) { // calls constructor with 3 parameters
        this(weight, numTeeth, 6); 
    } 

    public Mouse(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers; 
    }

    public void print() { 
        System.out.println(weight + " " + numTeeth + " " + numWhiskers); 
    }
  }
class MouseHouse {
    public final int volume;
    private final String name = "The Mouse House";
    public MouseHouse(int length, int width, int height) {
        volume = length *width*height;
    }
}
class InitializationOrderSimple {
    private String name = "Torchie";
    { System.out.println(name); }
    private static int COUNT = 0;
    static { 
        System.out.println(COUNT); 
    }
    static { 
        COUNT += 10; System.out.println(COUNT); 
    }
    public InitializationOrderSimple() {
        System.out.println("constructor");
    }
}
