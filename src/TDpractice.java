import java.util.Scanner;

public class TDpractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 1");
        int[][] task_1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Here is a matrix:");
        for (int row = 0; row < task_1.length; row++) { // Here is we choose the row
            System.out.print("|");
            for (int col = 0; col < task_1[row].length; col++) { // Here is we choose the col
                System.out.print(task_1[row][col] + " ");
            }
            System.out.println("|");
        } // Close loop

        System.out.println(); // пробел для красоты
        System.out.println("Task 2");
        int[][] task_2 = new int[][]{
                {5, 10, 15},
                {20, 25, 30}
        };
        System.out.println("Its matrix before Modify:");
        for (int row = 0; row < task_2.length; row++) {
            System.out.print("|");
            for (int col = 0; col < task_2[row].length; col++) {
                System.out.print(task_2[row][col] + " ");
            }
            System.out.println("|");
        } // Close loop
        System.out.println(); // пробел для красоты
        System.out.println("Its row 0 and col 1 now: " + task_2[0][1]);
        task_2[0][1] = 99;
        System.out.println("And it's row 0 and col 1 after modify: " + task_2[0][1]);
        System.out.println(); // пробел для красоты
        System.out.println("Its All Matrix after Modify:");
        for (int row = 0; row < task_2.length; row++) {
            System.out.print("|");
            for (int col = 0; col < task_2[row].length; col++) {
                System.out.print(task_2[row][col] + " ");
            }
            System.out.println("|");
        } // Close loop

        System.out.println(); // пробел для красоты
        System.out.println("Task 3");
        int[][] task_3 = new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        int sum_all_matrix = 0;
        System.out.println("There is a matrix:");
        for (int row = 0; row < task_3.length; row++) {
            System.out.print("|");
            for (int col = 0; col < task_3[row].length; col++) {
                sum_all_matrix += task_3[row][col];
                System.out.print(task_3[row][col] + " ");
            }
            System.out.println("|");
        } // Close loop
        System.out.println("Sum all variables in matrix = " + sum_all_matrix);

        System.out.println(); // пробел для красоты
        System.out.println("Task 4");
        int[][] task_4 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("There is a matrix:");
        for (int row = 0; row < task_4.length; row++) {
            System.out.print("|");
            for (int col = 0; col < task_4[row].length; col++) {
                if (task_4[row][col] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                System.out.print(task_4[row][col] + " ");
            }
            System.out.println("|");
        } // Loop
        System.out.println("In the matrix " + evenCount + " Even numbers");
        System.out.println("In the matrix " + oddCount + " Odd numbers");

        System.out.println(); // пробел для красоты
        System.out.println("Task 5");
        int[][] task_5 = new int[][]{
                {12, -4, 19, 7},
                {3, 25, -8, 11},
                {0, 14, 6, -2}
        };
        int minNum = task_5[0][0];
        int maxNum = task_5[0][0];
        System.out.println("There is a matrix:");
        for (int row = 0; row < task_5.length; row++) {
            System.out.print("|");
            for (int col = 0; col < task_5[row].length; col++) {
                if (task_5[row][col] < minNum) {
                    minNum = task_5[row][col];
                }
                if (task_5[row][col] > maxNum) {
                    maxNum = task_5[row][col];
                }
                System.out.print(task_5[row][col] + " ");
            }
            System.out.println("|");
        } // Loop
        System.out.println("Min num is " + minNum);
        System.out.println("Max num is " + maxNum);

        System.out.println(); // пробел для красоты
        System.out.println("Task 6");
        int[][] task_6 = new int[2][3];
        for (int row = 0; row < task_6.length; row++) {
            for (int col = 0; col < task_6[row].length; col++) {
                System.out.print("Enter value [" + row + "][" + col + "]: ");
                task_6[row][col] = scanner.nextInt();
            }
        }
        System.out.println("There is a matrix:");
        for (int row = 0; row < task_6.length; row++) {
            System.out.print("|");
            for (int col = 0; col < task_6[row].length; col++) {
                System.out.print(task_6[row][col] + " ");
            }
            System.out.println("|");
        } // Loop

        System.out.println(); // пробел для красоты
        System.out.println("Task 7");
        int[][] task_7 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("There is a matrix:");
        for (int row = 0; row < task_7.length; row++) {
            System.out.print("|");
            for (int col = 0; col < task_7[row].length; col++) {
                System.out.print(task_7[row][col] + " ");
            }
            System.out.println("|");
        } // Loop
        for (int col = 0; col < task_7[0].length; col++) {
            int col_sum = 0;
            for (int row = 0; row < task_7.length; row++) {
                col_sum += task_7[row][col];
            }
            System.out.println("Sum of col " + col + " = " + col_sum);
        } // Loop

        System.out.println(); // пробел для красоты
        System.out.println("Task 8");
        int[][] task_8 = new int[][]{
                {10, 25, 3},
                {40, 8, 19},
                {1, 50, 14}
        };
        System.out.print("Enter threshold number: ");
        int threshold_num = scanner.nextInt();
        int aboveCount = 0;
        System.out.println("There is a matrix:");
        for (int row = 0; row < task_8.length; row++) {
            System.out.print("|");
            for (int col = 0; col < task_8[row].length; col++) {
                if (task_8[row][col] > threshold_num) {
                    aboveCount++;
                }
                System.out.print(task_8[row][col] + " ");
            }
            System.out.println("|");
        } // Loop
        System.out.println("Values greater than " + threshold_num + ": " + aboveCount);

        System.out.println(); // пробел для красоты
        System.out.println("Task 9");
        int[][] task_9 = new int[][]{
                {4, 8, 15},
                {16, 23, 42},
                {7, 11, 19}
        };
        System.out.print("Enter number to find: ");
        int searchNum = scanner.nextInt();
        boolean isFound = false;
        for (int row = 0; row < task_9.length; row++) {
            for (int col = 0; col < task_9[row].length; col++) {
                if (task_9[row][col] == searchNum) {
                    System.out.println("Found at row " + row + " and col " + col);
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        } // Loop
        if (!isFound) {
            System.out.println("Not found");
        }

        System.out.println(); // пробел для красоты
        System.out.println("Task 10");
        int[][] task_10 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int diagSum = 0;
        System.out.print("Main diagonal: ");
        for (int row = 0; row < task_10.length; row++) {
            System.out.print(task_10[row][row] + " ");
            diagSum += task_10[row][row];
        } // Loop
        System.out.println();
        System.out.println("Main diagonal sum = " + diagSum);

        System.out.println(); // пробел для красоты
        System.out.println("Task 11");
        int[][] task_11 = new int[][]{
                {3, -5, 8},
                {-1, 0, -9},
                {6, 2, -4}
        };
        System.out.println("Before replace:");
        for (int row = 0; row < task_11.length; row++) {
            System.out.print("|");
            for (int col = 0; col < task_11[row].length; col++) {
                System.out.print(task_11[row][col] + " ");
            }
            System.out.println("|");
        } // Loop
        for (int row = 0; row < task_11.length; row++) {
            for (int col = 0; col < task_11[row].length; col++) {
                if (task_11[row][col] < 0) {
                    task_11[row][col] = 0;
                }
            }
        } // Loop
        System.out.println("After replace:");
        for (int row = 0; row < task_11.length; row++) {
            System.out.print("|");
            for (int col = 0; col < task_11[row].length; col++) {
                System.out.print(task_11[row][col] + " ");
            }
            System.out.println("|");
        } // Loop

        System.out.println(); // пробел для красоты
        System.out.println("Task 12");
        double[][] student_grades = new double[][]{
                {80.0, 85.0, 90.0, 85.0},
                {70.0, 75.0, 72.0, 79.0},
                {95.0, 92.0, 88.0, 97.0}
        };
        double classMax = student_grades[0][0];
        double totalSum = 0.0;
        int totalScoresCount = 0;
        for (int row = 0; row < student_grades.length; row++) {
            double studentSum = 0.0;
            for (int col = 0; col < student_grades[row].length; col++) {
                double score = student_grades[row][col];
                studentSum += score;
                totalSum += score;
                totalScoresCount++;
                if (score > classMax) {
                    classMax = score;
                }
            }
            double studentAvg = studentSum / student_grades[row].length;
            System.out.println("Student " + (row + 1) + " avg = " + studentAvg);
        } // Loop
        double overallAvg = totalSum / totalScoresCount;
        System.out.println("Class max = " + classMax);
        System.out.println("Overall avg = " + overallAvg);

        System.out.println(); // пробел для красоты
        System.out.println("Challenge A");
        int[][] challenge_a = new int[][]{
                {2, 5, 1, 9},
                {10, 12, 8, 4},
                {3, 7, 6, 2}
        };
        int bestRow = 0;
        int bestRowSum = 0;
        for (int col = 0; col < challenge_a[0].length; col++) {
            bestRowSum += challenge_a[0][col];
        }
        for (int row = 1; row < challenge_a.length; row++) {
            int currentRowSum = 0;
            for (int col = 0; col < challenge_a[row].length; col++) {
                currentRowSum += challenge_a[row][col];
            }
            if (currentRowSum > bestRowSum) {
                bestRowSum = currentRowSum;
                bestRow = row;
            }
        } // Loop
        System.out.println("Largest row sum is in row " + bestRow + " (" + bestRowSum + ")");

        System.out.println(); // пробел для красоты
        System.out.println("Challenge B");
        int[][] challenge_b = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] transposed = new int[challenge_b[0].length][challenge_b.length];
        for (int row = 0; row < challenge_b.length; row++) {
            for (int col = 0; col < challenge_b[row].length; col++) {
                transposed[col][row] = challenge_b[row][col];
            }
        } // Loop
        System.out.println("Transposed 3x2 matrix:");
        for (int row = 0; row < transposed.length; row++) {
            System.out.print("|");
            for (int col = 0; col < transposed[row].length; col++) {
                System.out.print(transposed[row][col] + " ");
            }
            System.out.println("|");
        } // Loop

        System.out.println(); // пробел для красоты
        System.out.println("Challenge C");
        int[][] mat_a = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] mat_b = new int[][]{
                {10, 20, 30},
                {40, 50, 60}
        };
        int[][] mat_sum = new int[2][3];
        for (int row = 0; row < mat_sum.length; row++) {
            for (int col = 0; col < mat_sum[row].length; col++) {
                mat_sum[row][col] = mat_a[row][col] + mat_b[row][col];
            }
        } // Loop
        System.out.println("Sum matrix:");
        for (int row = 0; row < mat_sum.length; row++) {
            System.out.print("|");
            for (int col = 0; col < mat_sum[row].length; col++) {
                System.out.print(mat_sum[row][col] + " ");
            }
            System.out.println("|");
        } // Loop
    } // main
} // class TDpractice
// подписывал много что, чтобы не путаться в "}" закрывабщих скобках