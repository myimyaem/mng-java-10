package chapter4;

public class StaticSample {
    public static int y;
    static int addTwoNumber(int a, int b){
        return a+b;
    }
    public int z;
    public static void main(String[] args) {
        StaticSample ss = new StaticSample();
        System.out.println(y+"****"+ss.z);
        y=8;ss.z=8;
        StaticSample ss2 = new StaticSample();
        System.out.println(ss.y+"****"+ ss.z);
        ss.y = 89;ss.z = 89;
        System.out.println(y +"*****"+ss.y+"^^^"+ss.z);
        System.out.println(y +"*****"+ss2.y+"^^^"+ss2.z);
        System.out.println(addTwoNumber(y, y));
        System.out.println(ss2.addTwoNumber(y, y));
    }
}
