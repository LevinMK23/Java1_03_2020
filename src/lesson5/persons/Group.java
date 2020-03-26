package lesson5.persons;

import java.util.ArrayList;

public class Group {

    private static int counter = 0;
    private int id;

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                '}';
    }

    public Group() {
        counter++;
        id = counter;
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        student.setGroup(this);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        // TODO: 3/26/2020 set group on teacher
        if (!teacher.getGroups().contains(this)) {
            teacher.selectGroup(this);
        }
    }

    public Group(ArrayList<Student> students, ArrayList<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public Group(ArrayList<Student> students) {
        this.students = students;
    }

    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}
