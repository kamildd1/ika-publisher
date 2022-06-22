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
import java.math.BigInteger;

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
        Payment payment = Payment.builder()
                .idPayments(BigInteger.valueOf(62))
                .firstName("Test")
                .price(299L)
                .typeOfPrice("PLN")
                .dateAndTime("20-06-2022 11:59:59")
                .build();

        Answer<Payment> answer = invocationOnMock -> payment;
        Mockito.when(paymentStorageRepository.save(payment)).then(answer);
		//when
        Payment payment1 = paymentStorageRepository.save(payment);
		//then
		Assertions.assertEquals(payment, payment1);
    }

    @Test
    public void saveCompetition(){
        //given
        Competition competition = Competition.builder()
                .idPayments(BigInteger.valueOf(622))
                .id(12344L)
                .category("Junior")
                .sex("Mężczyzna")
                .vintage("Pierwszy")
                .lastName("Nowak")
                .build();

        Answer<Competition> answer = invocationOnMock -> competition;
        Mockito.when(competitionStorageRepository.save(competition)).then(answer);
        //when
        Competition competition1 = competitionStorageRepository.save(competition);
        //then
        Assertions.assertEquals(competition, competition1);
    }

    @Test
    public void savePlayer(){
        //given
        Player player = Player.builder()
                .id(BigInteger.valueOf(6222))
                .firstName("Jan")
                .lastName("Kowalski")
                //.dateOfBirth(1999-10-12)
                .club("Warszawa")
                .degree("Drugi")
                .sex("Mężczyzna")
                .build();

        Answer<Player> answer = invocationOnMock -> player;
        Mockito.when(playerStorageRepository.save(player)).then(answer);
        //when
        Player player1 = playerStorageRepository.save(player);
        //then
        Assertions.assertEquals(player, player1);
    }
}