package chapter5.polymorphism;

public class ZooWorker {
    public static void feed(Reptile reptile) {
        System.out.println("Feeding "+reptile.getAge()+" year old reptile "+reptile.getName());
        
    }
    public static void main(String[] args) {
        feed(new Alligator());
        feed(new Crocodile());
        feed(new Reptile());
       // feed(new Peacock());
    }
    
}
