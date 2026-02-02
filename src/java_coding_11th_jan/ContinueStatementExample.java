package java_coding_11th_jan;

public class ContinueStatementExample {
    public static void main(String[] args) {
        //Write a Java program to print numbers from 1 to 10, but skip printing the number 5 using the continue statement.
        for(int i=1;i<=10;i++){
            if(i==5) continue;
            System.out.println(i);
        }
    }
}
