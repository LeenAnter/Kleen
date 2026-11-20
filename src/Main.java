
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== My Programs =====");
            System.out.println("1. ArraysPractice");
            System.out.println("0. Exit");
            System.out.print("Choose program: ");

            int choose = scanner.nextInt();
            switch (choose) {
                case 1 -> ArraysPractice.run(scanner);
                case 0 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Unknown.");
            }
        }
    }
}






