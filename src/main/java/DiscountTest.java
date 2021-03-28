import discount.DiscountCalculator;
import model.Budget;
import model.Item;

public class DiscountTest {

    public static void main(String[] args) {
        DiscountCalculator discounts = new DiscountCalculator();

        Budget budget = new Budget(600.0);
        budget.addItens(new Item("CANETA", 250.0));
        budget.addItens(new Item("LAPIS", 250.0));

        double finalDiscount = discounts.calculate(budget);

        System.out.println(finalDiscount);
    }
}
