import java.util.Scanner;

public class HomeworkThree {
    public static void WhileTaskOne(Scanner scanner) {
        double i = 1;
        while (i <= 1000) {
            i *= 10;
            System.out.println("'i' = " + i);
        }
    }

    public static void ForTaskOne(Scanner scanner) {
        for (double i = 1; i < 1000; i *= 10)
            System.out.println("'i' = " + i);
    }

    public static void FromOneToN(Scanner scanner) {
        System.out.print("Write a number: ");
        int nnn = scanner.nextInt();

        for (int num = 0; num <= nnn; num += 1)
            System.out.println(num);
    }

    public static void FromOneToNOddEven(Scanner scanner) {
        System.out.print(" ");
        System.out.print(" From One To N ( with Odd & Even)");
        int nnn = scanner.nextInt();
        System.out.print("What u want ");
        System.out.print("1 - only Odd ");
        System.out.print("2 - only Even");
        System.out.print("Answer: ");
        int answer = scanner.nextInt();

        if (answer == 1) {
            for (int num = 0; num <= nnn; num += 1)
                if (num % 2 == 0) {
                    System.out.println(num);
                }
        } else if (answer == 2) {
            for (int num = 0; num <= nnn; num += 1)
                if (num % 2 != 0) {
                    System.out.println(num);
                }
        } else {
            System.out.print("BRO, ONLY FROM LIST!!!!!!!!!!! ");
        }
    }

    public static void FizzBuzz(Scanner scanner) {
        System.out.print(" ");
        System.out.print("Write a number: ");
        int nnn = scanner.nextInt();

        for (int num = 1; num <= nnn; num += 1)
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
    }

    public static void ATM(Scanner scanner) {
        System.out.println("----- ATM -----");
        System.out.print("Create a PIN: ");
        int pin = scanner.nextInt();
        int attempts = 3;
        System.out.println("U have " + attempts + " attempts");
        System.out.println(" ");
        while (attempts > 0) {
            System.out.print("Enter PIN: ");
            int nip = scanner.nextInt();

            if (nip == pin) {
                System.out.println("Nice!");
                return;
            } else {
                attempts--; //attempts = attempts - 1;
                System.out.println("!!!Wrong!!!.");
                System.out.println("Attempts left: " + attempts);
            }
        }
        System.out.println("Card blocked.>:^");
    }

    public static void GuessTheNumber(Scanner scanner) {
        System.out.println("----- Guess The Number ----- ");
        System.out.print("Think of a number: ");
        int num = scanner.nextInt();
        int attempts = 5;
        System.out.println("U have " + attempts + " attempts");
        System.out.println(" ");
        while (attempts > 0) {
            System.out.print("Enter a number: ");
            int nip = scanner.nextInt();

            if (nip == num) {
                System.out.println("Nice!");
                return;
            } else if (nip > num) {
                attempts--;
                System.out.println("Too high!");
                System.out.println("Attempts left: " + attempts);
                System.out.println(" ");
            } else {
                attempts--;
                System.out.println("Too low!");
                System.out.println("Attempts left: " + attempts);
                System.out.println(" ");
            }
            if (attempts == 1) {
                System.out.println("↓ ↓ ↓ LAST TRY ↓ ↓ ↓ ");
            }
        }
        System.out.println("U lose. XD");
    }

    public static void NumberStatistics(Scanner scanner) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Positive numbers " + positiveCount);
        System.out.println("Negative numbers " + negativeCount);
        System.out.println("Zeros " + zeroCount);
        System.out.println("Even numbers " + evenCount);
        System.out.println("Odd numbers " + oddCount);
    }
}