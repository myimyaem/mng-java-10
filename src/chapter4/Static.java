package chapter4;
import static chapter4.SampleStaticImport.*;
import static chapter4.StaticImportConflict.greetMe;
public class Static {
    int x=0;
    static int y=0;
    private String name = "Static class";
    public static void first(){}
    public static void second(){}
    public void third(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Static Static = new Static();        
        int y = 99;
        first();
        second();
        // Static.third();
        new Static().third();
        Static.x=1;
        y=1;
        System.out.println(y);
        System.out.println(Static.y);
        greetMe("Marco");
        SampleStaticImport.greetMe("Jane");
        
        System.out.println(areYouHappy(true));
    }
}
