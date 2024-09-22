import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Анатолий", "Петрович", "Иванов");
        controller.createStudent("Аркадий", "Семенович", "Петров");
        controller.createStudent("Семен", "Олегович", "Сидоров");
        controller.createStudent("Виктор", "Иванович", "Агеев");
        controller.createStudent("Игорь", "Семёнович", "Воронин");
        controller.createStudent("Татьяна", "Петровна", "Семёнова");

        controller.getAllStudent();
        System.out.println();
        
        controller.createTeacher("Антонина", "Георгиевна", "Сомова");
        controller.createTeacher("Марат", "Эрнстович", "Танагузов");
        
        controller.getAllTeacher();
        System.out.println();
        
        controller.createGroup();
    }
}