package ex_08_If_Condition;

import java.util.Scanner;

public class if_else_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE AGE!");
        int age = scanner.nextInt();
        // double d = scanner.nextDouble();
        // float f = scanner.nextFloat();
        System.out.println(age);
        if(age > 19){
            System.out.println("Hi");
        }

    }
}
