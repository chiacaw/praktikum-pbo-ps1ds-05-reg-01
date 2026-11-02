public class SalariedEmployee extends Employee {

    private double weeklySalary;

    // Constructor
    public SalariedEmployee(
        String first,
        String last,
        String ssn,
        double salary
    ) {
        super(first, last, ssn);
        setWeeklySalary(salary);
    }

    // Setter weeklySalary
    public void setWeeklySalary(double salary) {
        weeklySalary = salary < 0.0 ? 0.0 : salary;
    }

    // Getter weeklySalary
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // Implementasi abstract method earnings
    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    // Menampilkan informasi SalariedEmployee
    @Override
    public String toString() {
        return String.format(
            "salaried employee: %s\n%s: $%,.2f",
            super.toString(),
            "weekly salary",
            getWeeklySalary()
        );
    }
}