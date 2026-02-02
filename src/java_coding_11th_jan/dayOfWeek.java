package java_coding_11th_jan;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        //Write a Java program to print the name of the day based on a number (1–7) using a switch statement.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
            default-> System.out.println("Invalid Input");
        }
        sc.close();
    }
}
