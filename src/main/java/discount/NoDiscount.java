package discount;

import discount.Discount;
import model.Budget;

public class NoDiscount  implements Discount {

    @Override
    public double discount(Budget budget) {
        return 0;
    }

    @Override
    public void setNext(Discount next) {

    }
}
