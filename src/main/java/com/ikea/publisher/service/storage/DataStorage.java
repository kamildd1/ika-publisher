/**
 * This package includes methods saving data to database
 */
package com.ikea.publisher.service.storage;


import com.ikea.publisher.model.Competition;
import com.ikea.publisher.model.Payment;
import com.ikea.publisher.model.Player;

/**
 * Interface contains methods saving data to database
 */
public interface DataStorage {
    /**
     * This method saving the Player model to database
     * @param player Model Player description a player
     */
    void createDataForPlayer(Player player);

    /**
     * This method saving the Competition model to database
     * @param competition Model Competition description a competition
     */
    void createDataForCompetition(Competition competition);

    /**
     * This method saving the Payment model to database
     * @param payment Model Payment description a payment
     */
    void createDataForPayment(Payment payment);
}
