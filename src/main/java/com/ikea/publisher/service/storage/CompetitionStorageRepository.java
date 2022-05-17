package com.ikea.publisher.service.storage;

import com.ikea.publisher.model.Competition;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompetitionStorageRepository extends MongoRepository<Competition, String> {
}
