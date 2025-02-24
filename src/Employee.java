public class Employee {
    private int id;
    private int salary;
    // instances mean that there are relationships between Employee and these classes (aggregation and composition)
    private PersonalInformation personalInfo;
    private Department dept;

    public Employee() {}

    public Employee(int id, int salary, String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, int yearOfBirth, Department dept) {
        this.id = id;
        this.salary = salary;
        // composition because there is a strongly relationship between employee and personalInformation if employee destroyed personalInformation also destroyed
        this.personalInfo = new PersonalInformation(firstName, middleName, lastName, bloodGroup, accountNumber, nationality, yearOfBirth);
        // aggregation because there is a weakly relationship between employee and department section
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", personalInfo=" + personalInfo +
                ", dept=" + dept +
                '}';
    }
}
