package chapter5;

import chapter4.MethodSample;

public class ExtendsSample1 extends MethodSample {
    public static void main(String[] args) {
        ExtendsSample1 ms = new ExtendsSample1();
        System.out.println(ms.greetGuest());
        // System.out.println(ms.getGuestNumber()); //error
        System.out.println(ms.isHavingFun());
    }
}
