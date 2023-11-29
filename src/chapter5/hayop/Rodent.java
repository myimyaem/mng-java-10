package chapter5.hayop;

public class Rodent {
    protected int tailLength = 4;
    public void getRodentDetails(){
        System.out.println("[parentTail="+tailLength+"]");
    }
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
    }   
}
class Mouse extends Rodent{
    protected int tailLength = 8;
    public void getMouseDetails(){
        System.out.println("[Tail="+tailLength+",parentTail="+super.tailLength+"]");
    }
}