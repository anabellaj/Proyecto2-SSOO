/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Types;

/**
 * Class that defines an unique ID for each franchise
 * @author ani
 */
public enum FranchiseType {
    
    // ID StarWars = 0; ID StarTrek = 1
    StarWars(0),
    StarTrek(1),;
    
    private final int id;
    
    
    private FranchiseType(int id){
        this.id = id;
    }

    /**
     * Method that returns the id 
     * @return the id of the company 
     */
    public int getId() {
        return id;
    }
    
    
    
    
}
