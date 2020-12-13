package dev.truaro.blog.springcore.datamanagement.service;

import com.zaxxer.hikari.pool.HikariProxyCallableStatement;
import dev.truaro.blog.springcore.datamanagement.repository.MemberRepository;
import dev.truaro.blog.springcore.datamanagement.repository.OrderRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

public class ShoppingCartService {

    private final OrderRepository orderRepository;
    private final MemberRepository memberRepository;
    private TransactionTemplate transactionTemplate;

    public ShoppingCartService(OrderRepository orderRepository, MemberRepository memberRepository) {
        this.orderRepository = orderRepository;
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void defaultDeclarativeTransactionOnMethod() {
    }

    public void programmaticTransactionOnMethod() {
        transactionTemplate.executeWithoutResult(status -> {
            // Execute your business logic here
        });

    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    @Transactional
    public void useSameTransactionAsCallerWithRequired() {

    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void createNewTransactionWithRequiresNew() {
        // This transaction will be different than the one created in MemberService
    }
}
