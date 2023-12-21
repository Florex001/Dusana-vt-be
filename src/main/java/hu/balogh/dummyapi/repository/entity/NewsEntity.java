package hu.balogh.dummyapi.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Document(collection = "News")
public class NewsEntity {

    @Id
    private String id;
    private String temacim;
    private LocalDateTime temadatum;
    private String temaleiras;

}
