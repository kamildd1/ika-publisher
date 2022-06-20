package com.ikea.publisher;

import com.ikea.publisher.model.Payment;
import com.ikea.publisher.service.storage.PaymentStorageRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

@ExtendWith(MockitoExtension.class)
class PublisherApplicationTests {

    @Mock
    private PaymentStorageRepository paymentStorageRepository;

    @Test
    public void savePayment() {
		Payment payment1 = new Payment(62, "Test", 299, "PLN", "20-06-2022 09:50:00");

        //given
        Answer<Payment> answer = invocationOnMock -> payment1;
        Mockito.when(paymentStorageRepository.save(payment1)).then(answer);

		//when
        Payment payment = paymentStorageRepository.save(payment1);

		//then
		Assertions.assertEquals(payment1, payment);
    }
}