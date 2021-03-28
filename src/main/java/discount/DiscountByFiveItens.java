package discount;

import model.Budget;

public class DiscountByFiveItens implements Discount{

    private Discount next;

    @Override
    public double discount(Budget budget) {
        if(budget.getItens().size() > 5) {
            return budget.getValue() * 0.1;
        } else {
            return next.discount(budget);
        }
    }

    @Override
    public void setNext(Discount next) {
        this.next = next;
    }
}
