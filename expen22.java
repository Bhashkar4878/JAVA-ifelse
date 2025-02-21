
import java.util.*;
class expen22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();
        double total = quantity * price;
        if (quantity > 100) {
            total -= total * 0.1;
        }
        System.out.println("Total expenses: Rs. " + total);
    }
}
