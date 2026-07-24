import java.util.HashMap;
import java.util.Map;

public class Splitwise {

    // map for id -> user

    private Map<String, User> users = new HashMap<>();

    // map for id -> group
    private Map<String, Group> groups = new HashMap<>();


    // creating the users
    public User createUser(String id, String name) {

        User user = new User(id, name);
        users.put(user.getId(), user);
        return user;
    }

    // creating the groups
    public Group createGroup(String id, String name) {
        Group group = new Group(id, name);
        groups.put(group.getId(), group);
        return group;

    }


    // getting balance of a user across all groups
    public double getOverallBalance(String userId) {

    }



}
