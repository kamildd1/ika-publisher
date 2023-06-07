/**
 * This package includes repository for Players
 */
package com.ika.publisher.service.storage;

import com.ika.publisher.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * This interface contains Player Repository
 */
public interface PlayerStorageRepository extends MongoRepository<Player, String> {
}
