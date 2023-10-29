package com.users;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "usuarios")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ;
    private String firstName;
    private String lastName;
    private LocalDateTime dateBirth;
    private String address;
    private String token;
    private String password;
    private String mobilePhone;
    private  String email;


}
