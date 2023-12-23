package hu.balogh.dusanaVT.repository;

import hu.balogh.dusanaVT.repository.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<NewsEntity, Integer> {
}
