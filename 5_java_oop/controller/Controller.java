package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Group;
import model.Student;
import model.Teacher;
import model.Type;
import model.User;
import service.DataService;
import service.GroupService;
import view.GroupView;
import view.StudentView;
import view.TeacherView;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final GroupView groupView = new GroupView();
    private final GroupService groupService = new GroupService();

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent() {
        for (User user : dataService.getAllConcUser(Type.STUDENT)) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void getAllTeacher() {
        for (User user : dataService.getAllConcUser(Type.TEACHER)) {
            teacherView.printOnConsole((Teacher) user);
        }
    }

    public Integer getGroupNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер группы");
        return scanner.nextInt();
    }

    public User getGroupTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID Преподавателя");
        int id = scanner.nextInt();
        return dataService.getUserById(Type.TEACHER, id);
    }

    public List<User> studentsInGroup() {
        List<User> studentsGroup = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID студентов, закончите - введите 0");

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            User student = dataService.getUserById(Type.STUDENT, number);
            if (student != null) {
                studentsGroup.add(student);
            }
        }

        return studentsGroup;
    }

    public void createGroup() {
        int numberGroup = getGroupNumber();
        User teacherGroup = getGroupTeacher();
        List<User> students = studentsInGroup();
        Group group = groupService.createGroup(numberGroup, teacherGroup, students);
        groupView.printOnConsole(group);
    }
}