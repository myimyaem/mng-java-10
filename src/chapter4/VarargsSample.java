package chapter4;

import static org.junit.jupiter.api.Assumptions.abort;

public class VarargsSample {
    public static int addFourNumbers(int a, int b, int c, int d){
        int result = 0;
        result+=a+b+c+d;
        return result;
    }
    public static int addAllNumbers(int... a){
        int result = 0;
        for(int b:a) 
            result+=b;
        return result;
    }
    public static String addAllNumbersWithString(String name,int... a){
        int result = 0;
        for(int b:a) 
            result+=b;
        return "Hello "+name+" the result of all integer is: "+ result;
    }
    public int getAge(){
        return 31;
    }
    public static int numberStaticSample(){
        return 24;
    }

    public static void main(String[] args) {
        VarargsSample vs = new VarargsSample();
        System.out.println(addFourNumbers(89,53,123,813));
        System.out.println(addAllNumbers(89,53,123,813));
        System.out.println(addAllNumbers(89,53,89,53,123,81389,53,123,81389,53,123,81389,53,123,813));
        System.out.println(addAllNumbersWithString("Marco",89,53,89,53,123,81389,53,123,81389,53,123,81389,53,123,813));
        System.out.println(addAllNumbersWithString("Marco"));
        System.out.println(vs.getAge());
        System.out.println(numberStaticSample());

    }
}
