package company;

public class Main {
    public static void main(String[] args) {

        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 50);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");
        Director Richard = new Director("Richard", "Director of IT", 30000, 8029.9 );
        Engineer Tim = new Engineer("Tim", "Engineer", 91000, new String[] {"Servers","Network configuration"} );
        SalesPerson Lee = new SalesPerson("Lee", "Sales", 10000, 3940 );

        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
        System.out.println(Richard);
        System.out.println(Tim);
        System.out.println(Lee);

        //Everyone gets a raise of 1000
        emily.setSalary(emily.getSalary()+1000);
        john.setSalary(john.getSalary()+1000);
        dave.setSalary(dave.getSalary()+1000);
        Richard.setSalary(Richard.getSalary()+1000);
        Tim.setSalary(Tim.getSalary()+1000);
        Lee.setSalary(Lee.getSalary()+1000);

        System.out.println("\nAfter Salary Raise:");

        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
        System.out.println(Richard);
        System.out.println(Tim);
        System.out.println(Lee);


        //Everyone decided to change their names to arabic names because they just moved to kuwait
        emily.setName("Fatmah");
        john.setName("Abdullah");
        dave.setName("Mohamed");
        Richard.setName("Khalid");
        Tim.setName("Abdulaziz");
        Lee.setName("Hamad");

        System.out.println("\nAfter name Change:");
        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
        System.out.println(Richard);
        System.out.println(Tim);
        System.out.println(Lee);

        //Everyone decided to migrate to a new department called kuwait
        emily.setDept("Kuwait");
        john.setDept("Kuwait");
        dave.setDept("Kuwait");
        Richard.setDept("Kuwait");
        Tim.setDept("Kuwait");
        Lee.setDept("Kuwait");

        System.out.println("\nAfter Department Change:");
        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
        System.out.println(Richard);
        System.out.println(Tim);
        System.out.println(Lee);
    }
}