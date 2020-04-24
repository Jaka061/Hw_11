package kg.demo.service;

import kg.demo.entity.Players;

import java.util.List;

public interface PlayersService {
    Players create (Players players);
    Players getByName(String name);
    List<Players> getAllByNameString(String string);
    List<Players> getPlayersByTeam(Long id);
    List<Players> getAllByStatusAndAgeLessThan(String status , Integer age);

    Players update (Players players);


}
