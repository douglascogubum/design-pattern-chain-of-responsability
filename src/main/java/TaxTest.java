import budget.*;
import model.Budget;

public class TaxTest {

    public static void main(String[] args) {
        Tax iss = new Iss();
        Tax icms = new Icms();

        Budget budget = new Budget(500.0);

        TaxCalculator calculator = new TaxCalculator();

        calculator.makeCalc(budget, iss);
        calculator.makeCalc(budget,icms);
    }
}
