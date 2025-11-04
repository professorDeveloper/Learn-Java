package design_patterns.builder;

public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String fatherName;
    private Integer age;
    private String email;
    private String phoneNumber;
    private String position;


    private Employee(EmployeeBuilder employeeBuilder) {
        this.id = employeeBuilder.id;
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.middleName = employeeBuilder.middleName;
        this.fatherName = employeeBuilder.fatherName;
        this.age = employeeBuilder.age;
        this.email = employeeBuilder.email;
        this.phoneNumber = employeeBuilder.phoneNumber;
        this.position = employeeBuilder.position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public static class EmployeeBuilder {
        private String id;
        private String firstName;
        private String lastName;
        private String middleName;
        private String fatherName;
        private Integer age;
        private String email;
        private String phoneNumber;
        private String position;

        public EmployeeBuilder id(String id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public EmployeeBuilder fatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public EmployeeBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder email(String email) {
            this.email = email;
            return this;
        }

        public EmployeeBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public EmployeeBuilder position(String position) {
            this.position = position;
            return this;
        }


        public EmployeeBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Employee build() {
            return new Employee(this);

        }

    }
}
