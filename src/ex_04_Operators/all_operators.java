package ex_04_Operators;

public class all_operators {
    public static void main(String[] args) {
        boolean b1 = true;

        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);


        // Compound Assignment Operators
        int age = 10;
//        age +=10; //  age = age  + 10
//        age -=10;  // += -> age = age -10;
        age /=10;  // += -> age = age /10;
        System.out.println(age);

        // instance operator
        String s1 = new String("Pramod");
        System.out.println(s1 instanceof String);
    }
}
