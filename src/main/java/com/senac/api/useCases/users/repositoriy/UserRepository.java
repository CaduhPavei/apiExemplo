package com.senac.api.useCases.users.repositoriy;

import com.senac.api.model.User;
import com.senac.api.useCases.users.domains.UserRequestDom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByLogin(String login);

    Optional<Object> findById(UserRequestDom user);
}
