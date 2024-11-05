package company;

public class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public String getDept(){
        return this.department;
    }
    public void setDept(String newDept){
        this.department = newDept;
    }

    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double newSalary){
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        return String.format("Employee:\t%-15s Department:\t%-20s Salary:\t%-10.2f", name, department, salary);
    }
}