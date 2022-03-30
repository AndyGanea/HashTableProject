public class PTE extends EmployeeInfo {
    
    double hourlyWage;
    double hoursPerWeek;
    double weeksPerYear;

    public PTE(int empNumber, String firstName, String lastName, double deductionsRate, double hourlyWage, double hoursPerWeek, double weeksPerYear) {
        super(empNumber, firstName, lastName, deductionsRate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
        this.weeksPerYear = weeksPerYear;
    }

    public double calcAnnualGrossIncome() {
        return (hourlyWage * hoursPerWeek * weeksPerYear);
    }

    public double calcAnnualNetIncome() {
        return (hourlyWage * hoursPerWeek * weeksPerYear)*(1 - deductionsRate);
    }
}
