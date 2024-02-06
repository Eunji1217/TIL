package Interface01;

import java.math.BigDecimal;

public class Grocery extends Product implements DeliveryChargeCalculator {

    private BigDecimal deliveryCharge;

    public Grocery(String name, BigDecimal price, Double weight) {
        super(name, price, weight);
    }

    @Override
    public BigDecimal getDeliveryCharge() {
        Double weight = this.getWeight();
        BigDecimal price = this.getPrice();
        // 무게별 가격 측정
        if (weight < 3.0) {
            deliveryCharge = new BigDecimal("1000");
        } else if (weight < 10.0) {
            deliveryCharge = new BigDecimal("5000");
        } else {
            deliveryCharge = new BigDecimal("10000");
        }
        // 가격별 할인
        if(price.compareTo(new BigDecimal("30000")) >= 0&&price.compareTo(new BigDecimal("100000")) < 0) {
            deliveryCharge =  deliveryCharge.subtract(new BigDecimal("1000"));
        } else if(price.compareTo(new BigDecimal("100000")) >= 0){
            deliveryCharge = BigDecimal.ZERO;
        }
        return deliveryCharge;
    }
}
