/**
 * Created by louie on 4/22/2017.
 */
public interface FoodOrderVisitor {
    double visit(Taco taco);
    double visit(Burrito burrito);
    double visit(Beverage beverage);
}
