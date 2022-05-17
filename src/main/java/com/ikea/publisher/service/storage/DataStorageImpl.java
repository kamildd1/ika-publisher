package com.ikea.publisher.service.storage;

import com.ikea.publisher.model.Competition;
import com.ikea.publisher.model.Player;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class DataStorageImpl implements DataStorage {

    private PlayerStorageRepository playerStorageRepository;
    private CompetitionStorageRepository competitionStorageRepository;

    @Override
    public void createDataForPlayer(Player player) {
        try {
            playerStorageRepository.save(player);
        } catch (Exception ex) {
            log.error("Filed to save data player to database " + ex.getMessage());
        }
    }

    @Override
    public void createDataForCompetition(Competition competition) {
        try {
            competitionStorageRepository.save(competition);
        } catch (Exception ex) {
            log.error("Filed to save data competition to database " + ex.getMessage());
        }
    }

    @Override
    public Player getData(String id) {
        Optional<Player> findData = playerStorageRepository.findById(id);
        if (findData.isEmpty()) {
            return null;
        } else {
            return findData.get();
        }
    }
}
