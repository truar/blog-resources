package dev.truaro.blog.springcore.datamanagement.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface MemberServiceInterface {

    void defaultRequiredPropagation();
    void internalCall();
    void doesNotChangeCurrentTransaction();
    void differentTransaction();
    void defaultRollbackForRuntimeException();
    void overrideDefaultRollbackFor();
}
