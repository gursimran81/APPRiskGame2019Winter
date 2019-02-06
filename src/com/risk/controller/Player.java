package com.risk.controller;

import com.risk.model.GamePlay;
import com.risk.view.Reinforcement;
import com.risk.view.Attack;
import com.risk.view.Fortification;


import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

/** The player class in the controller package will facilitate the data flow into the
 * model object and update the view whenever the data is changed.
 * @author Karan
 */

/* testing the change*/
public class Player implements ActionListener, ItemListener
{
/** the game play model*/
    private GamePlay GamePlayObj;

    /** The Reinforcement view*/
    private Reinforcement reinforcementViewObj;

    /** the Attack view*/
    private Attack attackViewObj;

    /** The Fortication view*/
    private Fortification forticationviewObj;


    /** This is the method that is required if we implement the Action Listener. This method will perform the action
     * after listening to the action event set in the view.
     * @param actionEvent
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {

    }

    public void itemStateChanged(ItemEvent itemEvent)
    {

    }

}
