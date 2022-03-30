public class FTE extends EmployeeInfo {
    
    double yearlySalary;

    public FTE(int empNumber, String firstName, String lastName, double deductionsRate, double empYearlySalary) {
        super(empNumber, firstName, lastName, deductionsRate);
        this.yearlySalary = empYearlySalary;
    }

    public double calcAnnualGrossIncome() {
        return yearlySalary;
    }

    public double calcAnnualNetIncome() {
        return yearlySalary*(1 - deductionsRate);
    }
}
