package com.ikea.publisher.service.storage;


import com.ikea.publisher.model.Competition;
import com.ikea.publisher.model.Payment;
import com.ikea.publisher.model.Player;

public interface DataStorage {

    void createDataForPlayer(Player player);

    void createDataForCompetition(Competition competition);

    Player getData(String id);

    void createDataForPayment(Payment payment);
}
