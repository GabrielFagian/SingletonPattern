package utility.singleton;

import utility.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Singleton {

    private static Singleton uniqueInstance = null;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new Singleton();

        return uniqueInstance;
    }

    private List<Product> products = new ArrayList<Product>();

    public void add(Product product){
        products.add(product);
    }
}
