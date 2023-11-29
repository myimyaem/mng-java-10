package chapter5.abstrct;

public abstract class Monster extends LivingThings {
    private int age;
    void setAge(int age){
        this.age = age;
    }
    public abstract int getAge();
    public abstract int setSpeed();
    public abstract int setPower();
    
}
