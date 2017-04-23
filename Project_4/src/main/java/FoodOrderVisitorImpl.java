/**
 * Created by louie on 4/22/2017.
 */
public class FoodOrderVisitorImpl implements FoodOrderVisitor{
    @Override
    public double visit(Appetizer appetizer) {
        double cost = appetizer.getPrice();
        System.out.println("Appetizer: " +appetizer.getStyle()+" "+ appetizer.getType()+", cost = $"+ cost);
        return cost;
    }
    @Override
    public double visit(Entree entree) {
        double cost = entree.getPrice();
        System.out.println("Main Entree: " + entree.getType() + ", cost = $" + cost);
        return cost;
    }
    @Override
    public double visit(Beverage beverage) {
        double cost = beverage.getPrice();
        System.out.println(beverage.getSize()+" Beverage: " + beverage.getType() + ", cost = $" + cost);
        return cost;
    }
}
