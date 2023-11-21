import utility.model.Product;
import utility.model.Stock;
import utility.singleton.Singleton;

public class Application {

    public static void main(String[] args) {

        Singleton.getInstance();
        Stock stock = new Stock();
        Product product = new Product();

        stock.add(product);

    }

}
