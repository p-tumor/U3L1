import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BooleanGames game1 = new BooleanGames(-15);
        System.out.println(game1.isNegative());
        System.out.println("----");
        System.out.println(game1.exceeds(-20));
        System.out.println(game1.exceeds(-15));
        System.out.println(game1.exceeds(0));
        System.out.println("----");
        System.out.println(game1.isEven());
        System.out.println(game1.isOdd());
        System.out.println("----");
        System.out.println(game1.isMultipleOf(1));
        System.out.println(game1.isMultipleOf(3));
        System.out.println(game1.isMultipleOf(5));
        System.out.println(game1.isMultipleOf(15));
        System.out.println(game1.isMultipleOf(10));
        System.out.println(game1.isMultipleOf(2));
        System.out.println(game1.isMultipleOf(30));
        System.out.println("----");
        System.out.println(game1.isOnesDigit(5));
        System.out.println(game1.isOnesDigit(1));
        System.out.println(game1.isOnesDigit(6));
        System.out.println("----");
        System.out.println(game1.isFirstDigit(1));
        System.out.println(game1.isFirstDigit(5));
        System.out.println(game1.isFirstDigit(15));
        System.out.println(game1.isFirstDigit(0));

    }
}
