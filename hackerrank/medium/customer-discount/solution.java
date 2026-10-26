
import java.util.*;
class Customer {
    String customerName;
    int purchaseAmount;

    double calculateDiscount() {
        return purchaseAmount * 0.05;
    }
}
class PremiumCustomer extends Customer {
    @Override
    double calculateDiscount() {
        return purchaseAmount * 0.15;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        String name = sc.nextLine();
        int amount = sc.nextInt();
        if ((!type.equals("Regular") && !type.equals("Premium"))
                || amount < 1 || amount > 100000) {
            System.out.println("Invalid Input");
            return;
        }
        Customer c;
        if (type.equals("Regular")) {
            c = new Customer();
        } else {
            c = new PremiumCustomer();
        }
        c.customerName = name;
        c.purchaseAmount = amount;
        int discount = (int) c.calculateDiscount();
        int finalAmount = amount - discount;

        System.out.println("Customer: " + name);
        System.out.println("Discount: " +  discount);
        System.out.println("Final Amount: " +  finalAmount);
    }
}
