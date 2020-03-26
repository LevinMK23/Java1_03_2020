package lesson5.persons;

public class Test {
    public static void main(String[] args) {
        Group g1 = new Group();
        Group g2 = new Group();
        Teacher t1 = new Teacher("Oleg Ivanovich");
        Teacher t2 = new Teacher("Aleksei Anatolievich");
        Student s1 = new Student("S1");
        Student s2 = new Student("S2");
        Student s3 = new Student("S3");
        Student s4 = new Student("S4");
        g1.addTeacher(t1);
        g1.addTeacher(t2);
        g1.addStudent(s1);
        g1.addStudent(s2);
        g2.addStudent(s3);
        g2.addStudent(s4);
        t1.selectGroup(g2);
        t1.showGroupList();
        t1.showStudentListByGroup(g1);
        t1.showStudentListByGroup(g2);
        s2.showListOfMates();
        s2.showListOfTeachers();
        s4.showListOfMates();
        s4.showListOfTeachers();
    }
}
