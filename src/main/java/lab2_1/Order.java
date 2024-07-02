package lab2_1;

import java.time.LocalDateTime;
import java.util.Objects;

public class Order {
    private int order_id;
    private LocalDateTime order_date;

    public Order(int order_id, LocalDateTime order_date, String client_full_name, String client_contact_number, String client_email, String shipment_address, DeliveryStatus delivery_status) {
        this.order_id = order_id;
        this.order_date = order_date;
        this.client_full_name = client_full_name;
        this.client_contact_number = client_contact_number;
        this.client_email = client_email;
        this.shipment_address = shipment_address;
        this.delivery_status = delivery_status;
    }

    private String client_full_name;
    private String client_contact_number;
    private String client_email;

    private String shipment_address;
    private DeliveryStatus delivery_status;
    private LocalDateTime shipment_delivary_date;
    public Order(){

    }


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public LocalDateTime getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDateTime order_date) {
        this.order_date = order_date;
    }

    public String getClient_full_name() {
        return client_full_name;
    }

    public void setClient_full_name(String client_full_name) {
        this.client_full_name = client_full_name;
    }

    public String getClient_contact_number() {
        return client_contact_number;
    }

    public void setClient_contact_number(String client_contact_number) {
        this.client_contact_number = client_contact_number;
    }

    public String getClient_email() {
        return client_email;
    }

    public void setClient_email(String client_email) {
        this.client_email = client_email;
    }

    public String getShipment_address() {
        return shipment_address;
    }

    public void setShipment_address(String shipment_address) {
        this.shipment_address = shipment_address;
    }

    public DeliveryStatus getOrderStatus() {
        return delivery_status;
    }

    public void setOrderStatus(DeliveryStatus deliveryStatus) {
        this.delivery_status = deliveryStatus;
    }

    public LocalDateTime getShipment_delivary_date() {
        return shipment_delivary_date;
    }

    public void setShipment_delivary_date(LocalDateTime shipment_delivary_date) {
        this.shipment_delivary_date = shipment_delivary_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return order_id == order.order_id && Objects.equals(order_date, order.order_date) && Objects.equals(client_full_name, order.client_full_name) && Objects.equals(client_contact_number, order.client_contact_number) && Objects.equals(client_email, order.client_email) && Objects.equals(shipment_address, order.shipment_address) && delivery_status == order.delivery_status && Objects.equals(shipment_delivary_date, order.shipment_delivary_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order_id, order_date, client_full_name, client_contact_number, client_email, shipment_address, delivery_status, shipment_delivary_date);
    }

    @Override
    public String toString() {
        return "Orders{" +
                "order_id=" + order_id +
                ", order_date=" + order_date +
                ", client_full_name='" + client_full_name + '\'' +
                ", client_contact_number='" + client_contact_number + '\'' +
                ", client_email='" + client_email + '\'' +
                ", shipment_address='" + shipment_address + '\'' +
                ", orderStatus=" + delivery_status +
                ", shipment_delivary_date=" + shipment_delivary_date +
                '}';
    }
}
