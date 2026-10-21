package labs;
import java.util.Scanner;

public class SimpleStore {
    public static void Store(Scanner scanner){
        int currTot = 0, cost = 0, mou = 0, key = 0, head = 0, lap = 0;
        boolean loop = true;
        while (loop) {
            System.out.print("""
                    ===== SIMPLE STORE =====
                    1. Mouse - $20
                    2. Keyboard - $40
                    3. Headphones - $50
                    4. Laptop Stand - $30
                    5. Checkout
                    Choose a product:\s""");
            int product = scanner.nextInt();
            if (product <=0 || product > 5) {
                System.out.println("Invalid option.\nPlease choose a number from 1 to 5.\n");
                scanner.next();
                continue;
            }
            System.out.println();
            if (product == 5) {
                loop = false;
                break;
            }
            String chooseSelect = "";
            switch (product) {
                case 1:
                    chooseSelect = "Mouse";
                    cost = 20;
                    break;
                case 2:
                    chooseSelect = "Keyboard";
                    cost = 40;
                    break;
                case 3:
                    chooseSelect = "Headphones";
                    cost = 50;
                    break;
                case 4:
                    chooseSelect = "Laptop Stand";
                    cost = 30;
                    break;
                default:
                    System.out.println("""
                            Invalid option.
                            Please choose a number from 1 to 5.
                            """);
                    continue;
            }

            System.out.println("You selected: " + chooseSelect);
            System.out.println("Price: $" + cost);

            int quality = 0;
            while (true) {
                System.out.print("Enter quantity: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid quantity.\nQuantity must be greater than 0.");
                    scanner.next();
                    continue;
                }
                quality = scanner.nextInt();
                if (quality > 0) {
                    break;
                } else {
                    System.out.println("""
                            Invalid quantity.
                            Quantity must be greater than 0.""");
                }
            }

            int itemTotal = cost * quality;
            if (quality >= 5) {
                itemTotal = (int) (itemTotal * 0.95);
                System.out.println("Applied 5% bulk discount!");
            }

            currTot += itemTotal;

            if (product == 1) mou += quality;
            else if (product == 2) key += quality;
            else if (product == 3) head += quality;
            else if (product == 4) lap += quality;

            System.out.println("\n" + quality + " * $" + cost + " = $" + itemTotal);
            System.out.println("Added to cart!\nCurrent total: $" + currTot + "\n");
        }

        System.out.println("===== CHECKOUT =====");
        int totalItems = mou + key + head + lap;
        System.out.println("Items purchased: " + totalItems);
        System.out.println("Subtotal: $" + currTot);

        double discountRate = 0.0;
        if (currTot >= 100 && currTot <= 199) {
            discountRate = 0.10;
            System.out.println("You received a 10% discount!");
        } else if (currTot >= 200) {
            discountRate = 0.15;
            System.out.println("You received a 15% discount!");
        } else {
            System.out.println("Discount: $0");
        }

        double discountAmount = currTot * discountRate;
        if (discountRate > 0) {
            System.out.println("Discount: $" + discountAmount);
        }

        double finalTotal = currTot - discountAmount;
        System.out.println("Final total: $" + finalTotal);

        if (totalItems >= 10) {
            System.out.println("You earned a $10 coupon for your next visit!");
        }

        double payment = 0;
        while (true) {
            System.out.print("Enter payment amount: $");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid payment amount.");
                scanner.next();
                continue;
            }
            payment = scanner.nextDouble();

            if (payment >= finalTotal) {
                System.out.println("Payment successful!");
                break;
            } else {
                double needed = finalTotal - payment;
                System.out.println("Insufficient payment.");
                System.out.println("You still need to pay: $" + needed);
            }
        }

        double change = payment - finalTotal;

        // БОНУС 3: Вывод купленных продуктов
        System.out.println("\n===== ITEMS PURCHASED =====");
        System.out.println("Mouse: " + mou);
        System.out.println("Keyboard: " + key);
        System.out.println("Headphones: " + head);
        System.out.println("Laptop Stand: " + lap);

        // БОНУС 4: Самый покупаемый товар
        String mostPurchased = "Mouse";
        int maxQty = mou;

        if (key > maxQty) {
            maxQty = key;
            mostPurchased = "Keyboard";
        }
        if (head > maxQty) {
            maxQty = head;
            mostPurchased = "Headphones";
        }
        if (lap > maxQty) {
            maxQty = lap;
            mostPurchased = "Laptop Stand";
        }

        System.out.println("Most purchased product: " + mostPurchased);
        System.out.println("Quantity: " + maxQty);

        System.out.println("\n=========================");
        System.out.println("SIMPLE STORE");
        System.out.println("=========================");
        System.out.println("Items purchased: " + totalItems);
        System.out.println("Subtotal:\n$" + currTot);
        System.out.println("Discount:\n$" + discountAmount);
        System.out.println("Final total:\n$" + finalTotal);
        System.out.println("Payment:\n$" + payment);
        System.out.println("Change:\n$" + change);
        System.out.println("=========================");
        System.out.println("Thank you for shopping!");
    }
}
