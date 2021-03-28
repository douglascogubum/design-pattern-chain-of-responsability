package discount;

import model.Budget;

public class DiscountCalculator {

    public double calculate(Budget budget) {

        Discount discount1 = new DiscountByFiveItens();
        Discount discount2 =  new DiscountByFiveHundredReais();
        Discount discount3 = new NoDiscount();

        discount1.setNext(discount2);
        discount2.setNext(discount3);

        return discount1.discount(budget);
    }
}
