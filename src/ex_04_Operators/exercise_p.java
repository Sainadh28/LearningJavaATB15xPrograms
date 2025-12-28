package ex_04_Operators;

public class exercise_p {
    public static void main(String[] args) {
        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5);
        System.out.println(b);
// Divide and Conquer!

        // A -> balaji_salary > 10 -> 12 >10 ->  true
        // B -> balaji_salary < 5 -> 12<5 -> false
        // (A || B) -> TRUE (true || false) -> true
        // !(true) -> False

        //char int problem
        char a1 = 'A'; //  ASCII - 65
        char a2 = 'B'; //  ASCII - 66
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1+a2);
        System.out.println(a1-a2);
        // char are noting but int :D

        System.out.println('A' == 65);

        short s = 10;
        char c = 'A'; //65
        System.out.println(c + s); // 65+10
    }
}
