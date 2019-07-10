package ru.dev.city.report.population.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.dev.city.report.population.model.User;
import ru.dev.city.report.population.repository.UserRepository;

import javax.sql.DataSource;
import java.util.List;

@Service
public class UserService {
    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;
    @Autowired
    private UserRepository repository;

    public List<User> getAll(){
        repository.setDatasource(dataSource);
        return repository.findAll();
    }
}
