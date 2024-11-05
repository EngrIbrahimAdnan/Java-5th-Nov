public class student {
    private String name;
    private int age;
    private double gpa;

    //Constructor
    public student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    //Generic conditioning for different gpa ranges
    public String getGpaStatus() {
        if (this.gpa >= 3 && this.gpa <= 4) {
            return "Excellent.";
        } else if (this.gpa >= 2 && this.gpa < 3) {
            return "Good.";
        } else if (this.gpa < 2 && this.gpa >= 0) {
            return "Needs Improvement.";
        } else {
            //this utilizes the setGPA to print error message
            this.setGpa(this.gpa);
            return "Something went wrong";
        }
    }

    public void setGpa(double NewGPA) {
        //Only true if value is between 0 and 4, inclusive
        if (NewGPA >= 0 && NewGPA <= 4) {
            this.gpa = NewGPA;
        } else {
            System.out.println("The gpa must be in the range of 0 to 4.00");
        }
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String setName() {
        return this.name;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    @Override
    public String toString() {
        return  "name: " + name +
                ", age: " + age +
                ", gpa: " + gpa;
    }

    public static void main(String[] args) {
        student newStudent = new student("Ibrahim", 26, 3.2);
        System.out.println(newStudent);

        //New student
        newStudent.setName("Mohamed");
        newStudent.setGpa(3.5);
        newStudent.setAge(19);
        System.out.println(newStudent);

        //New student with invalid gpa
        newStudent.setName("Abdullah");
        newStudent.setGpa(50000);//ignores this value and remains with the previous gpa value
        newStudent.setAge(23);
        System.out.println(newStudent);
    }
}
