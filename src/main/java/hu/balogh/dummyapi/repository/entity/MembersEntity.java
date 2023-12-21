package hu.balogh.dummyapi.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "Members")
public class MembersEntity {

    @Id
    private String id;
    private String name;
    private String position;
    private String phoneNumber;

}
