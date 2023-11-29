package chapter5.hayop;

public class Animal extends LivingThings {
    private int age;
    public Animal(int age, String name) {
        super(name);
        this.age = age;
        
    }
    // public Animal(int age) {
    //     this(age);
    //     super("unknown");  
    // }
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public void callSup(String msg){
        System.out.println("super method is called with a message: "+msg);
    }
}

class LivingThings{
    private String name;
    public LivingThings(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
}
