import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SocialNetwork {

    private User user;

    public List<User> getUsers() {
        return users;
    }

    List<User> users = new LinkedList<User>(); // lista com usuários

    public void addUser(User user) {
        users.add(user);
    }

    private User findUserByID(String id) {
        for (User user: users) {
            if(user.getUser_id()==id) {
                return user;
            }
        }
        return null;
    }

    public void addFriendly(String userFrom, String userTo) {
        User user1 = findUserByID(userFrom);
        User user2 = findUserByID(userTo);
        user1.addFriendly(user2);
        user2.addFriendly(user1);
        System.out.printf("\n%s foi add com sucesso!\n", user2.getUsername());
    }


    public void addPost(String u1, Post post) {
        User user = new User(u1);
        user.addPost(post);
    }
}
