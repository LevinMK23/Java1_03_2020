package lesson5.persons;

import java.util.ArrayList;

public class Teacher {

    private String fio;
    private ArrayList<Group> groups;

    public Teacher(String fio) {
        this.fio = fio;
        groups = new ArrayList<>();
    }

    public void showGroupList() {
        System.out.println(groups);
    }

    public void showStudentListByGroup(Group group) {
        if (groups.contains(group)) {
            int groupPosition = groups.indexOf(group);
            //                           a[pos]
            System.out.println(group + " " + groups.get(groupPosition).getStudents());
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fio='" + fio + '\'' +
                '}';
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void selectGroup(Group group) {
        groups.add(group);
        // TODO: 3/26/2020 add teacher to group
        if (!group.getTeachers().contains(this)) {
            group.addTeacher(this);
        }
    }

}
