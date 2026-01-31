package java_coding_11th_jan;

import java.util.Scanner;
//Description:
//Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.

public class positiveNegativeZero {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int n=i.nextInt();
        String result= (n>0)? "Positive" : (n<0) ? "Negative" : "Zero";
        System.out.println(result);
        i.close();
    }
}
