package module4.lessons.imutable.version2;

public class EmployeeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Tashkent", "Chilonzor");
        Employee employee = new Employee("John Doe", 30, address);
      /*  address.setCity("Bishkek");
        System.out.println("Employee: " + employee);*/
        employee.getAddress().setCity("Bishkek");
        System.out.println("Employee: " + employee);
    }
}
