package chapter4;

import java.util.ArrayList;
import java.util.List;

public class LamdaSample {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("Kangaroo", true, false));
        animals.add(new Animal("Rabbit", true, false));
        animals.add(new Animal("Turtle", false, true));
        animals.add(new Animal("Giraffe", false, false));
        animals.add(new Animal("Frog", true, true));
         System.out.println("Hopper List");
        //print(animals, new CheckIfHopper());
        print(animals, a -> a.canSwim());
        System.out.println("Swimmers List");
        //print(animals, new CheckIfSwimmer());
        print(animals, a -> !a.canSwim());
        System.out.println("can hop and swim List");
        print(animals, a -> a.canSwim() && a.canHop() );
        
    }
    static void print(List<Animal> animals,Predicate<Animal> checker){
        for(Animal animal: animals){
            if( checker.test(animal))
                System.out.println(animal);
        }
        System.out.println();
    }

    
}

class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer; }

        public boolean canHop() { return canHop; }
        public boolean canSwim() { return canSwim; }
        public String toString() { return species; }
    }

// interface CheckTrait {
//     boolean test(Animal a); 
// }

// class CheckIfHopper implements CheckTrait {
//         public boolean test(Animal a) {
//             return a.canHop(); } 
//         }

// class CheckIfSwimmer implements CheckTrait {
//         public boolean test(Animal a) {
//             return a.canSwim(); } 
      //}

interface Predicate<T> { 
    boolean test(T t); 
}