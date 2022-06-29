package com.ikea.publisher.service.storage;

import com.ikea.publisher.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserStorageRepository extends MongoRepository<User, String> {
}
