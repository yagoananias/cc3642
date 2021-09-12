package comissionemployee;

/**
 *
 * @author Yago
 */
public class BasePlusCommissionEmployee2 {

    private CommissionEmployee commissionEmployee; // composição
    private double baseSalary;

    public BasePlusCommissionEmployee2(String first, String last,
            String ssn, double sales, double rate, double salary) {
        commissionEmployee
                = new CommissionEmployee(first, last, ssn, sales, rate);
        setBaseSalary(salary);
    }
    
    public void setFirstName(String first) {
        commissionEmployee.setFirstName(first);
    }

    public String getFirstName() {
        return commissionEmployee.getFirstName();
    }
    
    public void setLastName(String last) {
        commissionEmployee.setLastName(last);
    }
    
    public String getLastName() {
        return commissionEmployee.getLastName();
    }

    public void setSocialSecurityNumber(String ssn) {
        commissionEmployee.setSocialSecurityNumber(ssn);
    }

    public String getSocialSecurityNumber() {
        return commissionEmployee.getSocialSecurityNumber();
    }

    public void setGrossSales(double sales) {
        commissionEmployee.setGrossSales(sales);
    }

    public double getGrossSales() {
        return commissionEmployee.getGrossSales();
    }

    public void setCommissionRate(double rate) {
        commissionEmployee.setCommissionRate(rate);
    }

    public double getCommissionRate() {
        return commissionEmployee.getCommissionRate();
    }

    public void setBaseSalary(double salary) {
        baseSalary = (salary < 0.0) ? 0.0 : salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return getBaseSalary() + commissionEmployee.earnings();
    }

    public String toString() {
        return String.format("%s %s\n%s: %.2f", "base-salaried",
                commissionEmployee.toString(), "base salary", getBaseSalary());
    }

}
