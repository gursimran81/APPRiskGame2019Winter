package com.risk.model;


import java.util.ArrayList;
import java.util.Observable;
/**
 * "GamePlayModel" model basically consists of an object that consist of the current map that the game is being played upon
 * and the players that are playing the game.
 */

public class GamePlayModel extends Observable
{
    /** MapRiskmodel
     */
    private MapRiskModel mapRiskModelModObj;

    /** current players playing the game*/
    private ArrayList<PlayerModel> currentPlayerModels;

    /** All the cards*/
    private ArrayList<CardModel> deckOfCards;

    /** if country owned*/
    private boolean ifCountryOwned;

    private String PhaseOfGame = null;

    /**
     * Default Constructor.
     */
    public GamePlayModel(MapRiskModel mapRiskModelModObj, ArrayList<PlayerModel> currentPlayerModels, ArrayList<CardModel> deckOfCards, boolean ifCountryOwned)
    {
        this.mapRiskModelModObj = mapRiskModelModObj;
        this.currentPlayerModels = currentPlayerModels;
        this.deckOfCards = deckOfCards;
        this.ifCountryOwned = ifCountryOwned;
    }

    public MapRiskModel getMapRiskModelModObj() {
        return mapRiskModelModObj;
    }

    public void setMapRiskModelModObj(MapRiskModel mapRiskModelModObj) {
        this.mapRiskModelModObj = mapRiskModelModObj;
    }

    public ArrayList<PlayerModel> getCurrentPlayerModels() {
        return currentPlayerModels;
    }

    public void setCurrentPlayerModels(ArrayList<PlayerModel> currentPlayerModels) {
        this.currentPlayerModels = currentPlayerModels;
    }

    public ArrayList<CardModel> getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(ArrayList<CardModel> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public boolean isIfCountryOwned() {
        return ifCountryOwned;
    }

    public void setIfCountryOwned(boolean ifCountryOwned) {
        this.ifCountryOwned = ifCountryOwned;
    }

    public String getPhaseOfGame() {
        return PhaseOfGame;
    }

    public void setPhaseOfGame(String phaseOfGame) {
        PhaseOfGame = phaseOfGame;
    }
}