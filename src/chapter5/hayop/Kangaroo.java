package chapter5.hayop;

public class Kangaroo extends Marsupial {
    public boolean isBiped(){
        return true;
    }
    public void getKangarooDescription(){
        System.out.println("Kangaroo walks on two legs:"+isBiped());
    
    }
    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}
