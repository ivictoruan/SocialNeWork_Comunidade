import java.util.ArrayList;
import java.util.List;


public class Main {



    public static void main(String[] args) {

        SocialNetwork rede = new SocialNetwork();

        rede.addUser(new User("u1", "Joao Carlos"));
        rede.addUser(new User("u2", "Maria Antonia"));
        rede.addUser(new User("u3", "Emanuel Benedito"));
        rede.addUser(new User("u4", "Josefina de Almeida"));

        // adiciona uma amizade, dado dois user ids
        rede.addFriendly ("u1", "u2");
        rede.addFriendly ("u1", "u3");
        rede.addFriendly ("u2", "u4");

        // adiciona um pos relacionado a um usuário
        rede.addPost ("u1", new Post ("p1", "Tomando cafe"));
    }


}



