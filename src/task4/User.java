package task4;


import lombok.*;

@Data
@Builder
public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
    private int age;
}
