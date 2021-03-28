package budget;

import model.Budget;

public class Iss implements Tax {

    @Override
    public double calculate(Budget budget) {
        return budget.getValue() * 0.06;
    }
}
