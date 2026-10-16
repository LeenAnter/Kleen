import java.util.Scanner;

public class SmallTasks {
    public static void runMaxnumber(Scanner scanner) {
        System.out.println("--- Yo biggest number ---");

        System.out.print("First number:");
        double val1 = scanner.nextDouble();
        System.out.print("Second number:");
        double val2 = scanner.nextDouble();
        System.out.print("Third number:");
        double val3 = scanner.nextDouble();
        double max = val1;

        if (max < val2) {
            max = val2;
        }
        if (max < val3) {
            max = val3;
        }
        System.out.println("Biggest number it's " + max);
    }

    public static void runCheckage(Scanner scanner) {
        System.out.println("----- Check Vote age -----");
        System.out.print("U're Age:");
        int val1 = scanner.nextInt();
        if (val1 >= 18 && val1 <= 120) {
            System.out.println("U can vote! Cong rats!");
        } else if (val1 > 120) {
            System.out.println("Bruh, write REAL AGE! U morrun!"
            );
        } else {
            System.out.println("U can't vote! Get out!");
        }
    }

    public static void runOddOrEven(Scanner scanner) {
        System.out.println("----- Odd Or Even -----");
        System.out.print("Enter an integer number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number " + num + " is EVEN.");
        } else {
            System.out.println("Number " + num + " is ODD.");
        }
    }

    public static void Grades(Scanner scanner) {
        System.out.println("----- Pass or Fail -----");
        boolean check = true;
        System.out.print("Attendance points(0 to 10):");
        double val1 = scanner.nextDouble();
        System.out.print("Homework points(0 to 60):");
        double val2 = scanner.nextDouble();
        System.out.print("Exam points(0 to 30):");
        double val3 = scanner.nextDouble();

        double total = val1 + val2 + val3;

        if (val1 > 10) {
            check = false;
            System.out.println("Max attendance points is 10!");
        }
        if (val2 > 60) {
            check = false;
            System.out.println("Max Homework points is 60!");
        }
        if (val3 > 30) {
            check = false;
            System.out.println("Max Exam points is 30!");
        }
        if (total >= 65 && val1 >= 6 && val3 >= 17 && check) {
            System.out.println("Total is " + total + "!");
            System.out.println("Pass! Congrats!");
        } else if (check) {
            System.out.println("Total is " + total + "!");
            System.out.println("Fail! Congrats!");
        }
    }

    public static void LoanApprovalSystem(Scanner scanner) {
            System.out.println("----- Loan Approval System -----");
            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Monthly income: ");
            double income = scanner.nextDouble();

            System.out.print("Credit score (0-100): ");
            int creditScore = scanner.nextInt();

            System.out.print("Years at current job: ");
            int yearsAtJob = scanner.nextInt();

            System.out.print("Existing debt (true/false): ");
            boolean hasDebt = scanner.nextBoolean();

            boolean isAgeValid = age >= 21 && age <= 65;
            boolean isIncomeValid = income >= 30000;
            boolean isCreditScoreValid = creditScore >= 70;
            boolean isJobOrDebtValid = yearsAtJob >= 2 || !hasDebt;

            boolean isApproved = isAgeValid && isIncomeValid && isCreditScoreValid && isJobOrDebtValid;

            System.out.println("\n----- RESULTS -----");
            System.out.println("Age requirement: " + (isAgeValid ? "✅" : "❌"));
            System.out.println("Income requirement: " + (isIncomeValid ? "✅" : "❌"));
            System.out.println("Credit score requirement: " + (isCreditScoreValid ? "✅" : "❌"));
            System.out.println("Job/Debt requirement: " + (isJobOrDebtValid ? "✅" : "❌"));
            // новый оператор "?" & ":", он аналог if else. If "s" == True Else "dd"

            if (isApproved) {
                System.out.println("Result: Loan Approved ✅");
            } else {
                System.out.println("Result: Loan Rejected ❌");
            }
    }

    public static void runDiscountCalculator(Scanner scanner) {
            System.out.println("----- ONLINE STORE DISCOUNT CALCULATOR -----");

            System.out.print("Total purchase amount: ");
            double originalPrice = scanner.nextDouble();

            System.out.print("Is premium member (true/false): ");
            boolean isPremium = scanner.nextBoolean();
            System.out.print("Number of previous orders: ");
            int previousOrders = scanner.nextInt();
            System.out.print("Has discount coupon (true/false): ");
            boolean hasCoupon = scanner.nextBoolean();
            System.out.print("Is birthday month (true/false): ");
            boolean isBirthday = scanner.nextBoolean();

            int discountPercent = 0;
            if (originalPrice < 20) {
                discountPercent = 0;
            }
            // Скидка 20%
            else if (originalPrice >= 200 && isPremium && (hasCoupon || isBirthday)) {
                discountPercent = 20;
            }
            // Скидка 15%
            else if (originalPrice >= 150 && (isPremium || previousOrders >= 10)) {
                discountPercent = 15;
            }
            // Скидка 10%
            else if (originalPrice >= 100 && hasCoupon) {
                discountPercent = 10;
            }
            else {
                discountPercent = 0;
            }

            double discountAmount = originalPrice * (discountPercent / 100.0);
            double finalPrice = originalPrice - discountAmount;

            System.out.println("\n----- RECEIPT -----");
            System.out.println("Original price: $" + originalPrice);
            System.out.println("Discount: " + discountPercent + "%");
            System.out.println("Discount amount: $" + discountAmount);
            System.out.println("Final price: $" + finalPrice);
        }
}


