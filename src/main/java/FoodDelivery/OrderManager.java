package FoodDelivery;

import java.util.*;

public class OrderManager {

    List<Order> orderList = new ArrayList<>();

    public void placeOrder() {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        System.out.println("Enter the order id:");
        String id = sc.nextLine();
        order.setOrderId(id);

        order.setOrderStatus(Order.OrderStatus.PLACED);

        order.setPaymentStatus(Order.PaymentStatus.NOT_PAID);

        Customer customer = new Customer();
        System.out.println("Enter customer name:");
        String customerName = sc.nextLine();
        customer.setName(customerName);
        System.out.println("Enter customer number:");
        String customerNo = sc.nextLine();
        customer.setMobileNum(customerNo);
        System.out.println("Enter customer email:");
        String customerEmail = sc.nextLine();
        customer.setEmailId(customerEmail);
        System.out.println("Enter customer address:");
        String customerAddress = sc.nextLine();
        customer.setAddress(customerAddress);
        order.setCustomer(customer);

        String foodName = " ";
        Integer quantity = 0;
        while (!foodName.equalsIgnoreCase("STOP")) {
            System.out.println("Enter the food name:");
            sc.nextLine();
            foodName = sc.nextLine();
            sc.nextLine();
            if (!foodName.equalsIgnoreCase("STOP")) {
                System.out.println("Enter the food quantity:");
                quantity = sc.nextInt();
                order.setListOfFoodNames(foodName, quantity);
            }
        }

        orderList.add(order);
        System.out.println(orderList);

    }
}







