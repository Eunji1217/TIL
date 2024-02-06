package Interface02;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product beauty = new Beauty("beauty", BigDecimal.valueOf(30000), 2.0);
        Product grocery = new Grocery("grocery", BigDecimal.valueOf(20000), 3.0);
        Product largeAppliance = new LargeAppliance("largeAppliance", BigDecimal.valueOf(50000), 5.0);

        beauty.setDiscountPrice(BigDecimal.valueOf(2000));
        grocery.setDiscountPrice(BigDecimal.valueOf(10000));

        Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
        BigDecimal totalDeliveryCharge = cart.calculateDeliveryCharge();
        System.out.println(totalDeliveryCharge);    // 결과: 9000
    }
}