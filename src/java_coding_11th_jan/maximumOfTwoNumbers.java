package java_coding_11th_jan;

import java.util.Scanner;
//Description:
//Write a Java program to find the maximum of two numbers using the ternary operator.
public class maximumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=input.nextInt();
        System.out.println("Enter the second number");
        int b=input.nextInt();
        int result= (a>b)?a:b;
        System.out.println(result);
        input.close();
    }
}
