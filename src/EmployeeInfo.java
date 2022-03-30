public class EmployeeInfo {
    
    // Attributes
    public int empNumber;
    public String firstName;
    public String lastName;
    public double deductionsRate;

    // Constructor Declaration of Class
    public EmployeeInfo () {
        empNumber = 917387;
        firstName = "Andy";
        lastName = "Ganea";
    }
    public EmployeeInfo(int empNumber, String firstName, String lastName, double deductionsRate) {
        this.empNumber = empNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.deductionsRate = deductionsRate;
    }


}
