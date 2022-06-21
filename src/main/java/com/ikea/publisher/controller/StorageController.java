package com.ikea.publisher.controller;

import com.ikea.publisher.model.Competition;
import com.ikea.publisher.model.Payment;
import com.ikea.publisher.model.Player;
import com.ikea.publisher.service.storage.DataStorage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class StorageController {

    private final DataStorage dataStorage;

    @RequestMapping(value = "/save/player", method = RequestMethod.POST)
    public void storagePlayer(@RequestBody Player player) {
        dataStorage.createDataForPlayer(player);
        log.info("Player data was stored successfully: " + player.toJson());
    }

    @RequestMapping(value = "/save/competition", method = RequestMethod.POST)
    public void storageCompetition(@RequestBody Competition competition) {
        dataStorage.createDataForCompetition(competition);
        log.info("Competition data was stored successfully: " + competition.toJson());
    }

    @RequestMapping(value = "/save/payment", method = RequestMethod.POST)
    public void storageCompetition(@RequestBody Payment payment) {
        dataStorage.createDataForPayment(payment);
        log.info("Payment data was stored successfully: " + payment.toJson());
    }
}