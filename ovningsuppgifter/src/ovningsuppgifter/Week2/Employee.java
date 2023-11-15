package ovningsuppgifter.Week2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Employee {
    private String name;

    private double salary;

    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {

        return name;
    }

    public double getSalary() {

        return salary;
    }

    public LocalDate getHireDate() {

        return hireDate;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public String employmentTime() {

        return employmentTime(LocalDate.now());
    }

    public String employmentTime(LocalDate endDate) {
        long years = hireDate.until(endDate).getYears();
        long months = hireDate.until(endDate).getMonths();
        long days = hireDate.until(endDate).getDays();
        return years + " år, " + months + " månader och " + days + " dagar";
    }

    public String employmentTime(String endDateStr) {
        try {
            LocalDate endDate = LocalDate.parse(endDateStr);
            return employmentTime(endDate);
        } catch (DateTimeParseException e) {
            return "Ogiltig datumsträng. Ange datum i formatet 'ÅÅÅÅ-MM-DD'.";
        }

    }
}
