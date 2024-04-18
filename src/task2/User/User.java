package task2.User;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private int id;
    private String name;
    private String username;
    private String email;

    private Address address;

    private String phone;
    private String website;

    private Company company;
}
