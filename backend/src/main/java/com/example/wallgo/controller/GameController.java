package com.example.wallgo.controller;

import com.example.wallgo.model.Game;
import com.example.wallgo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Optional;

@RestController
@RequestMapping("/api/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/start")
    public Game startGame(@RequestParam(defaultValue = "false") boolean ai, Principal principal) {
        // In a real implementation, get user id from principal
        Long userId = 1L; // placeholder
        return gameService.createGame(userId, ai);
    }

    @GetMapping("/{id}")
    public Optional<Game> getGame(@PathVariable Long id) {
        return gameService.getGame(id);
    }

    @PostMapping("/{id}/state")
    public Game updateState(@PathVariable Long id, @RequestBody Game game) {
        // placeholder: update board state
        return gameService.save(game);
    }
}
