package chapter4;

public class MethodSample2 {

    public static MethodSample sampleObject()
    {
        return null;
    }
    public static void main(String[] args) {
        MethodSample ms = new MethodSample();
        System.out.println(ms.greetGuest());
        // System.out.println(ms.getGuestNumber()); //error
        System.out.println(ms.isHavingFun());
        System.out.println(ms.getNameOfGuest());
    }
    
}