import java.util.Scanner;

public class ArrHomework {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Task 1. Replace Negative Numbers with Zero");
        int[] array = new int[] {5, -3, 8, -1, 0, 12, -7, 4, 9, -2};
        int replacement = 0;
        System.out.print("Original: ");
        for (int row = 0; row < array.length; row++) {
            System.out.print(array[row] + " | ");
            if (array[row] < 0){
               array[row] = 0;
               replacement += 1;
            }
        }
        System.out.println();
        System.out.print("Modified: ");
        for (int row = 0; row < array.length; row++) {
            System.out.print(array[row] + " | ");
        }
        System.out.println();
        System.out.println("Replacement: " + replacement);
        System.out.println();

        System.out.println("Task 2. Second Largest Distinct Number");
        int[] array2 = new int[6];
        for (int row = 0; row < array2.length; row++) { // добавляем числа
            System.out.print("Enter number " + (row + 1) + ": ");
            array2[row] = scanner.nextInt();
        }

            int firstLargest = array2[0];// макс число
            for (int row = 1; row < array2.length; row++) {
                if (array2[row] > firstLargest) {
                    firstLargest = array2[row];
                }
            }
            boolean hasSecond = false; //Есть ли второе число вообще (для защиты от отрицательных чисел)
            int secondLargest = 0;
            for (int row = 0; row < array2.length; row++) { // переборка массива на поиск второго числа
                if (array2[row] != firstLargest) { //
                    if (!hasSecond || array2[row] > secondLargest) {
                        secondLargest = array2[row];
                        hasSecond = true;
                    }
                }
            }
            if (hasSecond) {
                System.out.println("Largest: " + firstLargest +"\n"+ "Second Largest: " + secondLargest);
            } else {
                System.out.println("No second largest distinct number.");
            }

        System.out.println();
        System.out.println("Task 3. Remove an Element by Index");
        scanner = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Original: ");
        for (int row = 0; row < numbers.length; row++) {
            System.out.print(numbers[row] + " ");
        }
        System.out.println();

        System.out.print("Enter index to remove: ");
        int removeIndex = scanner.nextInt();

        // проверка правильно ли введенного индекса
        if (removeIndex < 0 || removeIndex >= numbers.length) {
            System.out.println("Invalid index!");
        } else {
            // сдвигаем элементы влево, начиная с удаляемого индекса
            for (int row = removeIndex; row < numbers.length - 1; row++) {
                numbers[row] = numbers[row + 1];
            }

            System.out.print("Updated: ");
            // ыыводим массив без сдвинутого элемента
            for (int row = 0; row < numbers.length - 1; row++) {
                System.out.print(numbers[row] + " ");
            }
            System.out.println();
        }

        System.out.println("Task 4. Find Duplicate Numbers");
        scanner = new Scanner(System.in);

        int[] array4 = new int[10];
        for (int row = 0; row < array4.length; row++) {
            System.out.print("Enter number " + (row + 1) + ": ");
            array4[row] = scanner.nextInt();
        }

        System.out.print("Array: ");
        for (int row = 0; row < array4.length; row++) {
            System.out.print(array4[row] + " ");
        }
        System.out.println();

        boolean hasDuplicates = false;
        String duplicatesList = "";

        for (int row = 0; row < array4.length; row++) {
            // былл ли число раньше в массиве
            boolean alreadyProcessed = false;
            for (int prev = 0; prev < row; prev++) {
                if (array4[prev] == array4[row]) {
                    alreadyProcessed = true;
                    break;
                }
            }

            // проверяем, есть ли дубликат дальше
            if (!alreadyProcessed) {
                for (int next = row + 1; next < array4.length; next++) {
                    if (array4[row] == array4[next]) {
                        duplicatesList += array4[row] + " ";
                        hasDuplicates = true;
                        break;
                    }
                }
            }
        }

        if (hasDuplicates) {
            System.out.println("Duplicate numbers: " + duplicatesList);
        } else {
            System.out.println("No duplicate numbers found.");
        }
    }
}