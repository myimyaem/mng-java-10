package chapter5.polymorphism;

public class Reptile {
    private int age;
    public String getName(){
        return "Reptile";
    }
    public int getAge(){
        age = 5;
        return age;
    }
    
}
class Alligator extends Reptile{
    public String getName(){
        return "Alligator";
    }
    public int getAge(){
        return 8;
    }
}

class Crocodile extends Reptile{
    public String getName(){
        return "Crocodile";
    }
    public int getAge(){
     
        return 12;
    }
}