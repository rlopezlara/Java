package wk9;

public class Student {
    private String name;
    private int studentid;
    private double marks;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Student(){}
    public Student(String name, int studentid, double marks, int age) {
        this.name = name;
        this.studentid = studentid;
        this.marks = marks;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Name = %s, Student ID = %d, Marks = %.1f , Age = %d", name, studentid, marks, age);
    }
}
