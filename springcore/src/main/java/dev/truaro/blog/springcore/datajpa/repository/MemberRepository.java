package dev.truaro.blog.springcore.datajpa.repository;

import dev.truaro.blog.springcore.datajpa.model.Member;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {

    Member findByEmail(String email);

    @Query("select m from Member m where m.email = ''")
    Member findEmptyEmail();
}
