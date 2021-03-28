package discount;

import model.Budget;

public class DiscountByFiveHundredReais implements Discount {

    private Discount next;

    @Override
    public double discount(Budget budget) {
        if(budget.getValue() > 500) {
            return budget.getValue() * 0.07;
        } else {
            return next.discount(budget);
        }
    }

    @Override
    public void setNext(Discount next) {
        this.next = next;
    }
}
