package taxes;

public class UsnIncomeMinusExpenses extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int difference = debit - credit;
        return Math.max(difference * 15 / 100, 0);
    }
}
