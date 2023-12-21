package hu.balogh.dummyapi.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class NewsDto {
    private Integer id;
    private String temacim;
    private LocalDate temadatum;

    private String temaleiras;
}
