/**
 * Created by louie on 4/22/2017.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("           YOUR ORDER           \n________________________________");
        Food_Item[] order = new Food_Item[]{new Taco("Carne Asada", 5.99),
                new Taco("Barbacoa", 6.49),
                new Burrito("Al Pastor", 6.99),
                new Beverage("Horchata", 2.99,"Large")};
        double orderTotal = findOrderTotal(order);
        double SalesTax= 1.1025;
        double totalAfterTax = orderTotal*SalesTax;
        String s = String.format("%.2f", totalAfterTax);
        System.out.println("Total Cost = $" +s);
    }

    private static double findOrderTotal(Food_Item[] items) {
        FoodOrderVisitor visitor = new FoodOrderVisitorImpl();
        double total = 0;
        for(Food_Item item : items) {
            total += item.accept(visitor);
        }
        return total;
    }
}

