package lesson5.persons;

import java.util.ArrayList;

public class Student {

    class Type {
        int state;
    }

    private String fio;
    private Group group;

    public Student(String fio) {
        this.fio = fio;
    }

    public void showListOfMates() {
        ArrayList<Student> mates = new ArrayList<>(group.getStudents());
        mates.remove(this);
        System.out.println(mates);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                '}';
    }

    public void showListOfTeachers() {
        System.out.println(group.getTeachers());
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
