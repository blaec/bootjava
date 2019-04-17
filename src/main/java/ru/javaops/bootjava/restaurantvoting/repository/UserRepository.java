package ru.javaops.bootjava.restaurantvoting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javaops.bootjava.restaurantvoting.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}