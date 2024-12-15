class Human {
    protected String name_;
    protected String surname_;
    protected int age_;

    public Human(String name, String surname, int age) {
        this.name_ = name;
        this.surname_ = surname;
        this.age_ = age;
    }

    public void greeting() {
        System.out.println("Hello! My name is " + name_ + " " + surname_);
    }

    public void goToCafe() {
        if (isAdult()) {
            System.out.println("I go to the cafe");
        } else {
            System.out.println("I can't go to the cafe");
        }
    }

    protected boolean isAdult() {
        return age_ >= 18;
    }
}

class Student extends Human {
    private String university;

    public Student(String name, String surname, int age, String university) {
        super(name, surname, age);
        this.university = university;
    }

    public void showUniversity() {
        System.out.println(name_ + " studies at " + university);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Leonid", "Lipinsky", 20, "SPbSTU");
        student.greeting();
        student.goToCafe();
        student.showUniversity();
    }
}