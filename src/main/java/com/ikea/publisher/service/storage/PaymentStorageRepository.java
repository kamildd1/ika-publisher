package com.ikea.publisher.service.storage;

import com.ikea.publisher.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PaymentStorageRepository extends MongoRepository<Payment, String> {

    @Override
    <S extends Payment> List<S> saveAll(Iterable<S> entities);

    @Override
    <S extends Payment> S save(S entity);
}
