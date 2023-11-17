package chapter4;

public class MethodOverloadSample {
    public void fly(int numMiles) { } 
    public void fly(short numFeet) { }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }
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