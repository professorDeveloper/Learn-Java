package record_learn;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord(1, "mohamed", LocalDate.of(2021, 1, 1));
        EmployeeDTO employeeDTO = new EmployeeDTO(1, "mohamed", LocalDate.of(2021, 1, 1));

        System.out.println(employeeRecord.json());
    }
}
