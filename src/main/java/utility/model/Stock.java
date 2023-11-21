package utility.model;

import utility.singleton.Singleton;


public class Stock {

    public Stock(){}

        public void add(Product product){
            Singleton.getInstance().add(product);
            product.setPrice(10.1);
            product.setPrice(20.2);
            product.setName("xyz");
            product.setName("abc");
            product.setName("último Sempre");
            System.out.println("O produto "+product.getName()+" custa R$ "+product.getPrice());
            System.out.println("O produto "+product.getName()+" custa R$ "+product.getPrice());
            System.out.println("O produto "+product.getName()+" custa R$ "+product.getPrice());

        }


}
