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

        public void setProductContext(DiscountStrategy strategy){
            this.strategy = strategy;
        }

        public double check(double price){
            return this.strategy.applyDiscount(price);
        }
    }

    public static void main(String[] args) {
        double price = 50.0;

        ProductContext context = new ProductContext();

        context.setProductContext(new NoDiscount());
        System.out.println("No discount: " + context.check(price)); // return 50

        context.setProductContext(new FixedDiscount(10.5));
        System.out.println("Fixed discount: " + context.check(price)); // return 39.5

        context.setProductContext(new PercentageDiscount(50));
        System.out.println("Percentage discount: " + context.check(price)); // return 25

    }

}
