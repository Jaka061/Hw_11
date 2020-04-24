package kg.demo.service;

import kg.demo.entity.Teams;
import kg.demo.repository.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamsService {
    @Autowired
    private TeamsRepository teamsRepository;

    @Override
    public Teams create(Teams teams) {
        return teamsRepository.save(teams);
    }
    @Override
    public List<Teams> getAll() {
        return teamsRepository.findAll();
    }
}
