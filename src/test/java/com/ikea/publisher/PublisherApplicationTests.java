package com.ikea.publisher;

import com.ikea.publisher.model.Competition;
import com.ikea.publisher.model.Payment;
import com.ikea.publisher.model.Player;
import com.ikea.publisher.service.storage.CompetitionStorageRepository;
import com.ikea.publisher.service.storage.PaymentStorageRepository;
import com.ikea.publisher.service.storage.PlayerStorageRepository;
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

    @Mock
    private CompetitionStorageRepository competitionStorageRepository;

    @Mock
    private PlayerStorageRepository playerStorageRepository;

    @Test
    public void savePayment() {
        //given
        Payment payment1 = new Payment(62, "Test", 299, "PLN", "20-06-2022 09:50:00");
        Answer<Payment> answer = invocationOnMock -> payment1;
        Mockito.when(paymentStorageRepository.save(payment1)).then(answer);
		//when
        Payment payment = paymentStorageRepository.save(payment1);
		//then
		Assertions.assertEquals(payment1, payment);
    }

    @Test
    public void saveCompetition(){
        //given
        Competition competition1 = new Competition(22, 22, "Junior", "Mężczyzna", "Ostatni", "Kowalski");
        Answer<Competition> answer = invocationOnMock -> competition1;
        Mockito.when(competitionStorageRepository.save(competition1)).then(answer);
        //when
        Competition competition = competitionStorageRepository.save(competition1);
        //then
        Assertions.assertEquals(competition1, competition);
    }

    @Test
    public void savePlayer(){
        //given
        Player player1 = new Player(552, "Jan", "Kowalski", 20-12-2000, "Warszawa", "Pierwszy", "Mężczyzna");
        Answer<Player> answer = invocationOnMock -> player1;
        Mockito.when(playerStorageRepository.save(player1)).then(answer);
        //when
        Player player = playerStorageRepository.save(player1);
        //then
        Assertions.assertEquals(player1, player);
    }
}