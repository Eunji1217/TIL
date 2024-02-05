package Interface02;

import java.math.BigDecimal;

public class Product implements Promotion{
    private String name;
    private BigDecimal price;
    private Double weight;
    private BigDecimal discountPrice;

    public Product(String name, BigDecimal price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.discountPrice = BigDecimal.valueOf(0);
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

    public void setDiscountPrice(BigDecimal discountPrice){
        discountPrice = this.discountPrice;
    }
    @Override
    public BigDecimal getDiscountAmount(){
        return this.discountPrice;
    }
}
