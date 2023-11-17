package chapter4;

public class ConstructorSample {
    ConstructorSample(){
        System.out.println("ConstructorSample constructed");
    }
    public static void main(String[] args) {
        Bunny buggs = new Bunny();
        Bunny white = new Bunny();
        Bunny black = new Bunny("Black");
        Bunny red = new Bunny("Red");

        ConstructorSample cs = new ConstructorSample();
        ConstructorSample cs2 = new ConstructorSample();
        ConstructorSample cs3 = cs;
        System.out.println(black.color);
        System.out.println(red.color);
        System.out.println(buggs.color);
        System.out.println(white.color);

        Rabbit1 r1 = new Rabbit1();
        Rabbit2 r2 = new Rabbit2();
        Rabbit3 r3 = new Rabbit3(true);
        // Rabbit4 r4 = new Rabbit4(); // DOES NOT COMPILE
       
    }
    
}


class Bunny { 
    public String color;
     Bunny(String color) {
        this.color = color;  
        System.out.println("new Bunny constructed with a color of "+this.color);
     }
     Bunny() {
         System.out.println("constructor"); 
        }
         }
class Rabbit1 { }
class Rabbit2 {

public Rabbit2() { }

}
class Rabbit3 {

public Rabbit3(boolean b) { }

}
class Rabbit4 {

private Rabbit4() { }
int getnum(){
    Rabbit4 r4 = new Rabbit4();
    return 0;
}

}
class Hamster {
    private String color;
    private int weight;
    public Hamster(int weight) { // first constructor
        this.weight = weight;
        color = "brown";
    }
    public Hamster(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
 }
}
