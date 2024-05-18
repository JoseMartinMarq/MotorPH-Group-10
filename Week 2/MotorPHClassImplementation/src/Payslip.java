import java.time.LocalDate;

public class Payslip {

    // Attributes

    private Employee employee;
    private LocalDate payPeriod;
    private int regularHoursWorked;
    private int overtimeHoursWorked;
    private Compensation compensation;
    private double grossIncome;
    private double totalBenefits;
    private double sssContribution;
    private double philhealthContribution;
    private double pagIbigContribution;
    private double totalGovernmentContributions;
    private double taxableIncome;
    private double withholdingTax;
    private double netIncome;

    public Payslip(Employee employee, LocalDate payPeriod, int regularHoursWorked, int overtimeHoursWorked) {
        this.employee = employee;
        this.payPeriod = payPeriod;
        this.regularHoursWorked = regularHoursWorked;
        this.overtimeHoursWorked = overtimeHoursWorked;
        this.compensation = employee.getCompensation();
        calculatePayslip();
    }

    // Getters and setters

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(LocalDate payPeriod) {
        this.payPeriod = payPeriod;
    }

    public int getRegularHoursWorked() {
        return regularHoursWorked;
    }

    public void setRegularHoursWorked(int regularHoursWorked) {
        this.regularHoursWorked = regularHoursWorked;
    }

    public int getOvertimeHoursWorked() {
        return overtimeHoursWorked;
    }

    public void setOvertimeHoursWorked(int overtimeHoursWorked) {
        this.overtimeHoursWorked = overtimeHoursWorked;
    }

    public Compensation getCompensation() {
        return compensation;
    }

    public void setCompensation(Compensation compensation) {
        this.compensation = compensation;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public double getTotalBenefits() {
        return totalBenefits;
    }

    public void setTotalBenefits(double totalBenefits) {
        this.totalBenefits = totalBenefits;
    }

    public double getSssContribution() {
        return sssContribution;
    }

    public void setSssContribution(double sssContribution) {
        this.sssContribution = sssContribution;
    }

    public double getPhilhealthContribution() {
        return philhealthContribution;
    }

    public void setPhilhealthContribution(double philhealthContribution) {
        this.philhealthContribution = philhealthContribution;
    }

    public double getPagIbigContribution() {
        return pagIbigContribution;
    }

    public void setPagIbigContribution(double pagIbigContribution) {
        this.pagIbigContribution = pagIbigContribution;
    }

    public double getTotalGovernmentContributions() {
        return totalGovernmentContributions;
    }

    public void setTotalGovernmentContributions(double totalGovernmentContributions) {
        this.totalGovernmentContributions = totalGovernmentContributions;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getWithholdingTax() {
        return withholdingTax;
    }

    public void setWithholdingTax(double withholdingTax) {
        this.withholdingTax = withholdingTax;
    }

    public double getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(double netIncome) {
        this.netIncome = netIncome;
    }

    // Other methods

    private void calculatePayslip() {
        calculateGrossIncome();
        calculateTotalBenefits();
        calculateGovernmentContributions();
        calculateTaxableIncome();
        calculateWithholdingTax();
        calculateNetIncome();
    }

    private void calculateGrossIncome() {
        this.grossIncome = (regularHoursWorked * compensation.getHourlyRate()) +
                (overtimeHoursWorked * compensation.getHourlyRate() * 1.25);
    }

    private void calculateTotalBenefits() {
        this.totalBenefits = compensation.getRiceSubsidy() + compensation.getPhoneAllowance() + compensation.getClothingAllowance();
    }

    private void calculateGovernmentContributions() {
        // Example logic for calculating contributions
        // this.sssContribution = logic to calculate SSS
        // this.philhealthContribution = logic to calculate PhilHealth
        // this.pagIbigContribution = logic to calculate Pag-Ibig
        this.totalGovernmentContributions = sssContribution + philhealthContribution + pagIbigContribution;
    }

    private void calculateTaxableIncome() {
        this.taxableIncome = grossIncome - totalGovernmentContributions;
    }

    private void calculateWithholdingTax() {
        // Example logic for calculating withholding tax
        // this.withholdingTax = logic to calculate withholding tax
    }

    private void calculateNetIncome() {
        this.netIncome = taxableIncome - withholdingTax;
    }
}
