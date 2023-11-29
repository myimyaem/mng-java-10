package taskguide;

import java.util.Scanner;

public class Task116 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int[] num1= new int[3];
        num1[0] = input1.nextInt();
        num1[1] = input1.nextInt();
        num1[2] = input1.nextInt();

        // for(int a : num1){
        //     System.out.println(a);
        // }
        if(num1[0]==num1[2] && num1[1]==num1[2])
            System.out.println("All int are equal");
        else if(num1[0]>=num1[1] && num1[0]>=num1[2])
            System.out.println(num1[0]+" is the largest int");
        else if(num1[0]<=num1[1] && num1[1]>=num1[2])
            System.out.println(num1[1]+" is the largest int");
        else if(num1[0]<=num1[2] && num1[1]<=num1[2])
            System.out.println(num1[2]+" is the largest int");
        else
            System.out.println("invalid input12");
        
    }
    
}


// Check whose largest number in 3 inputs
// Write a program that takes in three numbers from the user and outputs the largest number. if all numbers are equal it will print All numbers are equal