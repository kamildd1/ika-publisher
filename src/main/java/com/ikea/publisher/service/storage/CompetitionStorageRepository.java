package com.ikea.publisher.service.storage;

import com.ikea.publisher.model.Competition;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * This interface contains Competition Repository
 */
public interface CompetitionStorageRepository extends MongoRepository<Competition, String> {
}
