package discount;

import model.Budget;

public interface Discount {

    double discount(Budget budget);
    void setNext(Discount next);
}
