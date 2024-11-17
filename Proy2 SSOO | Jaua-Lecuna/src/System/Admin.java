/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

import javax.swing.DefaultListModel;
import Characters.Character; 
import Disk.Buffer;
import Interfaces.Interface;
import Primitives.Node;
import Primitives.Queue;
import Types.PriorityLevel;
import static Types.PriorityLevel.HighPriority;
import static Types.PriorityLevel.MediumPriority;
import static Types.PriorityLevel.LowPriority;
import static Types.PriorityLevel.Reinforcement;

/**
 *
 * @author ani
 */
public class Admin extends Thread{
    private Buffer buffer;
    private Interface mainWindow;
    private int nextID;

    /**
     * Class constructor
     * @param buffer
     * @param main, main window to set
     * @param lastID, id of the last element
     */
    public Admin(Buffer buffer, Interface main, int lastID) {
        this.buffer = buffer;
        this.mainWindow = main;
        this.nextID = lastID + 1;
    }

    @Override
    public void run() {

        while (true) {

            try {
                getBuffer().getSemaphore1().release();
                getBuffer().getSemaphore2().acquire();

            } catch (Exception e) {
            }

            // A new character is inserted if the cycle number is greater than 2 
            if (getBuffer().getCycleNumber() == 2) {
                
                double randomNum = Math.random();

                // If the random number is less than 0.8 then a new character is created 
                if (randomNum <= 0.80) {

                    createNewCharacter();

                }
                // Resets cycle number
                getBuffer().setCycleNumber(0);
            }

            // If there aren't any fighters, new fighters are chosen for each franchise
            if(getBuffer().getStarWarsFighter()!=null && getBuffer().getStarTrekFighter()!=null){
               movetoQueue(getBuffer().getStarWarsFighter());
               movetoQueue(getBuffer().getStarTrekFighter());
               
            }
            updateWindow();

            // The queues are updated depending on the cycle number 
            Queue fullCycleQueueMediumPrioritySW = getBuffer().getStarWarsMediumPriorityQueue().dequeueFullCycle();
            getBuffer().getStarWarsHighPriorityQueue().queueFullCycleNodes(fullCycleQueueMediumPrioritySW, PriorityLevel.HighPriority);

            Queue fullCycleQueueLowPrioritySW = getBuffer().getStarWarsLowPriorityQueue().dequeueFullCycle();
            getBuffer().getStarWarsMediumPriorityQueue().queueFullCycleNodes(fullCycleQueueLowPrioritySW, PriorityLevel.MediumPriority);

            Queue fullCycleQueueMediumPriorityST = getBuffer().getStarTrekMediumPriorityQueue().dequeueFullCycle();
            getBuffer().getStarTrekHighPriorityQueue().queueFullCycleNodes(fullCycleQueueMediumPriorityST, PriorityLevel.HighPriority);

            Queue fullCycleQueueLowPriorityST = getBuffer().getStarTrekLowPriorityQueue().dequeueFullCycle();
            getBuffer().getStarTrekMediumPriorityQueue().queueFullCycleNodes(fullCycleQueueLowPriorityST, PriorityLevel.MediumPriority);

            // The fighters are selected
            Character starWarsFighter = null;
            Character starTrekFighter = null;
 
            if (!buffer.getStarWarsHighPriorityQueue().isEmpty()) {
               
                starWarsFighter = getBuffer().getStarWarsHighPriorityQueue().dequeueCharacter();

            } else if (!buffer.getStarWarsMediumPriorityQueue().isEmpty()) {

                starWarsFighter = getBuffer().getStarWarsMediumPriorityQueue().dequeueCharacter();

            } else if (!buffer.getStarWarsLowPriorityQueue().isEmpty()) {

                starWarsFighter = getBuffer().getStarWarsLowPriorityQueue().dequeueCharacter();

            }
            

            if (!buffer.getStarTrekHighPriorityQueue().isEmpty()) {

                starTrekFighter = getBuffer().getStarTrekHighPriorityQueue().dequeueCharacter();

            } else if (!buffer.getStarTrekMediumPriorityQueue().isEmpty()) {

                starTrekFighter = getBuffer().getStarTrekMediumPriorityQueue().dequeueCharacter();

            } else if (!buffer.getStarTrekLowPriorityQueue().isEmpty()) {

                starTrekFighter = getBuffer().getStarTrekLowPriorityQueue().dequeueCharacter();

            }
           

            // Reinforcement queue handling
            double randomNum2 = Math.random();
           
            // If the random number is less than 0.4 then new fighters are added 
            if (randomNum2 <= 0.40) {

                if (!buffer.getStarWarsReinforcementQueue().isEmpty()) {

                    Node newFighterSW = getBuffer().getStarWarsReinforcementQueue().dequeueNode();
                    newFighterSW.getCharacter().setPriority(HighPriority);
                    getBuffer().getStarWarsHighPriorityQueue().queueNode(newFighterSW);

                }
                if (!buffer.getStarTrekReinforcementQueue().isEmpty()) {

                    Node newFighterST = getBuffer().getStarTrekReinforcementQueue().dequeueNode();
                    newFighterST.getCharacter().setPriority(HighPriority);
                    getBuffer().getStarTrekHighPriorityQueue().queueNode(newFighterST);

                }
            }

            updateWindow();
            getBuffer().setStarWarsFighter(starWarsFighter);
            getBuffer().setStarTrekFighter(starTrekFighter);
            
            getBuffer().setCycleNumber(getBuffer().getCycleNumber()+ 1);
            
        }
    }

