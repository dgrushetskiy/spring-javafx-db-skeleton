package ru.dev.city.report.population.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.dev.city.report.population.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return User
                .builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .work(rs.getString("work"))
                .build();
    }
}
