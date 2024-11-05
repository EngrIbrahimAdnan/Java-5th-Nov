package company;
import java.util.Arrays;

public class Engineer extends Employee {
    private String[] skills;

    public Engineer(String name, String department, double salary, String[] skills) {
        super(name, department, salary);
        this.skills = skills;
    }

    public String[] getSkills(){
        return this.skills;
    }

    public void setSkills(String[] newSkills){
        this.skills = newSkills;
    }

    @Override
    public String toString() {
        return super.toString() +  String.format(" skills:\t\t\t%-30s", Arrays.toString(skills));
    }
}
