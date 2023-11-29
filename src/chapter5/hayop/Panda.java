package chapter5.hayop;

public class Panda extends Bear{
    public static void eat(){
        System.out.println("Panda bear is chewing Bamboo");
    }
    // public void sneeze(){
    //     System.out.println("Panda is sneezing");
    // }
    // public static void hibernate(){
    //     System.out.println("Panda is hibernating");
    // }
    public static void main(String[] args) {
        Panda.eat();
        Bear.eat();
    }
}
