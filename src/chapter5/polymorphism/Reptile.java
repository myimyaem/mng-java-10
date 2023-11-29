package chapter5.polymorphism;

public class Reptile {
    public String getName(){
        return "Reptile";
    }
    
}
class Alligator extends Reptile{
    public String getName(){
        return "Alligator";
    }
}

class Crocodile extends Reptile{
    public String getName(){
        return "Crocodile";
    }
}