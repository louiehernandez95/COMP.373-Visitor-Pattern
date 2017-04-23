/**
 * Created on 4/22/2017.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("           YOUR ORDER           \n________________________________");
        Food_Item[] order = new Food_Item[]{new Appetizer("Boneless Wings","BBQ", 5.99),
                new Appetizer("Salad","Caesar", 3.49),
                new Entree("Chicken Alfredo", 8.99),
                new Beverage("Horchata", 2.99,"Large")};
        double orderTotal = 0.00;
        FoodOrderVisitor visitor = new FoodOrderVisitorImpl();
        for(Food_Item item : order) {
            orderTotal += item.accept(visitor);
        }
        double SalesTax= 1.1025;
        double totalAfterTax = orderTotal*SalesTax;
        String s = String.format("%.2f", totalAfterTax);
        System.out.println("Total Cost = $" +s);
    }
}

