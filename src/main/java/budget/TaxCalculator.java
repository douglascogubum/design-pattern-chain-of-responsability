package budget;

import model.Budget;

public class TaxCalculator {

    public void makeCalc(Budget budget, Tax tax) {
        double icms = tax.calculate(budget);
        System.out.println(icms);
    }
}
