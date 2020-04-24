package kg.demo.controller;

import kg.demo.entity.Teams;
import kg.demo.service.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    private TeamsService teamsService;

    @PostMapping
    public Teams crate (@RequestBody Teams teams){
        return teamsService.create(teams);
    }
    @GetMapping
    public List<Teams> getAll(){
        return teamsService.getAll();
    }
}
