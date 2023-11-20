package chapter4;

public class EncasulationSample {
    public static void main(String[] args) {
        Swan motherSwan  = new Swan();
        Swan titaSwan  = new Swan();
        motherSwan.setNumberEggs(8);
        titaSwan.setNumberEggs(-5);
        System.out.println(motherSwan.getNumberEggs());
        System.out.println(titaSwan.getNumberEggs());
        Bird angryBird = new Bird(15);
        // angryBird.setNumberEggs(12);
        System.out.println(angryBird.getNumberEggs());

        
    }
    
}

class Swan { 
    private int numberEggs; 
    public int getNumberEggs() { // getter
    return numberEggs;
    }
    public void setNumberEggs(int numberEggs) { // setter
        if (numberEggs >= 0) // guard condition
            this.numberEggs = numberEggs; } }
class Bird { 
    private int numberEggs; 
    public int getNumberEggs() { // getter
        return numberEggs;
    }
    public Bird(int numberEggs){
        this.numberEggs = numberEggs;
    }
}