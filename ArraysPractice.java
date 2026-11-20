import java.util.Scanner;

public class ArraysPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        run(scanner);
        scanner.close();
    }

    public static void run(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("\n=== Java Arrays Practice ===");
            System.out.println("1. Count Positive, Negative, and Zero Values");
            System.out.println("2. Largest and Smallest Elements");
            System.out.println("3. Numbers Greater Than the Average");
            System.out.println("4. Print an Array in Reverse Order");
            System.out.println("5. Student Test Scores");
            System.out.println("0. Back");
            System.out.print("Choose a task: ");

            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    runTask1();
                    break;
                case 2:
                    runTask2();
                    break;
                case 3:
                    runTask3();
                    break;
                case 4:
                    runTask4();
                    break;
                case 5:
                    runTask5(scanner);
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Unknown option. Choose between 0 and 5.");
                    break;
            }
        }
    }

    private static void runTask1() {
        int[] numbers = {5, -3, 0, 8, -1, 0, 12, -7, 4, 2};

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : numbers) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Positive: " + positiveCount);
        System.out.println("Negative: " + negativeCount);
        System.out.println("Zero: " + zeroCount);
    }

    private static void runTask2() {
        int[] numbers = {12, 5, 28, 3, 19, 7, 15, 9};

        int max = numbers[0];
        int min = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }

        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Largest: " + max + " at index " + maxIndex);
        System.out.println("Smallest: " + min + " at index " + minIndex);
    }

    private static void runTask3() {
        int[] numbers = {10, 20, 30, 40, 50, 60};

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;
        int countAboveAverage = 0;

        for (int num : numbers) {
            if (num > average) {
                countAboveAverage++;
            }
        }

        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + countAboveAverage);
    }

    private static void runTask4() {
        int[] numbers = {3, 8, 12, 5, 9, 2, 7};

        System.out.print("Original: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Reversed: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    private static void runTask5(Scanner scanner) {
        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            while (true) {
                System.out.print("Enter score " + (i + 1) + " (0-100): ");
                if (scanner.hasNextInt()) {
                    int input = scanner.nextInt();
                    if (input >= 0 && input <= 100) {
                        scores[i] = input;
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid score. Please enter a value between 0 and 100.");
            }
        }

        int passedCount = 0;
        int failedCount = 0;
        int sum = 0;

        for (int score : scores) {
            sum += score;
            if (score >= 60) {
                passedCount++;
            } else {
                failedCount++;
            }
        }

        double average = (double) sum / scores.length;

        System.out.print("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        System.out.println("Passed: " + passedCount);
        System.out.println("Failed: " + failedCount);
        System.out.println("Average: " + average);
    }
}