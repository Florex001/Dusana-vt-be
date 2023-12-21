package hu.balogh.dummyapi.repository;

import hu.balogh.dummyapi.repository.entity.MembersEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepository extends MongoRepository<MembersEntity, String> {
}
