import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Grocery pizza = new Grocery("Pizza",new BigDecimal("8000"),0.5);
        Beauty eyeLiner = new Beauty("EyeLiner",new BigDecimal("40000"),0.2);
        LargeAppliance tv = new LargeAppliance("TV",new BigDecimal("220000"),20.0);

        System.out.println(pizza.getName()+"의 배달비 : "+pizza.getDeliveryCharge()+"원");
        System.out.println(eyeLiner.getName()+"의 배달비 : "+eyeLiner.getDeliveryCharge()+"원");
        System.out.println(tv.getName()+"의 배달비 : "+tv.getDeliveryCharge()+"원");
    }
}