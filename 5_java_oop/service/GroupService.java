package service;

import java.util.List;
import model.Group;
import model.User;

public class GroupService {
    public Group createGroup(int number, User teacher, List<User> students) {
        return new Group(number, teacher, students);
    }
}
