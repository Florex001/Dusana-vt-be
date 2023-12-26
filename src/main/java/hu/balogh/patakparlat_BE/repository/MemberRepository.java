package hu.balogh.patakparlat_BE.repository;

import hu.balogh.patakparlat_BE.repository.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {
}
