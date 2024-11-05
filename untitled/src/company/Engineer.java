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

    public void setSkills(String newSkills){
        String[] updatedSkills = new String[this.skills.length + 1];

        // Copy existing skills to the new array
        System.arraycopy(this.skills, 0, updatedSkills, 0, this.skills.length);

        // Add the new skill at the end of the array
        updatedSkills[this.skills.length] = newSkills;

        // Reassign the skills array to the updated array
        this.skills = updatedSkills;
    }

    public void removeSkill(String skillToRemove) {
        // Check if the skill exists in the array
        int index = -1;
        for (int i = 0; i < this.skills.length; i++) {
            if (this.skills[i].equals(skillToRemove)) {
                index = i;
                break;
            }
        }

        // If skill is not found, do nothing
        if (index == -1) {
            System.out.println("Skill not found: " + skillToRemove);
            return;
        }

        // Create a new array with one less slot
        String[] updatedSkills = new String[this.skills.length - 1];

        // Copy elements, skipping the skill to remove
        for (int i = 0, j = 0; i < this.skills.length; i++) {
            if (i != index) {
                updatedSkills[j++] = this.skills[i];
            }
        }

        // Reassign the skills array to the updated array
        this.skills = updatedSkills;
    }


    @Override
    public String toString() {
        return super.toString() +  String.format(" skills:\t\t\t%-30s", Arrays.toString(skills));
    }
}
