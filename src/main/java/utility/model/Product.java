package utility.model;

import lombok.Getter;

@Getter
public class Product {

    private String name;
    private double price;

    public Product(){
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
