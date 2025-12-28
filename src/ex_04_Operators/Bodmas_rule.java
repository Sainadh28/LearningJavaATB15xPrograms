package ex_04_Operators;

public class Bodmas_rule {
    public static void main(String[] args) {
        // BODMAS - Bracket of Div, mul, add, sub

        // First of all, whenever it sees strings,
        // it will do concatenation, and for the next
        // one also it will also do concatenation.
        // But when it sees integers first, it will do mathematical operation.
        // The second time it will see strings,
        // then it will do concatenation as well.

        System.out.println((9 * 3 / 9 + 1) * 3);
        // BODMAS
        //  // 9x3 -> 27
        // 27/9 -> 3
        // 3+1 -> 4
        // 4x3 -> 12
    }
}
