package chapter4;

public class MethodOverloadSample {
    public void fly(int numMiles) { } 
    public void fly(short numFeet) { }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }
    public static String glide(String s) { return "1"; }
    public static String glide(String... s) { return "2";}
    public static String glide(Object o) { return "3"; }    
    public static String glide(String s, String t) { return "4"; }
    public static String glide(Object... o) { return "5"; }
    public static void main(String[] args) {
        MethodOverloadSample mo =new MethodOverloadSample();
        mo.fly();
        short x = 1;
        mo.fly(1);
        mo.fly(x);

        ReferenceTypes r = new  ReferenceTypes();
        r.fly("test");
        r.fly(56);
        r.fly(true);

        Plane p = new Plane();
        p.fly(123);
        p.fly(123L); 

        System.out.println(glide("a"));
        System.out.println(glide("a", "b"));
        System.out.println(glide("a", "b", "c"));
        System.out.println(glide('a','b','c'));
        System.out.println(glide('a'));
        
    }

     
}

class ReferenceTypes {
        public void fly(String s)
         { System.out.println("string "); } 
         public void fly(Object o)
          { System.out.println("object "); } 
         public void fly(int o)
          { System.out.println("int "); } 
         }
class Plane {
    public void fly(int i) {
        System.out.println("int "); }
    public void fly(long l) {
        System.out.println("long "); }
 }
