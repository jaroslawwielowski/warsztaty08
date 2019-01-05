package com.example.warsztaty08.Repository;

import com.example.warsztaty08.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User getUserById(Long id);
}
