/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Types;

/**
 * Class that defines an unique ID for each priority level
 * @author ani
 */
public enum PriorityLevel {
    
    // ID HighPriority = 0; ID MediumPriority = 1; ID LowPriority = 2; ID Reinforcement = 3; 
    HighPriority(0), 
    MediumPriority(1), 
    LowPriority(2),
    Reinforcement(3);
    
    private final int id;
    
    /**
     * Method that returns the id 
     * @return the id of the priority level
     */
    private PriorityLevel(int id){
        this.id = id;
    }
    
}
