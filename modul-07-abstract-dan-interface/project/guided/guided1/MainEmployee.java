public class MainEmployee {

    public static void main(String[] args) {

        SalariedEmployee employee = new SalariedEmployee(
            "Andi",
            "Jaya",
            "123456789",
            5000000
        );

        System.out.println(employee);
        System.out.println("Total Earnings: Rp " + employee.earnings());
    }
}