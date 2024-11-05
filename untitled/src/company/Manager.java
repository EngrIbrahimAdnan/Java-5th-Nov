package company;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String department, double salary, int teamSize) {
        super(name, department, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize(){
        return this.teamSize;
    }

    public void setTeamSize(int newTeamSize){
        this.teamSize = newTeamSize;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Team Size:\t\t%-5d", teamSize);
    }
}


