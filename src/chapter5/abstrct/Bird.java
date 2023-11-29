package chapter5.abstrct;

public class Bird extends Monster implements CanBurrow, CanGlide{
    // public abstract String roar(); error
    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public int setSpeed() {
        return 0;
        }

    @Override
    public int setPower() {
        return 0;
    }
    public static void main(String[] args) {
        // Monster m = new Monster();
        Bird n = new Bird();
        n.getSpeed();
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getMaximumDepth() {
        // TODO Auto-generated method stub
        return 10;
        }

    @Override
    public int getMaxSpeed() {
        // TODO Auto-generated method stub
        return 100;
    }
    
}
