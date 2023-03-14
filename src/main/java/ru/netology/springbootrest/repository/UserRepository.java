package ru.netology.springbootrest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springbootrest.model.Authorities;
import ru.netology.springbootrest.model.User;

import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(User user) {
        return null;
    }
}