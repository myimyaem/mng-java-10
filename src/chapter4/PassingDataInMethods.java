package chapter4;

public class PassingDataInMethods {
    public static void main(String[] args) {
        int num =4;
        newNumber(5);
        System.out.println(num);
    }

    private static void newNumber(int num) {
        System.out.println("Method variable num in newNumber() method is:  "+num);
        num = 8;
        System.out.println("Method variable num in newNumber() method is:  "+num+" after assigning new value.");
    }
}
