package hu.balogh.patakparlat_BE.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "news")
public class NewsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String temacim;
    private LocalDate temadatum;
    private String temaleiras;

}
