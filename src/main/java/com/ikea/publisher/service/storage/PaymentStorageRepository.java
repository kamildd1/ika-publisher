package com.ikea.publisher.service.storage;

import com.ikea.publisher.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentStorageRepository extends MongoRepository<Payment, String> {
}
