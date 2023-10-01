import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        System.out.print("What's the tip in percentage? (0-100): ");
        int tipPercentage = scan.nextInt();
        int numOfItems = 0;

        double price = 0;
        double totalPrice = 0;
        int x = 0;
        int y = 0;
        String[] foods = new String[100];

        // Ask for prices and items
        while (price != -1.0) {
            totalPrice += price;
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            price = scan.nextDouble();
            scan.nextLine();
            if (price != -1) {
                System.out.print("Enter the item: ");
                String item = scan.nextLine();
                foods[x] = item;
                x++;
                numOfItems = x;
            }
        }

        // Print bill
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
        System.out.println("-----------------------------");
        System.out.println("Items ordered: ");

        // Print items in list
        for(int i = 0; i < numOfItems; i++) {
            System.out.println(foods[y]);
            y++;
        }

    }
}
