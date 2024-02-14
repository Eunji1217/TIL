package Interface01;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;
    private Double weight;

    public Product(String name, BigDecimal price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public String getName(){
        return this.name;
    }
    public BigDecimal getPrice(){
        return this.price;
    }
    public Double getWeight(){
        return this.weight;
    }
}
