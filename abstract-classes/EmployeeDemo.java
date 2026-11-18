abstract class Employee {
    int emp_id;
    String emp_name;
    double salary;

    Employee(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    abstract void calculate_salary();

    void setDetails(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    void getDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Salary: " + salary);
    }
}

class PermanentEmployee extends Employee {

    PermanentEmployee(int emp_id, String emp_name) {
        super(emp_id, emp_name);
    }

    @Override
    void calculate_salary() {
        salary = 50000 + 10000;  // Basic salary + allowance
    }
}

class TemporaryEmployee extends Employee {

    TemporaryEmployee(int emp_id, String emp_name) {
        super(emp_id, emp_name);
    }

    @Override
    void calculate_salary() {
        salary = 1500 * 20;  // Daily wage * working days
    }
}

public class EmployeeDemo {
    public static void main(String args[]) {

        Employee e;

        e = new PermanentEmployee(101, "Rahul");
        e.calculate_salary();
        System.out.println("Permanent Employee Details:");
        e.getDetails();

        System.out.println();

        e = new TemporaryEmployee(102, "Amit");
        e.calculate_salary();
        System.out.println("Temporary Employee Details:");
        e.getDetails();
    }
}