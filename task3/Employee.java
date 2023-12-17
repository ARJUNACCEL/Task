class Employee extends Person{
    private int employeeId;
    private double salary;


    public Employee(String name, int age, int employeeId, double salary) {

        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Employee employee = new Employee("Arjun", 21, 1, 50000.0);


        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Salary: " + employee.getSalary());
    }
}