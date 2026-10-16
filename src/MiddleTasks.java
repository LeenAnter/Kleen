import java.util.Scanner;

public class MiddleTasks {
    public static void runCalculator(Scanner scanner) {
        System.out.println("\n ----- CALCULATOR -----");

        System.out.print("First number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Choose operator (+, -, /, *): ");
        char operation = scanner.next().charAt(0);

        double result = 0;
        String OpName = "";

        switch (operation) {
            case '+' -> {
                OpName = "Addition";
                result = num1 + num2;
            }
            case '-' -> {
            OpName = "Subtraction";
            result = num1 - num2;
            }
            case '*' -> {
                OpName = "Multiplication";
                result = num1 * num2;
            }
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Dont '/' on 0  !!!!! U DUMBASS");
                    return;
                }
                OpName = "Division";
                result = num1 / num2;
            }
            default -> {
                System.out.println("Use only from u're list!");
                return;
            }
        };

        System.out.println("Operation: " + OpName);
        System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);

        if (result == 67.0) {
            System.out.println("SIX SEVEEN");
        } else if (result == 777) {
            System.out.println("JACKPOT");
        } else if (result == 666) {
            System.out.println("NO WAY. IT'S DEVIL NUMBER");
        } else {
            System.out.println("END!");
        }
    }
}