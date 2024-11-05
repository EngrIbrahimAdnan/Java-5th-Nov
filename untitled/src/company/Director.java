package company;

public class Director extends Employee {
    private double budget;

    public Director(String name, String department, double salary, double budget) {
        super(name, department, salary);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    public void setBudget(double newBudget){
        this.budget = newBudget;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Budget:\t\t\t%-10.2f", budget);
    }
}