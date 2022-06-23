package com.ikea.publisher.service.storage;

import com.ikea.publisher.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * This interface contains Player Repository
 */
public interface PlayerStorageRepository extends MongoRepository<Player, String> {
}
