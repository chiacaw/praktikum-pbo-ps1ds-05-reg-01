public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // Constructor
    public Employee(String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    }

    // Setter dan getter firstName
    public void setFirstName(String first) {
        firstName = first;
    }

    public String getFirstName() {
        return firstName;
    }

    // Setter dan getter lastName
    public void setLastName(String last) {
        lastName = last;
    }

    public String getLastName() {
        return lastName;
    }

    // Setter dan getter socialSecurityNumber
    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // Menampilkan informasi Employee
    public String toString() {
        return String.format(
            "%s %s\nsocial security number: %s",
            getFirstName(),
            getLastName(),
            getSocialSecurityNumber()
        );
    }

    // Abstract method
    public abstract double earnings();
}
