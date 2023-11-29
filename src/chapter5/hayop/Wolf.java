package chapter5.hayop;

public class Wolf extends Canine {
    public double getAverageWeight(){
        return super.getAverageWeight()+20;
    }
    static void recursion(int i){
        if(i>0){
            System.out.println("recursive method i="+i);
            i--;
            recursion(i);
        }
    }
    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
        recursion(5);
    }
}
