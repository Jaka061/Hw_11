package kg.demo.controller;

import kg.demo.entity.Players;
import kg.demo.service.PlayersService;
import kg.demo.service.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayersService playerService;

    @PostMapping
    public Players create(@RequestBody Players player){
        return playerService.create(player);
    }

    @GetMapping("/name-{name}")
    public Players getByName(@PathVariable String name){
        return playerService.getByName(name);
    }

    @GetMapping("/nameString-{string}")
    public List<Players> getAllByNameString(@PathVariable String string){
        return playerService.getAllByNameString(string);
    }

    @GetMapping("/teamId-{id}")
    public List<Players> getPlayersByTeam(@PathVariable Long id){
        return playerService.getPlayersByTeam(id);
    }

    @GetMapping("/status/{status}/age/{age}")
    public List<Players> getAllByStatusAndAgeLessThan(@PathVariable String status,@PathVariable Integer age){
        return playerService.getAllByStatusAndAgeLessThan(status, age);
    }

    @PutMapping
    public Players update(@RequestBody Players player){
        return playerService.update(player);
    }
}
