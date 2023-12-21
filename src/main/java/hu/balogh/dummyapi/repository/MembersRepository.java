package hu.balogh.dummyapi.repository;

import hu.balogh.dummyapi.repository.entity.MembersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepository extends JpaRepository<MembersEntity, Integer> {
}
