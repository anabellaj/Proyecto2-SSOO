/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Characters;

import Types.CharacterType;
import Types.FranchiseType;
import Types.PriorityLevel;

/**
 * Class that describes the attributes and behavior of a character 
 * @author ani
 */
public class Character {
    
    /**
     * Class attributes
     */
    private String name;
    private int id;
    private FranchiseType franchise;
    private PriorityLevel priority;
    private CharacterType type;
    private String imgPath;
    
    /**
     * Class character constructor 
     * @param name, name of the character
     * @param id, id of the character
     * @param franchise, franchise to which the character belongs to 
     * @param imgPath, path to the image of the character
     */
    public Character(String name, int id, FranchiseType franchise, String imgPath) {
        this.name = name;
        this.id = id;
        this.franchise = franchise;
        this.imgPath= imgPath;
        this.defineCharacterType();
    }
    
    /**
     * Method that creates a copy of a character
     * @param clone character to clone
     */
    public Character(Character clone){
        this.franchise = clone.getFranchise();
        this.name = clone.getName();
        this.defineCharacterType();
        this.imgPath = clone.getImgPath();
    }
    
    /**
     * Method that defines the character type 
     */
    public void defineCharacterType(){
        
        boolean[] type = new boolean[4];
        double[] base = {0.7,0.6,0.5,0.4};
        double prob;
        
        // Assign a boolean value to the type array elements depending on the random number
        for (int i = 0; i < 4; i++) {
            prob = Math.random();
            type[i] = (prob<=base[i]);
        }
        
        // Legendary character
        if(type[2]&&type[3]){
            this.type = CharacterType.Legendary;
        }
        
        // Expert character
        else if(type[2]||type[3]){
            this.type = CharacterType.Expert;
        }
        
        // Skilled character
        else if(type[1]||type[0]){
            this.type = CharacterType.Skilled;
        }
        
        // Weak character
        else if(!type[1]&&!type[0]){
            this.type = CharacterType.Weak;
            System.out.println(name);
        }
        
        // Average character
        else{
            this.type = CharacterType.Average;
        }
        
        // Defines the priority of each character type
        // Weak & Average = Low Priority, Skilled & Expert = Medium Priority, Legendary = High Priority
        switch(this.type){
            case Weak:
                this.priority = PriorityLevel.LowPriority;
                break;
            case Average:
                this.priority = PriorityLevel.LowPriority;
                break;
            case Skilled:
                this.priority =  PriorityLevel.MediumPriority;
                break;
            case Expert:
                this.priority =  PriorityLevel.MediumPriority;
                break;
            case Legendary:
                this.priority =   PriorityLevel.HighPriority;
                break;
        }
    }

    /**
     * Gets the name of the character
     * @return the character name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the character
     * @param name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the id of the character
     * @return the character id 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id of the character
     * @param id to set 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the franchise of the character
     * @return the character franchise
     */
    public FranchiseType getFranchise() {
        return franchise;
    }

    /**
     * Sets the franchise of the character
     * @param franchise to set
     */
    public void setFranchise(FranchiseType franchise) {
        this.franchise = franchise;
    }

    /**
     * Gets the priority level of the character
     * @return the character priority level
     */
    public PriorityLevel getPriority() {
        return priority;
    }

    /**
     * Sets the priority of the character
     * @param priority to set
     */
    public void setPriority(PriorityLevel priority) {
        this.priority = priority;
    }
    
    /**
     * Gets the type of the character
     * @return the character type
     */
    public CharacterType getType() {
        return type;
    }

    /**
     * Sets the type of the character
     * @param type to set
     */
    public void setType(CharacterType type) {
        this.type = type;
    }

    /**
     * Gets the image path to the character's photo
     * @return the character's image path
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * Sets the image path to the character's photo
     * @param imgPath to set
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    
    
    
}
