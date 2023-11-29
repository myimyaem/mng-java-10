package chapter5.hayop;

public class Lion extends Animal {
    private void roar(){
        System.out.println("the "+getAge()+" year old lion named:"+getName()+" says: Roar!");
    }
    public Lion(int age,String name){
        super(age,name);
        super.callSup("23658");


    }
    
    public static void main(String[] args) {
        Lion simba = new Lion(21,"King");
        Lion scar = new Lion(45,"Scar");
        simba.roar();
        scar.roar();
    }
}
