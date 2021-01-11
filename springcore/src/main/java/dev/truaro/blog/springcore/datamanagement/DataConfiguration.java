package dev.truaro.blog.springcore.datamanagement;

import com.mysql.cj.jdbc.MysqlDataSource;
import dev.truaro.blog.springcore.datamanagement.repository.MemberRepository;
import dev.truaro.blog.springcore.datamanagement.repository.OrderRepository;
import dev.truaro.blog.springcore.datamanagement.service.MemberService;
import dev.truaro.blog.springcore.datamanagement.service.MemberServiceImplementation;
import dev.truaro.blog.springcore.datamanagement.service.MemberServiceInterface;
import dev.truaro.blog.springcore.datamanagement.service.ShoppingCartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class DataConfiguration {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().build();
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public MemberRepository memberRepository(DataSource dataSource) {
        return new MemberRepository(dataSource);
    }

    @Bean
    public OrderRepository orderRepository(DataSource dataSource) {
        return new OrderRepository(dataSource);
    }

    @Bean
    public ShoppingCartService service(OrderRepository orderRepository, MemberRepository memberRepository) {
        return new ShoppingCartService(orderRepository, memberRepository);
    }

    @Bean
    public MemberService memberService(ShoppingCartService shoppingCartService, MemberRepository memberRepository) {
        return new MemberService(shoppingCartService, memberRepository);
    }

    @Bean
    public MemberServiceInterface memberService2(ShoppingCartService shoppingCartService, MemberRepository memberRepository) {
        return new MemberServiceImplementation(shoppingCartService, memberRepository);
    }

    @Bean
    @Profile("mysql")
    public DataSource mysqlDataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("url");
        dataSource.setUser("username");
        dataSource.setPassword("port");
        return dataSource;
    }

}
