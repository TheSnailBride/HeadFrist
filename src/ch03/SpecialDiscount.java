package ch03;

public class SpecialDiscount extends CondimentDecorator {
    public SpecialDiscount(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "10 % 할인 가격";
    }

    @Override
    public double cost() {
        return beverage.cost() * (0.9);
    }
}
