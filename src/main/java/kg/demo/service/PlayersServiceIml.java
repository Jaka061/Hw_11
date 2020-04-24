package kg.demo.service;

import kg.demo.entity.Players;
import kg.demo.repository.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlayersServiceIml implements PlayersService {
        @Autowired
        private PlayersRepository playersRepository;

    @Override
    public Players create(Players players) {
        return playersRepository.save(players);
    }

    @Override
    public Players getByName(String name) {
        return playersRepository.findByName(name);
    }

    @Override
    public List<Players> getAllByNameString(String string) {
        return playersRepository.findAllByNameString(string);
    }

    @Override
    public List<Players> getPlayersByTeam(Long id) {
        return playersRepository.findPlayersByTeam(id);
    }

    @Override
    public List<Players> getAllByStatusAndAgeLessThan(String status, Integer age) {
        return playersRepository.findAllByStatusAndAgeLessThan(status,age);
    }

    @Override
    public Players update(Players players) {
        return playersRepository.save(players);
    }


}
