package taskguide;

public class Task118 {
    public static void main(String[] args) {
        System.out.println(addAllInt(10,100,1000));
    }
    static int addAllInt(int... num){
        int b = 0;
        for(int a:num){
            b+=cumulativeSum(a);
        }
        return b;
    }
    static int cumulativeSum(int num){
        int a =0;
        for(int x = 1;x<=num;x++)
            a+=x;
        return a;
    }
}
