package com.saar.microservice.database;

import com.saar.microservice.pojos.users.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserData, Long> {
}
