package lab2_1;

public enum DeliveryStatus {

    P("Готовится"),
    S("«Отгружен»"),
    C("«Отменён»");
    private String deliverStatus;

    DeliveryStatus(String s) {
        deliverStatus = s;
    }

    public String getDeliverStatus() {
        return deliverStatus;
    }

}
