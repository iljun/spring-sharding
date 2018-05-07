package com.example.jpa.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By iljun
 * User : iljun
 * Date : 18. 5. 7
 * Time: 오후 3:55
 */
@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
}
