package dev.truaro.blog.springcore.datamanagement.service;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig
class MemberServiceTest {

    @Test
    @Transactional
    void transactionalTestRollbackAtTheEnd() {
    }

    @Test
    @Commit
    @Transactional
    void transactionalTestIsCommit() {
    }
}