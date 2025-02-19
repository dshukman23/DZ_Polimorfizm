import taxes.UsnIncome;
import taxes.UsnIncomeMinusExpenses;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Сапфир", new UsnIncome());


        company.shiftMoney(2000);
        company.shiftMoney(4000);
        company.shiftMoney(-5000);
        company.shiftMoney(1400);
        company.payTaxes();

        company.setTaxSystem(new UsnIncomeMinusExpenses());
        company.shiftMoney(2000);
        company.shiftMoney(4000);
        company.shiftMoney(-5000);
        company.shiftMoney(1400);
        company.payTaxes();
    }
}
