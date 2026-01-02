package ex_08_If_Condition;

public class if_statement {
    public static void main(String[] args) {
        System.out.println("Enter the age via the CLI options\n");
        int age = Integer.parseInt(args[0]);

        if( age > 18){
            System.out.println("You can vote!");
        }else{
            System.out.println("You can't");
        }

        int age1 = 12;
        if (age1 > 25) {
            System.out.println("Yes you can go to GOA!");
        } else {
            System.out.println("You can't Go to GOA!!");
        }
    }
}
