class Employee {
    int id;
    String name;
    double salary;
    String phone;
    String address;

    Employee(int id, String name, double salary, String phone, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.phone = phone;
        this.address = address;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("-----------------------------");
    }
}

class EmployeeManagement {
    Employee[] employees = new Employee[100];
    int count = 0;

    void insertEmployee(int id, String name, double salary, String phone, String address) {
        if (count < 100) {
            employees[count++] = new Employee(id, name, salary, phone, address);
            System.out.println("Employee added!");
        } else {
            System.out.println("Limit reached!");
        }
    }

    void printAllEmployees() {
        if (count == 0) {
            System.out.println("No employees!");
            return;
        }
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    public static void main(String[] args) {
        EmployeeManagement system = new EmployeeManagement();
        system.insertEmployee(1, "Jay", 50000, "123-456-7890", "123East");
        system.insertEmployee(2, "Abhay", 60000, "987-654-3210", "456West");
        system.printAllEmployees();
    }
}
