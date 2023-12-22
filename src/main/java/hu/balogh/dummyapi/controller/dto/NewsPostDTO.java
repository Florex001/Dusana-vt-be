package hu.balogh.dummyapi.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class NewsPostDTO {
    private String temacim;
    private LocalDate temadatum;

    private String temaleiras;
}
