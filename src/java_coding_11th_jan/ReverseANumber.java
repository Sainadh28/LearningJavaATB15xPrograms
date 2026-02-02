package java_coding_11th_jan;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        //Write a Java program to reverse a given number using a do-while loop.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        do {
            int n1=n%10;
            rev= rev * 10 + n1;
            n=n/10;

        }while(n!=0);
        System.out.println(rev);
        sc.close();
    }
}
