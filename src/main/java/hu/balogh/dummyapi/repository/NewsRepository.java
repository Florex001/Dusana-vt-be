package hu.balogh.dummyapi.repository;

import hu.balogh.dummyapi.repository.entity.NewsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends MongoRepository<NewsEntity, String> {
}
