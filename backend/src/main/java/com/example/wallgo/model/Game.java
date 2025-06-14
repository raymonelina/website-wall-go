package com.example.wallgo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String boardState;

    private Long playerOneId;
    private Long playerTwoId;

    private boolean aiOpponent;

    public Game() {}

    public Game(Long playerOneId, boolean aiOpponent) {
        this.playerOneId = playerOneId;
        this.aiOpponent = aiOpponent;
        this.boardState = ""; // placeholder
    }

    // getters and setters omitted for brevity
    public Long getId() {return id;}
    public String getBoardState() {return boardState;}
    public void setBoardState(String boardState) {this.boardState = boardState;}
    public Long getPlayerOneId() {return playerOneId;}
    public void setPlayerOneId(Long playerOneId) {this.playerOneId = playerOneId;}
    public Long getPlayerTwoId() {return playerTwoId;}
    public void setPlayerTwoId(Long playerTwoId) {this.playerTwoId = playerTwoId;}
    public boolean isAiOpponent() {return aiOpponent;}
    public void setAiOpponent(boolean aiOpponent) {this.aiOpponent = aiOpponent;}
}
