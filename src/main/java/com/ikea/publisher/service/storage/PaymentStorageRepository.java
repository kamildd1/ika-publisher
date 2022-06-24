/**
 * This package includes repository for Payments
 */
package com.ikea.publisher.service.storage;

import com.ikea.publisher.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * This interface contains Payment Repository
 */
public interface PaymentStorageRepository extends MongoRepository<Payment, String> {
}
