package com.bursu.springinaction.tacos.data;

import com.bursu.springinaction.tacos.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
