import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group: ");
        int people = scan.nextInt();
        System.out.println("What's the tip in percentage? (0-100): ");
        int tipPercentage = scan.nextInt();

        double price = 0;
        double totalPrice = 0;

        while (price != -1.0) {
            totalPrice += price;
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            price = scan.nextDouble();
        }

        System.out.println("Total bill before tip: $" + totalPrice);
        System.out.println(tipPercentage + "%");
        double totalTip = tipPercentage / 100 * totalPrice;
        System.out.println("Total tip: $" + totalTip);
        double totalBill = totalTip + totalPrice;
        System.out.println("Total bill with tip: $" + totalBill);
        System.out.println("Per person cost before tip: $" + (totalPrice / people));
        System.out.println("Tip per person: $" + (totalTip / people));
        System.out.println("Total cost per person: $" + (totalBill / people));

    }
}
