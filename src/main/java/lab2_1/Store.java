package lab2_1;

import java.util.Objects;

public class Store {
    private String article_id;
    private String product_name;

    private String product_color;
    private int prodcut_price;
    private int product_left;

    public Store(){

    }
    public Store(String article_id, String product_name, String product_color, int prodcut_price, int product_left) {
        this.article_id = article_id;
        this.product_name = product_name;
        this.product_color = product_color;
        this.prodcut_price = prodcut_price;
        this.product_left = product_left;
    }

    public Store(String articleId, String productName) {
        this.article_id = articleId;
        this.product_name = productName;
    }

    public String getArticle_id() {
        return article_id;
    }

    public void setArticle_id(String article_id) {
        this.article_id = article_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_color() {
        return product_color;
    }

    public void setProduct_color(String product_color) {
        this.product_color = product_color;
    }

    public int getProdcut_price() {
        return prodcut_price;
    }

    public void setProdcut_price(int prodcut_price) {
        this.prodcut_price = prodcut_price;
    }

    public int getProduct_left() {
        return product_left;
    }

    public void setProduct_left(int product_left) {
        this.product_left = product_left;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return prodcut_price == store.prodcut_price && product_left == store.product_left && Objects.equals(article_id, store.article_id) && Objects.equals(product_name, store.product_name) && Objects.equals(product_color, store.product_color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(article_id, product_name, product_color, prodcut_price, product_left);
    }

    @Override
    public String toString() {
        return "Store{" +
                "article_id='" + article_id + '\'' +
                ", product_name='" + product_name + '\'' +
                ", product_color='" + product_color + '\'' +
                ", prodcut_price=" + prodcut_price +
                ", product_left=" + product_left +
                '}';
    }
}
