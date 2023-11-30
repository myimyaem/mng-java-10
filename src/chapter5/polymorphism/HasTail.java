package chapter5.polymorphism;

public interface HasTail {
    public boolean isTailStriped();
    default int numberOfStripes(){
        return 4;
    };
}
