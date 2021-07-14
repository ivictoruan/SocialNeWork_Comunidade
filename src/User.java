import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class User {


    private String user_id;
    private String username;

    private List<User> friends = new LinkedList<User>();
    private List<Post> posts = new LinkedList<Post>();


    public User(String user_id, String username) {
        this.user_id = user_id;
        this.username = username;

    }

    public User(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<User> showFriends() {
        return friends;
    }

    public void addFriendly(User user) {
        friends.add(user);
    }

    public void addPost(Post post) {
        posts.add(post);
    }
}
