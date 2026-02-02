package java_coding_11th_jan;

import java.util.Scanner;

public class BreakStatementExample {
    public static void main(String[] args) {
        //Write a Java program to print numbers from 1 to 10, but stop the loop when the number becomes 5 using the break statement.
        for (int i=1;i<=10;i++){
            if(i==5) break;
            System.out.println(i);
        }

    }
}
