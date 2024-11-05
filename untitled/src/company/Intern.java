package company;

public class Intern extends Employee {
    private String university;

    public Intern(String name, String department, double salary, String university) {
        super(name, department, salary);
        this.university = university;
    }

    public String getUniversity(){
        return this.university;
    }

    public void setUniversity(String newUniversity){
        this.university = newUniversity;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" University:\t\t%-30s", university);
    }
}