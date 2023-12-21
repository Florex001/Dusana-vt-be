package hu.balogh.dummyapi.repository.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "Admins")
public class AdminsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String password;

}
