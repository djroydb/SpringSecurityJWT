package br.com.djroydb.spring_security_jwt;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

    @SuppressWarnings("null")
    Optional<User> findById(String email);

}
