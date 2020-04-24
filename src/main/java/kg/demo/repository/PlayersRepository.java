package kg.demo.repository;

import kg.demo.entity.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayersRepository extends JpaRepository<Players , Long> {
    Players findByName(String name);
    List<Players> findAllByNameString(String string);
    List<Players> findPlayersByTeam(Long id);
    List<Players> findAllByStatusAndAgeLessThan(String status , Integer age);
}
