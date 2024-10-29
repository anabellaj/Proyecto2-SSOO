/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Types;

/**
 * Class that defines an unique ID for each character type regarding their skills
 * @author ani
 */
public enum CharacterType {
    
    // ID Legendary = 4; ID Expert = 3; ID Skilled = 2; ID Average = 1; ID Weak = 0  
    Legendary(4),
    Expert(3),
    Skilled(2),
    Average(1),
    Weak(0);
    
     private final int id;
    
    private CharacterType (int id){
        this.id = id;
    }

    /**
     * Method that returns the id 
     * @return the id of the character type 
     */
    public int getId() {
        return id;
    }
    
}
