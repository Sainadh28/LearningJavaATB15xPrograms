package ex_06_Ternary_Operator;

public class ternary_ex {
    public static void main(String[] args) {
        int age = 19;
        String canAmolGotoGoa = age > 18 ? "Yes" : "No";
        System.out.println(canAmolGotoGoa);

        int number = -5;
        String result = number > 0 ? "+ve" : "-ve";
        System.out.println(result);

        int amol_age = 21;
        String result1 = amol_age > 18 ? (amol_age > 25 ? "You can drink": "You can't") : "No you can't go to GOA";


        int x = 10;
        int y = 20;
        int max = x > y ? x : y;
        int min = x > y ? y : x;
        System.out.println(max);
        System.out.println(min);

        int num = 13;
        String result = (num%2 ==0) ? "even" : "odd";
        System.out.println(result);

    }
}
