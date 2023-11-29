package chapter5.abstrct;

public interface CanGlide extends CanGlideInAir {
    int speed = 10+MIN_SPEED;
    int getMaxSpeed();
    public default double getSpeed() {
        return speed;
    }
}
