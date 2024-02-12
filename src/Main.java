//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of the item: $");
        double price = scanner.nextDouble();
        double shippingCost;
        if (price >= 100) {
            shippingCost = 0; }
        else { shippingCost = price * 0.02;}
        double totalPrice = price + shippingCost;
        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Total Price: $" + totalPrice);
        scanner.close();
    }
}