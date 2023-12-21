package hu.balogh.dummyapi.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class NewsDto {
    private Integer id;
    private String temacim;
    private LocalDateTime temadatum;

    private String temaleiras;
}
