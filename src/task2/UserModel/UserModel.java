package task2.UserModel;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserModel {

    private int id;
    private String name;
    private String username;
    private String email;
    private int age;
    private Gender gender;
    private Skills[] skills;
    private Car car;
}
