package task2.Posts_Commets;


import lombok.*;

import java.util.ArrayList;


@Getter
@Setter
@ToString
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
    private ArrayList<Comment> comments = new ArrayList<>();

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
}
