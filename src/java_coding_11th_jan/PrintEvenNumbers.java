package java_coding_11th_jan;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        //Write a Java program to print all even numbers between 1 and 50 using a do-while loop.
        int i=1;
        do {
            if(i%2==0){
                System.out.println(i);

            } i++;
        }while(i<=50);
    }
}
