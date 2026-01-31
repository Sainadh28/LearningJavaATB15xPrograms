package Task;

import java.util.Scanner;

public class triangle_classifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        if(a == b && b == c){
            System.out.println("Equilateral Triangle");}
            else if(a==b || b==c || c==a ){
                System.out.println("Isosceles Triangle");}
            else
        {
                System.out.println("Scalene Triangle");}
            scanner.close();
        }
    }

