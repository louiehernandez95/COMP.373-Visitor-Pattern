/**
 * Created by louie on 4/22/2017.
 */
public class Beverage implements Food_Item{
    private String type;
    private double price;
    private String size;

    public Beverage(String type, double price, String size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }
    public double getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }
    public String getSize() {
        return size;
    }
    @Override
    public double accept(FoodOrderVisitor visitor) {
        return visitor.visit(this);
    }
}
