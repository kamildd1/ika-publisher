/**
 * This package includes implementation for DataStorage
 */
package com.ikea.publisher.service.storage;

import com.ikea.publisher.model.Competition;
import com.ikea.publisher.model.Payment;
import com.ikea.publisher.model.Player;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Service contains methods saving data to database
 */
@Service
@Slf4j
@AllArgsConstructor
public class DataStorageImpl implements DataStorage {

    private PlayerStorageRepository playerStorageRepository;
    private CompetitionStorageRepository competitionStorageRepository;
    private PaymentStorageRepository paymentStorageRepository;

    /**
     * This method saving the Player model to database
     * @param player Model Player description a player
     */
    @Override
    public void createDataForPlayer(Player player) {
        try {
            playerStorageRepository.save(player);
        } catch (Exception ex) {
            log.error("Filed to save data player to database " + ex.getMessage());
        }
    }

    /**
     * This method saving the Competition model to database
     * @param competition Model Competition description a competition
     */
    @Override
    public void createDataForCompetition(Competition competition) {
        try {
            competitionStorageRepository.save(competition);
        } catch (Exception ex) {
            log.error("Filed to save data competition to database " + ex.getMessage());
        }
    }

    /**
     * This method saving the Payment model to database
     * @param payment Model Payment description a payment
     */
    @Override
    public void createDataForPayment(Payment payment) {
        try {
            paymentStorageRepository.save(payment);
        } catch (Exception ex) {
            log.error("Filed to save payment to database " + ex.getMessage());
        }
    }
}