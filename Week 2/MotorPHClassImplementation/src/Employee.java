import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    // Attributes

    private int employeeNumber;
    private String lastName;
    private String firstName;
    private LocalDate birthday;
    private String address;
    private String phoneNumber;
    private String status;
    private String position;
    private String immediateSupervisor;
    private Compensation compensation;
    private GovernmentContributions governmentContributions;
    private List<Attendance> attendanceRecords;
    private List<Payslip> payslips;

    // Constructor

    public Employee(int employeeNumber, String lastName, String firstName, LocalDate birthday, String address,
                    String phoneNumber, String status, String position, String immediateSupervisor,
                    Compensation compensation, GovernmentContributions governmentContributions) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.position = position;
        this.immediateSupervisor = immediateSupervisor;
        this.compensation = compensation;
        this.governmentContributions = governmentContributions;
        this.attendanceRecords = new ArrayList<>();
        this.payslips = new ArrayList<>();
    }

    // Getters and setters

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getImmediateSupervisor() {
        return immediateSupervisor;
    }

    public void setImmediateSupervisor(String immediateSupervisor) {
        this.immediateSupervisor = immediateSupervisor;
    }

    public Compensation getCompensation() {
        return compensation;
    }

    public void setCompensation(Compensation compensation) {
        this.compensation = compensation;
    }

    public GovernmentContributions getGovernmentContributions() {
        return governmentContributions;
    }

    public void setGovernmentContributions(GovernmentContributions governmentContributions) {
        this.governmentContributions = governmentContributions;
    }

    public List<Attendance> getAttendanceRecords() {
        return attendanceRecords;
    }

    public void setAttendanceRecords(List<Attendance> attendanceRecords) {
        this.attendanceRecords = attendanceRecords;
    }

    public List<Payslip> getPayslips() {
        return payslips;
    }

    public void setPayslips(List<Payslip> payslips) {
        this.payslips = payslips;
    }

    // Other methods
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public void addAttendance(Attendance attendance) {
        attendanceRecords.add(attendance);
    }

    public void addPayslip(Payslip payslip) {
        payslips.add(payslip);
    }
}

