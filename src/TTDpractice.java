import java.util.Scanner;

public class TTDpractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 1");
        int[] task_1 = new int[]{4, 7, 9, 2, 5, 8, 1, 6};
        System.out.print("Even indices values: ");
        for (int row = 0; row < task_1.length; row += 2) {
            System.out.print(task_1[row] + " ");
        } // Loop
        System.out.println(); // пробел для красоты

        System.out.println(); // пробел для красоты
        System.out.println("Task 2");
        int[] task_2 = new int[]{3, -2, 0, 7, -4, 5, 2, -1, 8, 0};
        int positiveSum = 0;
        for (int row = 0; row < task_2.length; row++) {
            if (task_2[row] > 0) {
                positiveSum += task_2[row];
            }
        } // Loop
        System.out.println("Sum: " + positiveSum);

        System.out.println(); // пробел для красоты
        System.out.println("Task 3");
        int[] task_3 = new int[8];
        for (int row = 0; row < task_3.length; row++) {
            System.out.print("Enter number " + (row + 1) + ": ");
            task_3[row] = scanner.nextInt();
        } // Loop
        int rangeCount = 0;
        for (int row = 0; row < task_3.length; row++) {
            if (task_3[row] >= 10 && task_3[row] <= 20) {
                rangeCount++;
            }
        } // Loop
        System.out.println("Count: " + rangeCount);

        System.out.println(); // пробел для красоты
        System.out.println("Task 4");
        int[] task_4 = new int[]{8, 3, 5, 3, 9, 2, 6};
        int minVal = task_4[0];
        int minIndex = 0;
        for (int row = 1; row < task_4.length; row++) {
            if (task_4[row] < minVal) {
                minVal = task_4[row];
                minIndex = row;
            }
        } // Loop
        System.out.println("Min: " + minVal + ", index: " + minIndex);

        System.out.println(); // пробел для красоты
        System.out.println("Task 5");
        int[] task_5 = new int[]{1, 4, -2, 0, 8, 3};
        for (int row = 0; row < task_5.length; row++) {
            task_5[row] += 5;
        } // Loop
        System.out.print("Modified: ");
        for (int row = 0; row < task_5.length; row++) {
            System.out.print(task_5[row] + " ");
        } // Loop
        System.out.println(); // пробел для красоты

        System.out.println(); // пробел для красоты
        System.out.println("Task 6");
        int[] task_6 = new int[]{6, 9, 3, 8, 6, 10, 2, 7};
        int firstVal = task_6[0];
        int greaterCount = 0;
        for (int row = 1; row < task_6.length; row++) {
            if (task_6[row] > firstVal) {
                greaterCount++;
            }
        } // Loop
        System.out.println("Count: " + greaterCount);

        System.out.println(); // пробел для красоты
        System.out.println("Task 7");
        int[] task_7 = new int[]{3, 8, 5, 2, 7, 4, 9, 6};
        int[] evenCopy = new int[task_7.length];
        int copiedCount = 0;
        for (int row = 0; row < task_7.length; row++) {
            if (task_7[row] % 2 == 0) {
                evenCopy[copiedCount] = task_7[row];
                copiedCount++;
            }
        } // Loop
        System.out.print("Even numbers: ");
        for (int row = 0; row < copiedCount; row++) {
            System.out.print(evenCopy[row] + " ");
        } // Loop
        System.out.println(); // пробел для красоты

        System.out.println(); // пробел для красоты
        System.out.println("Task 8");
        int[] temps = new int[]{18, 20, 22, 19, 21, 24, 16};
        int tempSum = 0;
        for (int row = 0; row < temps.length; row++) {
            tempSum += temps[row];
        } // Loop
        double avgTemp = (double) tempSum / temps.length;
        int aboveAvgDays = 0;
        for (int row = 0; row < temps.length; row++) {
            if (temps[row] > avgTemp) {
                aboveAvgDays++;
            }
        } // Loop
        System.out.println("Average: " + avgTemp + "; above: " + aboveAvgDays);

        System.out.println(); // пробел для красоты
        System.out.println("Task 9");
        int[][] timetable = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
        for (int row = 0; row < timetable.length; row++) {
            System.out.print("|");
            for (int col = 0; col < timetable[row].length; col++) {
                System.out.print(timetable[row][col] + " ");
            }
            System.out.println("|");
        } // Loop

        System.out.println(); // пробел для красоты
        System.out.println("Task 10");
        int[][] matrix_10 = new int[][]{
                {0, 2, 3},
                {4, 0, 6},
                {0, 8, 0}
        };
        int zeroCount = 0;
        for (int row = 0; row < matrix_10.length; row++) {
            System.out.print("|");
            for (int col = 0; col < matrix_10[row].length; col++) {
                if (matrix_10[row][col] == 0) {
                    zeroCount++;
                }
                System.out.print(matrix_10[row][col] + " ");
            }
            System.out.println("|");
        } // Loop
        System.out.println("Zeros: " + zeroCount);
    } // main
} // class TTDpractice