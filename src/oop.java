class Person {
    int age;
    String name;
    boolean eMajor;

    Person(int givenAge, String givenName){
        this.age = givenAge;
        this.name = givenName;
        if (age >= 18){
            this.eMajor = true;
        }
        else{
            this.eMajor = false;
        }
    }
    // int, String, boolean, double
    void introduce(){
        System.out.println("Salut, ma cheama " + name + " si am varsta de " + age + " ani.");
    }

    public boolean iseMajor() {
        return eMajor;
    }

    public void seteMajor(boolean eMajor) {
        this.eMajor = eMajor;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class Student extends Person {
    int grade;
    double GPA;

    Student(int givenAge, String givenName, int givenGrade, double givenGPA){
        super(givenAge, givenName);
        this.grade = givenGrade;
        this.GPA = givenGPA;
    }

    public void study(){
        GPA = GPA + 0.25 * GPA; // adauga 25% la GPA
        System.out.println("Elevul a invatat si are media " + GPA);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}

public class oop {
    public static void main(String[] args){
        Person primulCopil = new Person(15, "Andrei");
        primulCopil.introduce();

        primulCopil.setAge(16);
        primulCopil.introduce();

        Student primulStudent = new Student(17, "Mihai", 11, 8);
        System.out.println(primulStudent.getGPA());
        primulStudent.study();

        // trece anul
        primulStudent.setGrade(primulStudent.getGrade() + 1);
        primulStudent.setAge(primulStudent.getAge() + 1);
        System.out.println("Acum elevul e in clasa " + primulStudent.getGrade());
        System.out.println("Are varsta de " + primulStudent.getAge() + " ani.");
    }
}
