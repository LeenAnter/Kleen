import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while(loop) {
            System.out.println(" ");
            System.out.println("Choose");
            System.out.println("0 - Exit");
            System.out.println("1 - Middle Task");
            System.out.println("2 - Homework 2");
            System.out.println("3 - Homework 3");
            System.out.println("4 - Lab Assigment");
            System.out.print("Answer(number): ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                loop = false;
            } else if (choice == 2) {
                runSmallTasksMenu(scanner);
            } else if (choice == 1){
                runMiddleTasksMenu(scanner);
            } else if (choice == 3){
                runHomeworkThreeMenu(scanner);
            } else if (choice == 4) {
                System.out.println("Not ready yet");
            }  else {
                System.out.println("Bruh, just numbers from list!!!");
            }
        }
    }

    public static void runSmallTasksMenu(Scanner scanner){
        System.out.println(" ");
        System.out.println("---Homework 2---");
        System.out.println("Choose program");
        System.out.println("1 - MaxNumber ");
        System.out.println("2 - Check Age");
        System.out.println("3 - Odd or even");
        System.out.println("4 - New Calculator");
        System.out.println("5 - Grades");
        System.out.println("6 - Loan Approval System");
        System.out.println("7 - Discount Calculator ");
        System.out.print("Answer(number): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            SmallTasks.runMaxnumber(scanner);
        } else if (choice == 2) {
            SmallTasks.runCheckage(scanner);
        } else if (choice == 3) {
            SmallTasks.runOddOrEven(scanner);
        } else if (choice == 4) {
            MiddleTasks.runCalculator(scanner);
        } else if (choice == 5) {
            SmallTasks.Grades(scanner);
        } else if (choice == 6) {
            SmallTasks.LoanApprovalSystem(scanner);
        } else if (choice == 7) {
            SmallTasks.runDiscountCalculator(scanner);
        } else {
            System.out.println("Bruh, just numbers from list!!!");
        }


    }
    public static void runMiddleTasksMenu(Scanner scanner){
        System.out.println(" ");
        System.out.println("---Middle tasks Menu---");
        System.out.println("Choose program");
        System.out.println("1 - Calculator");
        System.out.print("Answer(number): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Removed");
        } else {
            System.out.println("Bruh, just numbers from list!!!");
        }
    }

    public static void runHomeworkThreeMenu(Scanner scanner) {
        System.out.println(" ");
        System.out.println("---Homework tasks Menu---");
        System.out.println("Choose program");
        System.out.println("1 - Simple While 'i'");
        System.out.println("2 - Simple For");
        System.out.println("3 - From One To N");
        System.out.println("4 - infinite loop");
        System.out.println("5 - From One To N (only Even)");
        System.out.println("6 - FizzBuzz");
        System.out.println("7 - Practice Session");
        System.out.print("Answer(number): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            HomeworkThree.WhileTaskOne(scanner);
        } else if (choice == 2) {
            HomeworkThree.ForTaskOne(scanner);
        } else if (choice == 3) {
            HomeworkThree.FromOneToN(scanner);
        } else if (choice == 4) {
            System.out.println("This Program have already infinite!! (Until u write '0' ofc)");
        } else if (choice == 5) {
            HomeworkThree.FromOneToNOddEven(scanner);
        } else if (choice == 6) {
            HomeworkThree.FizzBuzz(scanner);
        } else if (choice == 7) {
            runPracticeSession(scanner);
        } else {
            System.out.println("Bruh, just numbers from list!!!");
        }
    }

    public static void runPracticeSession(Scanner scanner){
        System.out.println(" ");
        System.out.println("---Practice Session Menu---");
        System.out.println("Choose program");
        System.out.println("1 - ATM");
        System.out.println("2 - Guess The Number");
        System.out.println("3 - Number Statistics");
        int choice = scanner.nextInt();

        if (choice == 1) {
            HomeworkThree.ATM(scanner);
        } else if (choice == 2) {
            HomeworkThree.GuessTheNumber(scanner);
        } else if (choice == 3) {
            HomeworkThree.NumberStatistics(scanner);
        } else {
            System.out.println("Bruh, just numbers from list!");
        }
    }

    public static void LabAssigment(Scanner scanner){
        System.out.println(" ");
        System.out.println("---Lab Assigment Menu---");
        System.out.println("Choose program");
        System.out.println("1 - ");
        System.out.println("2 - ");
        System.out.println("3 - ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Not ready yet");
        } else if (choice == 2) {
            System.out.println("Not ready yet");
        } else if (choice == 3) {
            System.out.println("Not ready yet");
        } else {
            System.out.println("Bruh, just numbers from list!");
        }
    }
}




