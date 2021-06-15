package FoodDelivery;


import java.util.HashMap;
import java.util.Map;

public class Order {

    public enum OrderStatus {
        PLACED, DELIVERED;
    }

   public enum PaymentStatus{
        PAYED, NOT_PAID;
    }

    private String OrderId;
    private OrderStatus orderStatus;
    private PaymentStatus paymentStatus;
    private String totalAmount;
    private Map<String, Integer> listOfFoodNames = new HashMap<>();
    private Customer customer;

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getListOfFoodNames(String name) {
        return this.listOfFoodNames.get(name);
    }

//    public void setListOfFoodNames(Map<String, Integer> listOfFoodNames) {
//        this.listOfFoodNames = listOfFoodNames;
//    }
    public void setListOfFoodNames(String foodName, int quantity) {
    this.listOfFoodNames.put(foodName,quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderId='" + OrderId + '\'' +
                ", orderStatus=" + orderStatus +
                ", paymentStatus=" + paymentStatus +
                ", totalAmount='" + totalAmount + '\'' +
                ", listOfFoodNames=" + listOfFoodNames +
                ", customer=" + customer +
                '}';
    }
}
