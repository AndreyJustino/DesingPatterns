package strategy;

public class Strategy {
    public interface DiscountStrategy{ // estrategia generica
        double applyDiscount(double price);
    }

    //estrategia concreta: sem desconto
    public static class NoDiscount implements DiscountStrategy{

        @Override
        public double applyDiscount(double price) {
            return price;
        }
    }

    //estrategia concreta: desconto fixo
    public static class FixedDiscount implements DiscountStrategy{

        private double discount;

        public FixedDiscount(double discount) {
            this.discount = discount;
        }

        @Override
        public double applyDiscount(double price) {
            return price - discount;
        }
    }

    //estrategia concreta: desconto por porcentagem
    static class PercentageDiscount implements DiscountStrategy{

        private double percentage;

        public PercentageDiscount(double percentage){
            this.percentage = percentage;
        }

        @Override
        public double applyDiscount(double price) {
            return price * (percentage / 100);
        }
    }

    public static class ProductContext{
        private DiscountStrategy strategy;

        public ProductContext(DiscountStrategy strategy){
            this.strategy = strategy;
        }

        public double check(double price){
            return this.strategy.applyDiscount(price);
        }
    }

    public static void main(String[] args) {
        double price = 50.0;

        ProductContext noDiscount = new ProductContext(new NoDiscount());// return 50
        ProductContext fixedDiscount = new ProductContext(new FixedDiscount(10.5));// return 39.5
        ProductContext percentageDiscount = new ProductContext(new PercentageDiscount(50));// return 25

        System.out.println("No discount: " + noDiscount.check(price));
        System.out.println("Fixed discount: " + fixedDiscount.check(price));
        System.out.println("Percentage discount: " + percentageDiscount.check(price));
    }

}
