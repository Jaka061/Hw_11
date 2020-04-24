package kg.demo.service;

import kg.demo.entity.Teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeamsService {
    Teams create (Teams teams);
    List<Teams> getAll();

}
