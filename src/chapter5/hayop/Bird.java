package chapter5.hayop;

public class Bird {
    public final boolean hasFeathers(){
        return true;
    }
}


class Penguin extends Bird{
    // public final boolean hasFeathers(){ // error cannot override parent final method
    //     return false;
    // }
}