/**
 * This package includes repository for Competitions
 */
package com.ika.publisher.service.storage;

import com.ika.publisher.model.Competition;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * This interface contains Competition Repository
 */
public interface CompetitionStorageRepository extends MongoRepository<Competition, String> {
}
