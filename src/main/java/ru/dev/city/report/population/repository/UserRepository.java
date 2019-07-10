package ru.dev.city.report.population.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import ru.dev.city.report.population.mapper.UserRowMapper;
import ru.dev.city.report.population.model.User;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class UserRepository extends JdbcDaoSupport {

    private static final String SQL_SELECT = "select id, name, works from db_fx.users";

    @Autowired
    private UserRowMapper rowMapper;
    @Autowired
    public void setDatasource(DataSource datasource) {
        super.setDataSource(datasource);
    }

    public List<User> findAll(){
        String sql = SQL_SELECT;
        return getJdbcTemplate().query(sql,rowMapper);
    }
}
