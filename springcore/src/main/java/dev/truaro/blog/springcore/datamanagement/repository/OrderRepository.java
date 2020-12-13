package dev.truaro.blog.springcore.datamanagement.repository;

import dev.truaro.blog.springcore.datamanagement.model.Item;
import dev.truaro.blog.springcore.datamanagement.model.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderRepository {
    private final JdbcTemplate jdbcTemplate;
    private final DataSource dataSource;

    public OrderRepository(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Order findOrderByIdUsingResultSetExtractor(String id) {
        return jdbcTemplate.query("select * from orders o join items i on o.id = i.order_id where o.id=?", this::toOrder, id);
    }

    private Order toOrder(ResultSet resultSet) throws SQLException {
        Order order = null;
        while(resultSet != null) {
            if(order == null) {
                order = new Order(resultSet.getString("id"));
            }
            order.add(new Item(resultSet.getString("name")));
        }
        return order;
    }

}
