package company;

public class SalesPerson extends Employee {
    private int salesTarget;

    public SalesPerson(String name, String department, double salary, int salesTarget) {
        super(name, department, salary);
        this.salesTarget = salesTarget;
    }

    public int getSalesTarget(){
        return this.salesTarget;
    }

    public void setSalesTarget(int newSalesTarget){
        this.salesTarget = newSalesTarget;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Sales Target:\t%d", salesTarget);

    }
}