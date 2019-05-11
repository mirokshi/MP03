/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp03proyect;

import java.io.Serializable;

/**
 *
 * @author mirokshi
 */
public class Puntuaciones implements Serializable{
 
    private String namePlayer;
    private int scorePlayer;

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int getScorePlayer() {
        return scorePlayer;
    }

    public void setScorePlayer(int scorePlayer) {
        this.scorePlayer = scorePlayer;
    }

    @Override
    public String toString() {
        return  "Jugador: " + namePlayer + " puntuacion: " + scorePlayer;
    }
    
    
    
}
