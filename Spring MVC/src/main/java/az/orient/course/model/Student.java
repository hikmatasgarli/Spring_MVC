package az.orient.course.model;
import lombok.Data;
import java.util.Date;

@Data
public class Student {
    private Long id;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String phone;
    private String address;
    private Date dob;

}
