/**
 * Created by louie on 4/22/2017.
 */
public interface FoodOrderVisitor {
    double visit(Appetizer appetizer);
    double visit(Entree entree);
    double visit(Beverage beverage);
}