    /**
     * Method that updates the data shown in the GUI
     */
    public void updateWindow() {
        updateQueues(getMainWindow().getStarWarsNivel4(), getBuffer().getStarWarsReinforcementQueue());
        updateQueues(getMainWindow().getStarTreckNivel4(), getBuffer().getStarTrekReinforcementQueue());
        updateQueues(getMainWindow().getStarWarsNivel1(), getBuffer().getStarWarsHighPriorityQueue());
        updateQueues(getMainWindow().getStarTreckNivel1(), getBuffer().getStarTrekHighPriorityQueue());
        updateQueues(getMainWindow().getStarWarsNivel2(), getBuffer().getStarWarsMediumPriorityQueue());
        updateQueues(getMainWindow().getStarTreckNivel2(), getBuffer().getStarTrekMediumPriorityQueue());
        updateQueues(getMainWindow().getStarWarsNivel3(), getBuffer().getStarWarsLowPriorityQueue());
        updateQueues(getMainWindow().getStarTreckNivel3(), getBuffer().getStarTrekLowPriorityQueue());

    }

    /**
     * Method that turns a queue into a JList for the GUI
     * @param list, current JList shown
     * @param queue, queue to be shown 
     */
    public void updateQueues(javax.swing.JList<String> list, Queue queue) {
        
        DefaultListModel model = new DefaultListModel();
        list.setModel(model);
        String[] elements = queue.toArray();
        if (elements != null) {
            for (String element : elements) {
                model.addElement(element);
            }
        }

    }

    /**
     * Method that creates a new character
     */
    public void createNewCharacter() {
        int random = (int) Math.round(Math.random() * 19);
        Character starWarsCharacter;
        Character starTrekCharacter;
        try {
            starWarsCharacter = new Character(getBuffer().getStarWarsCharacters()[random]);
            starTrekCharacter = new Character(getBuffer().getStarTrekCharacters()[random]);     
            starWarsCharacter.setId(getNextID());
            movetoQueue(starWarsCharacter);
            starTrekCharacter.setId(getNextID() + 1);
            movetoQueue(starTrekCharacter);
            setNextID(getNextID() + 2);
        } catch (Exception e) {
            
        }

    }

    /**
     * Method that moves a character to a queue depending on their priority
     * @param fighter character to move
     */
    public void movetoQueue(Character fighter) {
        switch (fighter.getFranchise()) {
            case StarWars:
                switch (fighter.getPriority()) {
                    case Reinforcement:
                        getBuffer().getStarWarsReinforcementQueue().queueCharacter(fighter, fighter.getId(), 0);
                        break;
                    case LowPriority:
                        getBuffer().getStarWarsLowPriorityQueue().queueCharacter(fighter, fighter.getId(), 0);
                        break;
                    case MediumPriority:
                        getBuffer().getStarWarsMediumPriorityQueue().queueCharacter(fighter, fighter.getId(), 0);
                        break;
                    case HighPriority:
                        getBuffer().getStarWarsHighPriorityQueue().queueCharacter(fighter, fighter.getId(), 0);
                        break;

                }
                break;
            case StarTrek:
                switch (fighter.getPriority()) {
                    case Reinforcement:
                        getBuffer().getStarTrekReinforcementQueue().queueCharacter(fighter, fighter.getId(), 0);                      
                        break;
                    case LowPriority:
                        getBuffer().getStarTrekLowPriorityQueue().queueCharacter(fighter, fighter.getId(), 0);
                        break;
                    case MediumPriority:
                        getBuffer().getStarTrekMediumPriorityQueue().queueCharacter(fighter, fighter.getId(), 0);
                        break;
                    case HighPriority:
                        getBuffer().getStarTrekHighPriorityQueue().queueCharacter(fighter, fighter.getId(), 0);
                        break;

                }
                break;
        }

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
     * @param buffer to set
     */
    public void setBuffer(Buffer buffer) {
        this.buffer = buffer;
    }

    /**
     * Gets the next ID
     * @return the id
     */
    public int getNextID() {
        return nextID;
    }

    /**
     * Sets the next ID
     * @param nextID to set
     */
    public void setNextID(int nextID) {
        this.nextID = nextID;
    }
    
    /**
     * Gets the main window
     * @return the main window
     */
    public Interface getMainWindow() {
        return mainWindow;
    }

    /**
     * Sets the main window
     * @param mainWindow window to set 
     */
    public void setMainWindow(Interface mainWindow) {
        this.mainWindow = mainWindow;
    }
     
    

}
