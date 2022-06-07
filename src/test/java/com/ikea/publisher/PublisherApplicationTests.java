package com.ikea.publisher;

import com.ikea.publisher.model.Competition;
import com.ikea.publisher.model.Payment;
import com.ikea.publisher.model.Player;
import com.ikea.publisher.service.storage.CompetitionStorageRepository;
import com.ikea.publisher.service.storage.DataStorageImpl;
import com.ikea.publisher.service.storage.PaymentStorageRepository;
import com.ikea.publisher.service.storage.PlayerStorageRepository;
import com.mongodb.lang.Nullable;
import com.sun.istack.NotNull;
import net.minidev.json.JSONObject;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

@RunWith(MockitoJUnitRunner.class)
//@RunWith(SpringRunner.class)
class PublisherApplicationTests {

	@InjectMocks
	private DataStorageImpl dataStorage;

	@MockBean
	private CompetitionStorageRepository competitionStorageRepository;

	@MockBean
	private PaymentStorageRepository paymentStorageRepository;

	@MockBean
	private PlayerStorageRepository playerStorageRepository;

	@MockBean
	private Player player;

	@MockBean
	private Payment payment;

	@MockBean
	private Competition competition;

//	@Test
//	public void savePlayer(){
//		InputStream testInputStream = new ByteArrayInputStream("test photo".getBytes());
//		player = new Player(1500, 2000, "Testowy Kuba", "Test", "Warszawa", "Ostatnie", "Mężczyzna", testInputStream);
//		player.toString();
//		Mockito.when(playerStorageRepository.save(player)).thenReturn(player);
//		playerStorageRepository.save(player);
//		Assertions.assertNotNull(playerStorageRepository);

//		player = playerStorageRepository.save(new Player(1500, 2000, "Testowy Kuba", "Test", "Warszawa", "Ostatnie", "Mężczyzna", testInputStream));
//		Assertions.assertNotNull(playerStorageRepository);
//	}

//	@Test
//	public void savePayment(){
//		payment = new Payment(200, "Testowy", "Patryk", 200, "Mazowsze");
//		paymentStorageRepository.save(payment);
//		Assertions.assertNotNull(paymentStorageRepository);
//	}
//
//	@Test
//	public void saveCompetition(){
//		competition = new Competition(120, 100, "category", "M", "test", "test");
//		competitionStorageRepository.save(competition);
//		Assertions.assertNotNull(competitionStorageRepository);
//	}
}