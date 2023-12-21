package hu.balogh.dummyapi.repository;

import hu.balogh.dummyapi.repository.entity.AdminsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminsRepository extends JpaRepository<AdminsEntity, Integer> {
}
