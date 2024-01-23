package entities;

public class Employee {

    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee() {
        
    }

    public Employee (String name, int id, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void incraseSalary (double percentage) {
        salary += (salary * percentage)/ 100;

    }

    public String toString () {
        return getId() + ", " + getName() + ", " + getSalary();
    }


    
}
