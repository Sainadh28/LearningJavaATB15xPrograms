package java_coding_11th_jan;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        //Write a Java program to perform addition, subtraction, multiplication, or division based on user choice using a switch statement.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);
        switch (c){
            case '+'->System.out.println(a+b);
            case '-'-> System.out.println(a-b);
            case '*'->System.out.println(a*b);
            case '/'->System.out.println(a/b);
            default -> System.out.println("Invalid input");
        }
        sc.close();
    }
}
