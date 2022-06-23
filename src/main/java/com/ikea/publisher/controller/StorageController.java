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

/**
 * This class contains endpoints for Publisher Application
 */
@RestController
@AllArgsConstructor
@Slf4j
public class StorageController {

    private final DataStorage dataStorage;

    /**
     * Endpoint saving the Player to the database
     * @param player Model Player description a player
     */
    @RequestMapping(value = "/save/player", method = RequestMethod.POST)
    public void storagePlayer(@RequestBody Player player) {
        dataStorage.createDataForPlayer(player);
        log.info("Player data was stored successfully: " + player.toJson());
    }

    /**
     * Endpoint saving the Competition to the database
     * @param competition Model Competition description a competition
     */
    @RequestMapping(value = "/save/competition", method = RequestMethod.POST)
    public void storageCompetition(@RequestBody Competition competition) {
        dataStorage.createDataForCompetition(competition);
        log.info("Competition data was stored successfully: " + competition.toJson());
    }

    /**
     * Endpoint saving the Payment to the database
     * @param payment Model Payment description a payment
     */
    @RequestMapping(value = "/save/payment", method = RequestMethod.POST)
    public void storageCompetition(@RequestBody Payment payment) {
        dataStorage.createDataForPayment(payment);
        log.info("Payment data was stored successfully: " + payment.toJson());
    }
}