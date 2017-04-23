/**
 * Created by louie on 4/23/2017.
 */
public class Appetizer implements Food_Item{
    private String type;
    private String style;
    private double price;

    public Appetizer(String type, String style, double price) {
        this.type = type;
        this.style = style;
        this.price = price;
    }
    public String getType(){
        return type;
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
