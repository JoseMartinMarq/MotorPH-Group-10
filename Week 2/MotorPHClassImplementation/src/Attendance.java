import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

public class Attendance {

    // Attributes

    private Employee employee;
    private LocalDate date;
    private LocalDateTime timeIn;
    private LocalDateTime timeOut;
    private int overtimeHours;

    // Constructor
    
    public Attendance(Employee employee, LocalDate date) {
        this.employee = employee;
        this.date = date;
    }

    // Getters and setters
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDateTime getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(LocalDateTime timeIn) {
        this.timeIn = timeIn;
    }

    public LocalDateTime getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalDateTime timeOut) {
        this.timeOut = timeOut;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    // Other methods

    public void clockIn(LocalDateTime time) {
        this.timeIn = time;
    }

    public void clockOut(LocalDateTime time) {
        this.timeOut = time;
    }

    public double calculateWorkHours() {
        if (timeIn != null && timeOut != null) {
            Duration duration = Duration.between(timeIn, timeOut);
            return duration.toHours();
        }
        return 0;
    }

    public int calculateOvertimeHours() {
        int totalHours = (int) calculateWorkHours();
        return Math.max(0, totalHours - 8);
    }
}
