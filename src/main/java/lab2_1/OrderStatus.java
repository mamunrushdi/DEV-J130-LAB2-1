package lab2_1;

import java.util.Objects;

public class OrderStatus {
    private int order_id;
    private String  article_id;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;
    private int amount;

    public OrderStatus() {
    }

    public OrderStatus(int order_id, String article_id, int price, int amount) {
        this.order_id = order_id;
        this.article_id = article_id;
        this.price = price;
        this.amount = amount;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getArticle_id() {
        return article_id;
    }

    public void setArticle_id(String article_id) {
        this.article_id = article_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderStatus that = (OrderStatus) o;
        return order_id == that.order_id && article_id == that.article_id && price == that.price && amount == that.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(order_id, article_id, price, amount);
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "order_id=" + order_id +
                ", article_id=" + article_id +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
