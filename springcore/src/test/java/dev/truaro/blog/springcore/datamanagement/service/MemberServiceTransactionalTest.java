package dev.truaro.blog.springcore.datamanagement.service;

import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

@SpringJUnitConfig
@Transactional
class MemberServiceTransactionalTest {

    @Test
    void transactionalTestRollbackAtTheEnd() {
    }

    @Test
    @Commit
    void transactionalTestIsCommit() {
    }
}