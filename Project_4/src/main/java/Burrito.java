/**
 * Created by louie on 4/22/2017.
 */
public class Burrito implements Food_Item{
    private String style;
    private double price;

    public Burrito(String style, double price) {
        this.style = style;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String getStyle() {
        return style;
    }
    @Override
    public double accept(FoodOrderVisitor visitor) {
        return visitor.visit(this);
    }
}
