package dev.truaro.blog.springcore.datamanagement.repository;

import dev.truaro.blog.springcore.datamanagement.model.Member;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MemberRepository {
    private final JdbcTemplate jdbcTemplate;
    private final DataSource dataSource;

    public MemberRepository(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Member> getMembersUsingARowMapper() {
        return jdbcTemplate.query("select * from members", (resultSet, i) -> toMembers(resultSet));
    }

    private Member toMembers(ResultSet resultSet) throws SQLException {
        return new Member(resultSet.getString("name"));
    }

    public void logMembersUsingRowCallbackHandler() {
        jdbcTemplate.query("select * from members", (resultSet) -> {
            System.out.println(resultSet.getString("name"));
        });
    }

    public void getPrimitiveData() {
        jdbcTemplate.queryForObject("select cunt(*) from members", Integer.class);
        jdbcTemplate.queryForObject("select creationDate from members where id=?", Date.class, "1");
    }

}
