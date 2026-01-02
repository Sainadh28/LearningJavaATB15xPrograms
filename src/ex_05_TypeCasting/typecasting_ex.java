package ex_05_TypeCasting;

public class typecasting_ex {
    public static void main(String[] args) {
        byte b  = 10;
        int a = b;  //  Valid syntax - Implicit - Casting Widening - JVM/ JAVA
        int a1 = (int)b;  //  Valid syntax - Explicit - Widening

        int val = 300;
        //  0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0
//        byte b = val; // Implicit Narrowing
        byte b2 = (byte)val; // Explicit Narrowing
        System.out.println(b2);

        long phone = 987654321l;
//        short s = phone; // Narrowing - implicit.
        short s1 = (short) phone; // Narrowing - Explicit.

        int course = 100;
        float NSRT_GST = 18.45f;
////        int total = course+ NSRT_GST; // Narrowing - Implicit.
//        int total = course+ (int)NSRT_GST; // Narrowing - Explicit.
//        System.out.println(total);

        float total2 = course+ NSRT_GST; // widening  - Implicit
        float total3 = (float) course+ NSRT_GST; // widening  - Explicit
        System.out.println(total2);

        char ch = 'A';
        int ascii = ch; // Widening

        int num = 66; // Narrow
        char letter = (char) num;
    }
}
