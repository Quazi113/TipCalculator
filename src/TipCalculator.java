import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Introduce calculator and ask for user inputs
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        System.out.print("What's the tip in percentage? (0-100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();
        System.out.print("Do you want to type in the meals you ate? (y/n): ");
        String billWithMeal = scan.nextLine();


        //declare variables used later
        double price = 0;
        double totalPrice = 0;
        int totalItems = 0;
        int itemNumber = 0;
        String[] foods = new String[100];

        // Ask for prices and items
        while (price != -1.0) {
            totalPrice += price;
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            price = scan.nextDouble();
            scan.nextLine();
            if (billWithMeal.equals("y")) {
                if (price != -1) {
                    System.out.print("Enter the item: ");
                    String item = scan.nextLine();
                    foods[totalItems] = item;
                    totalItems++;
                }
            }
        }

        // Prints bill
        System.out.println("-----------------------------");
        System.out.println("Total bill before tip: $" + totalPrice);
        System.out.println("Total percentage: " + tipPercentage + "%");
        double totalTip = tipPercentage / 100.0 * totalPrice;
        System.out.println("Total tip: $" + String.format("%.2f", totalTip));
        double totalBill = totalTip + totalPrice;
        System.out.println("Total bill with tip: $" + String.format("%.2f", totalBill));
        System.out.println("Per person cost before tip: $" + String.format("%.2f", (totalPrice / people)));
        System.out.println("Tip per person: $" + String.format("%.2f", (totalTip / people)));
        System.out.println("Total cost per person: $" + String.format("%.2f", (totalBill / people)));

        // Print items in order from the list
        for(int i = 0; i < totalItems; i++) {
            System.out.println("-----------------------------");
            System.out.println("Items ordered: ");
            System.out.println(foods[itemNumber]);
            itemNumber++;
        }
    }
}
