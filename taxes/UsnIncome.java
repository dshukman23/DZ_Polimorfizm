package taxes;

public class UsnIncome extends TaxSystem {
    @Override
    public int calcTaxFor (int debit, int credit){
        return Math.max(debit * 6/100, 0);
    }
}
