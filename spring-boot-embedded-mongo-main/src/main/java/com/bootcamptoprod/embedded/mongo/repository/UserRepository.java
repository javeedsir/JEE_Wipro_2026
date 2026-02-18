package com.bootcamptoprod.embedded.mongo.repository;

import com.bootcamptoprod.embedded.mongo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    void deleteById(String id);

    Optional<User> findById(String id);

    boolean existsById(String id);
}
