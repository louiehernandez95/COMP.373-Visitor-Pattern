/**
 * Created by louie on 4/23/2017.
 */
public class Entree implements Food_Item{
    private String type;
    private double price;

    public Entree(String type, double price) {
        this.type = type;
        this.price = price;
    }
    public String getType(){
        return type;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public double accept(FoodOrderVisitor visitor) {
        return visitor.visit(this);
    }
}
