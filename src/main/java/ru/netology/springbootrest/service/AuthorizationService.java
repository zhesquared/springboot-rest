package ru.netology.springbootrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.springbootrest.repository.UserRepository;
import ru.netology.springbootrest.exceptions.UnauthorizedUser;
import ru.netology.springbootrest.model.Authorities;
import ru.netology.springbootrest.model.User;

import java.util.List;

@Service
public class AuthorizationService {

    @Autowired
    UserRepository userRepository;

    public List<Authorities> getAuthorities(User user) {
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("New user " + user);
        }

        return userAuthorities;
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}