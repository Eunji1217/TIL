package Interface02;

import java.math.BigDecimal;

public class Cart {
    private Product[] products;
    private BigDecimal totalDeliveryCharge;
    private Double totalWeight= 0.0;
    private BigDecimal totalCalPrice;
    private BigDecimal totalPrice;
    private BigDecimal totalDicountPrice;

    public Cart(Product[] products) {
        this.products = products;
    }
    public Double getTotalWeight(){
     for(Product product : products){
        totalWeight += product.getWeight();
     }
     return totalWeight;
    }
    public BigDecimal getTotalPrice(){
        totalPrice=BigDecimal.valueOf(0);
        for(Product product : products){
            totalPrice = totalPrice.add(product.getPrice());
        }
        return totalPrice;
    }

    public BigDecimal getTotalDicountPrice() {
        totalDicountPrice=BigDecimal.valueOf(0);
        for(Product product : products){
            totalDicountPrice = totalDicountPrice.add(product.getDiscountAmount());
        }
        return totalDicountPrice;
    }

    public BigDecimal calculateDeliveryCharge() {
        totalWeight = this.getTotalWeight();
        totalCalPrice = this.getTotalPrice().subtract(this.getTotalDicountPrice());
        if (totalWeight < 3) {
            totalDeliveryCharge = BigDecimal.valueOf(1000);
        } else if (totalWeight < 10) {
            totalDeliveryCharge = BigDecimal.valueOf(5000);

        } else {
            totalDeliveryCharge = BigDecimal.valueOf(10000);
        }
        if (this.totalCalPrice.compareTo(BigDecimal.valueOf(30000)) < 1) {
            return totalDeliveryCharge;
        } else if (this.totalCalPrice.compareTo(BigDecimal.valueOf(100000)) < 1) {
            return totalDeliveryCharge.subtract(BigDecimal.valueOf(1000));
        } else{
            return BigDecimal.valueOf(0);
        }
    }

}
