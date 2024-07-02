package lab2_1;

import java.util.Arrays;
import java.util.List;


public class StoreHandler {

    public static List<Store> storeDataList;

    static {
        storeDataList = createStoreData();
    }

    public static void main(String[] args) {
        printStoreData();
        printStoreItemByProductIds(Arrays.asList("3251615", "3251617"));
    }

    private static List<Store> createStoreData() {
        return Arrays.asList(
                new Store("3251615", "Стол кухонный", "белый", 8000, 12),
                new Store("3251616", "Стол кухонный", "коричневый", 8000, 15),
                new Store("3251617", "Стул столовый", "гусарский орех", 4000, 0),
                new Store("3251619", "Стул столовый с высокой спинкой", "белый", 3500, 37),
                new Store("3251620", "Стул столовый с высокой спинкой", "коричневый", 3500, 52)
        );
    }

    static void printStoreData() {
        storeDataList.forEach(System.out::println);
    }

    static void printStoreItemByProductIds(List<String> productIds) {
        for (Store store : storeDataList) {
            if (productIds.contains(store.getArticle_id())) {
                System.out.println(store.getProduct_name() + ", " + store.getProduct_color());
            }
        }
    }
    public static int getPriceByProductId(final String productId){
        for (Store store : storeDataList) {
            if (productId ==store.getArticle_id()) {
                return store.getProdcut_price();
            }
        }
        return -1;
    }

//    private void registerNewStoreData(String article_id, String product_name,
//                                      String product_color, int prodcut_price, int product_left) {
//        if (validStoreData(article_id, product_name)) {
//            Store newStore = new Store(article_id, product_name);
//            if (product_color != null) {
//                newStore.setProduct_color(product_color);
//            }
//            if (prodcut_price > 0) {
//                newStore.setProdcut_price(prodcut_price);
//            }
//
//            if (product_left >= 0) {
//                newStore.setProduct_left(product_left);
//            }
//
//            storeDataList.add(newStore);
//        }
//
//    }


    private static boolean validStoreData(String article_id, String product_name) {
        return article_id != null && !article_id.isEmpty() && article_id.length() != 7 &&
                product_name != null && !product_name.isEmpty();
    }
}
