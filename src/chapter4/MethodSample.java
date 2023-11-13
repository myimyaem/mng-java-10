package chapter4;

public class MethodSample {
    public String greetGuest(){
        
        System.out.println();
        return "Hello Guest";
    }
    private int getGuestNumber(){
        return 45;
    }
    protected boolean isHavingFun(){
        return true;
    }
    String getNameOfGuest(){
        return "Marco";
    }

     static public int twonumbers(){
        return 0;
    }
    public static void main(String[] args) {
        MethodSample ms = new MethodSample();
        System.out.println(ms.getGuestNumber());
        System.out.println(ms.isHavingFun());
        System.out.println(ms.getNameOfGuest());
        MethodSample3 ms3 = new MethodSample3();
        ms3.checkMe();
    }

 
}
class MethodSample3{
    void checkMe(){
        MethodSample ms = new MethodSample();
        // System.out.println(ms.getGuestNumber());
        System.out.println(ms.isHavingFun());
        System.out.println(ms.getNameOfGuest()); 
        //return;  //valid
    }

}

class MethodSample4{
    void checkMe(){
        MethodSample ms = new MethodSample();
        // System.out.println(ms.getGuestNumber());
    }
}   