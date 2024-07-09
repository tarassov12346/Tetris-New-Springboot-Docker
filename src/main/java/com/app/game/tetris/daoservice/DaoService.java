package com.app.game.tetris.daoservice;

import com.app.game.tetris.model.Player;

public interface DaoService {
    public void recordScore(Player player);
    public void retrieveScores();
    public String getBestPlayer();
    public int getBestScore();
}