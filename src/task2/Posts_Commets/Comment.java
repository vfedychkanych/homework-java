package task2.Posts_Commets;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

}
