package model;

import java.util.List;

public class Group {
    private int numberGroup;
    private User teacherGroup;
    private List<User> students;

    public Group(int numberGroup, User teacherGroup, List<User> students) {
        this.numberGroup = numberGroup;
        this.teacherGroup = teacherGroup;
        this.students = students;
    }

    public User getTeacherGroup() {
        return teacherGroup;
    }

    public void setTeacherGroup(Teacher teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    @Override
    public String toString() {
        return "Группа № " + numberGroup + ", Преподаватель: " + teacherGroup + ", Студенты: " + students;
    }
}
