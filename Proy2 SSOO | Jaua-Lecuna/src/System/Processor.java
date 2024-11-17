/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

import Disk.Buffer;
import Interfaces.Interface;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import Characters.Character;
import Types.CharacterType;
import Types.PriorityLevel;

/**
 * Class that emulates a processor and is responsible for choosing the fighters and winners
 * @author ani
 */
public class Processor extends Thread{
    
    private Buffer buffer;
    private Interface mainWindow;

    public Processor(Buffer buffer, Interface mainWindow) {
        this.buffer = buffer;
        this.mainWindow = mainWindow;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("p1");
            try {
                try {
                    System.out.println("p3");
                    getBuffer().getSemaphore2().release();
                    getBuffer().getSemaphore1().acquire();
                    System.out.println("p4");
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("p2");
                getMainWindow().getResult().setText("Seleccionando");
                getMainWindow().getStarWarsName().setText("");
                getMainWindow().getStarTreckName2().setText("");
                getMainWindow().getStarWarsTipoCarta().setText("");
                getMainWindow().getStarTreckTipoCarta().setText("");
                getMainWindow().getStarWarsPlayer().setIcon(null);
                getMainWindow().getStarTreckPlayer().setIcon(null);
                getMainWindow().getStarWarsID().setText("None");
                getMainWindow().getStarTreckID().setText("None");
                sleep((long)getBuffer().getSimLoad());
                System.out.println(getBuffer().getSimLoad());

                Character starWarsFighter = getBuffer().getStarWarsFighter();
                Character starTrekFighter = getBuffer().getStarTrekFighter();
                getMainWindow().getStarWarsID().setText(Integer.toString(getBuffer().getStarWarsFighter().getId()));
                getMainWindow().getStarTreckID().setText(Integer.toString(getBuffer().getStarTrekFighter().getId()));

                // The chosen fighters are displayed in the main window
                if (starWarsFighter != null && starTrekFighter != null) {
                    System.out.println(starWarsFighter.getName() + "vs" + starTrekFighter.getName());
                    getMainWindow().getStarWarsName().setText(starWarsFighter.getName());
                    getMainWindow().getStarTreckName2().setText(starTrekFighter.getName());

                    //ImageIcon card = new ImageIcon(getCardType(starWarsFighter.getType(), starWarsFighter.getFranchise()));
                    getMainWindow().getStarWarsTipoCarta().setText(getCharacterType(starWarsFighter.getType()));
                    //card = new ImageIcon(getCardType(starTrekFighter.getType(), starTrekFighter.getCompany()));
                    getMainWindow().getStarTreckTipoCarta().setText(getCharacterType(starTrekFighter.getType()));

                    ImageIcon icon = new ImageIcon(starWarsFighter.getImgPath());
                    getMainWindow().getStarWarsPlayer().setIcon(icon);
                    icon = new ImageIcon(starTrekFighter.getImgPath());
                    getMainWindow().getStarTreckPlayer().setIcon(icon);

                    getMainWindow().getResult().setText("Decidiendo");
                    sleep((long)getBuffer().getSimSpeed());

                    // A random number is selected to determine the winner
                    double prob = Math.random();

                    // If the probability is less or equal than 0.4 then the characters will fight 
                    if (prob <= 0.4) {
                        System.out.println("fight");
                        boolean result = chooseWinner(starWarsFighter, starTrekFighter);
                        
                        // Star Wars wins
                        if (result) {
                            getBuffer().getStarWarsWinners().queueCharacter(starWarsFighter, starWarsFighter.getId(), 0);
                            getMainWindow().getResult().setText("Gana Star Wars!🪐");
                            int starWarsWins = Integer.parseInt(getMainWindow().getStarWarsNumWin().getText());
                            starWarsWins++;
                            getMainWindow().getStarWarsNumWin().setText(String.valueOf(starWarsWins));
                        
                        // Star Trek Wins
                        } else {
                            getBuffer().getStarTrekWinners().queueCharacter(starTrekFighter, starTrekFighter.getId(), 0);
                            getMainWindow().getResult().setText("Gana Star Trek!🖖🏼");
                            int starTrekWins = Integer.parseInt(getMainWindow().getStarTreckNumWin().getText());
                            starTrekWins++;
                            getMainWindow().getStarTreckNumWin().setText(String.valueOf(starTrekWins));
                            
                        }
                        getBuffer().setStarWarsFighter(null);
                        getBuffer().setStarTrekFighter(null);
                      
                    // If the probability is greater than 0.4 and less or equal than 0.67 then the result is a tie
                    } else if (prob <= 0.67) {
                        getMainWindow().getResult().setText("Empate");
                        
                        starWarsFighter.setPriority(PriorityLevel.HighPriority);
                        starTrekFighter.setPriority(PriorityLevel.HighPriority);
                       
                       
                    // If the probability is greater than 0.67 then the fight is not posible
                    } else {
                        getMainWindow().getResult().setText("No es posible");
                                                
                        starWarsFighter.setPriority(PriorityLevel.Reinforcement);
                        starTrekFighter.setPriority(PriorityLevel.Reinforcement);
                                             
                    }
                     
                    sleep((long)getBuffer().getNextSim());

                }

            } catch (InterruptedException ex) {
                System.out.println(ex);
                Logger.getLogger(Processor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * Method that chooses the winner of a fight between two characters
     * @param starWars the star wars fighter
     * @param starTrek the star trek fighter
     * @return true if star wars wins, false if star trek wins
     */
    public boolean chooseWinner(Character starWars, Character starTrek) {
        // If the star wars character type id is greater than the star trek's then star wars wins
        if (starWars.getType().getId() > starTrek.getType().getId()) {
            return true;
            
        // If the star trek character type id is greater than the star wars' then star trek wins  
        } else if (starWars.getType().getId() < starTrek.getType().getId()) {
            return false;
            
        // If both character type ids are the same then a coin toss is executed
        } else {
            int wins = 0;
            for (int i = 0; i < 3; i++) {
                double rand = Math.random();
                wins = (rand < 0.5) ? wins + 1 : wins - 1;
            }
            if (wins > 0) {
                return true; // Star wars wins
            } else if (wins < 0) {
                return false; // Star trek wins

            // If wins is equal to 0 then one more coin toss is executed to determine the winner
            } else {
                double rand = Math.random();
                if (rand < 0.5) {
                    return true; // Star wars wins
                } else {
                    return false; // Star trek wins
                }
            }

        }
    }

    /**
     * Method that returns a string corresponding to a character type 
     * @param type the character type
     * @return a string that will be shown in the GUI corresponding to the character type
     */
    public String getCharacterType(CharacterType type) {
        switch (type) {
            case Legendary:
                return "Peleador Legendario";
            case Expert:
                return "Peleador Experto";
            case Skilled:
                return "Peleador Habilidoso";
            case Average:
                return "Peleador Promedio";
            case Weak:
                return "Peleador Débil";
            }      
        
        return "";
    }

    /**
     * Gets the buffer
     * @return the buffer
     */
    public Buffer getBuffer() {
        return buffer;
    }

    /**
     * Sets a buffer
     * @param buffer buffer to set 
     */
    public void setBuffer(Buffer buffer) {
        this.buffer = buffer;
    }

    /**
     * Gets the main window GUI
     * @return the main window
     */
    public Interface getMainWindow() {
        return mainWindow;
    }

    /**
     * Sets the main window
     * @param mainWindow main window to set 
     */
    public void setMainWindow(Interface mainWindow) {
        this.mainWindow = mainWindow;
    }

    
    
}
