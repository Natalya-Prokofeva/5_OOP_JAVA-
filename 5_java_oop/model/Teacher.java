package model;

public class Teacher extends User {
    private int teacherID;

    public Teacher(String firstName, String secondName, String lastName, int teacherID) {
        super(firstName, secondName, lastName);
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return " {" + "ID =" + teacherID + ",  " + getFirstName() + ",  "
                + getSecondName() + ",  " + getLastName() + "}";
    }
}