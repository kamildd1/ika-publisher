package com.ikea.publisher;

import com.ikea.publisher.model.Payment;
import com.ikea.publisher.model.Player;
import com.ikea.publisher.service.storage.CompetitionStorageRepository;
import com.ikea.publisher.service.storage.DataStorageImpl;
import com.ikea.publisher.service.storage.PaymentStorageRepository;
import com.ikea.publisher.service.storage.PlayerStorageRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

@RunWith(MockitoJUnitRunner.class)
class PublisherApplicationTests {

	@InjectMocks
	private DataStorageImpl dataStorage;

	@Mock
	private CompetitionStorageRepository competitionStorageRepository;

	@Mock
	private PaymentStorageRepository paymentStorageRepository;

	@Mock
	private PlayerStorageRepository playerStorageRepository;

	@Mock
	private Player player;

	@Mock
	private Payment payment;

//	@Test
//	public void savePlayer(){
//		//given
//		InputStream testInputStream = new ByteArrayInputStream("test photo".getBytes());
//		player = new Player(1500, 2000, "Testowy Kuba", "Test", 22-10-1980, "Warszawa", "Ostatnie", "Mężczyzna", testInputStream);
//		paymentStorageRepository.save(player);
//	}


}