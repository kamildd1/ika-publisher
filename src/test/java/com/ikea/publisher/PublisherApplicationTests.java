package com.ikea.publisher;


import com.ikea.publisher.model.Competition;
import com.ikea.publisher.model.Player;
import com.ikea.publisher.service.storage.DataStorage;
import com.ikea.publisher.service.storage.DataStorageImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PublisherApplicationTests {

	private final Player player = new Player("Jan", "Kowalski", "cc", "25", "M");

//	@Mock
//	private DataStorageImpl dataStorageImpl;
//
//	@InjectMocks
//	DataStorage data = new DataStorage() {
//		@Override
//		public void createDataForPlayer(Player player) {
//
//		}
//
//		@Override
//		public void createDataForCompetition(Competition competition) {
//
//		}
//
//		@Override
//		public Player getData(String id) {
//			return null;
//		}

	@Test
	void contextLoads() {
	}
};
//	@Test
//	void checkPlayer(Player player){
//		data.createDataForPlayer(player);
//
//	}
//}
