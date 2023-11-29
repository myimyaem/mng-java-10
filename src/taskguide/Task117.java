package taskguide;

public class Task117 {
    int sumOftwoNumbers(int a, int b){
            return a+b;
        }
    float quotientOfTwoNum(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        // 4 methods of two numbers : +,-,*, and /
        // the sum of two numbers is: 
        Task117 q = new Task117();
        System.out.println("the sum of two numbers is: "+q.sumOftwoNumbers(100, 21));        
        System.out.println("the quotient of two numbers is: "+q.quotientOfTwoNum(100, 20));        
        

    }
}
