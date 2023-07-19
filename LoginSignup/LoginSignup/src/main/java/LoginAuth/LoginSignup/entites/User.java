package LoginAuth.LoginSignup.entites;

import java.time.LocalDateTime;


import javax.persistence.*;

import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(nullable = false)
    private String first_name;

    private String last_name;

    private String email;

    @Column(nullable = false)
    private String mobile;

    private String aadharcardNumber;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;

    private String gender;

    private String address;

//    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
//    @Column(name = "created_at")
@CreationTimestamp
@Temporal(TemporalType.TIMESTAMP)
    private Date creationDate ;



    public User( String first_name, String last_name, String email, String mobile, String aadharcardNumber,
                String password, String role, String gender, String address) {
        super();

        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.mobile = mobile;
        this.aadharcardNumber = aadharcardNumber;
        this.password = password;
        this.role = role;
        this.gender = gender;
        this.address = address;


    }

}
