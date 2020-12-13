package dev.truaro.blog.springcore.datamanagement.service;

import dev.truaro.blog.springcore.datamanagement.repository.MemberRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class MemberService {
    private final ShoppingCartService shoppingCartService;
    private final MemberRepository memberRepository;

    public MemberService(ShoppingCartService shoppingCartService, MemberRepository memberRepository) {
        this.shoppingCartService = shoppingCartService;
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void defaultRequiredPropagation() {
        shoppingCartService.useSameTransactionAsCallerWithRequired();
    }

    @Transactional
    public void internalCall() {
        this.doesNotChangeCurrentTransaction();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void doesNotChangeCurrentTransaction() {
    }

    @Transactional
    public void differentTransaction() {
        shoppingCartService.createNewTransactionWithRequiresNew();
    }

    @Transactional
    public void defaultRollbackForRuntimeException() {

    }

    @Transactional(rollbackFor = NullPointerException.class, noRollbackFor = IllegalArgumentException.class)
    public void overrideDefaultRollbackFor() {

    }

}
