public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Esma", 2000.0, 45, 1985);
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        employee.toString();
    }
}