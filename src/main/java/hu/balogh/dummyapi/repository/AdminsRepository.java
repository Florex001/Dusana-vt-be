package hu.balogh.dummyapi.repository;

import hu.balogh.dummyapi.repository.entity.AdminsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminsRepository extends MongoRepository<AdminsEntity, String> {
}
