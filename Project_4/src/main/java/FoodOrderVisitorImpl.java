/**
 * Created by louie on 4/22/2017.
 */
public class FoodOrderVisitorImpl implements FoodOrderVisitor{
    @Override
    public double visit(Taco taco) {
        double cost = taco.getPrice();
        System.out.println("Tacos: " + taco.getStyle() + ", cost = $" + cost);
        return cost;
    }
    @Override
    public double visit(Burrito burrito) {
        double cost = burrito.getPrice();
        System.out.println("Burrito: " + burrito.getStyle() + ", cost = $" + cost);
        return cost;
    }
    @Override
    public double visit(Beverage beverage) {
        double cost = beverage.getPrice();
        System.out.println(beverage.getSize()+" Beverage: " + beverage.getType() + ", cost = $" + cost);
        return cost;
    }
}
