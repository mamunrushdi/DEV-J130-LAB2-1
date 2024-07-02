package lab2_1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderHandler {
    private static int ORDER_ID = 0;
    public static List<Order> orderList;
    public static List<OrderStatus> orderStatuses;

    static {
        orderList = new ArrayList<>();
        orderStatuses = new ArrayList<>();
    }


    public static void main(String[] args) {
        System.out.println("Before adding new order:\nTotal order items: " + orderList.size());
        System.out.println("Before adding new order:\nTotal order order status item: " + orderStatuses.size());

        OrderHandler orderHandler = new OrderHandler();
        orderHandler.registerOrder("Сергей Петров", "(921)001-22-33", "s.petrov@mail.com",
                "пр. Пархоменко 51-2-123", Arrays.asList("3251615", "3251617"), Arrays.asList(2, 3));

        System.out.println("Before adding new order:\nTotal order items: " + orderList.size());
        System.out.println("Before adding new order:\nTotal order order status item: " + orderStatuses.size());

    }

    private void registerOrder(String client_full_name, String client_contact_number,
                               String client_email, String shipment_address, List<String> productArticleNumbers,
                               List<Integer> amountOfEachProduct) {
        if (productArticleNumbers.size() != amountOfEachProduct.size()) {
            return;
        }
        for (int i = 0; i < productArticleNumbers.size(); i++) {
            String productArticle = productArticleNumbers.get(i);
            int price = StoreHandler.getPriceByProductId(productArticle);
            if (price == -1) {
                continue;
            }
            int amount = amountOfEachProduct.get(i);

            Order order = new Order(ORDER_ID, LocalDateTime.now(), client_full_name, client_contact_number, client_email, shipment_address, DeliveryStatus.P);
            orderList.add(order);

            OrderStatus orderStatus = new OrderStatus(ORDER_ID, productArticle, price, amount);
            orderStatuses.add(orderStatus);

            ORDER_ID++;
        }
    }
}
