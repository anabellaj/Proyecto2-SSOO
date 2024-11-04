/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primitives;

/**
 * Class that describes a node
 * @author ani
 */
public class Node {
    
    // Class attributes
    private int id;
    private Character character;
    private Node next;
    private int cycleNumber;
    
    /**
     * Class constructor
     * @param character to store inside the node
     * @param id of the node
     * @param cycleNumber the numbers of cycles that have passed 
     */
    public Node(Character character, int id, int cycleNumber) {
        this.character = character;
        this.next = null;
        this.id = id;
        this.cycleNumber = cycleNumber;
    }

    /**
     * Gets the id of the node
     * @return the node id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id of the node
     * @param id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the character stored inside the node
     * @return the character stored inside the node
     */
    public Character getCharacter() {
        return character;
    }

    /**
     * Sets the character to store inside the node
     * @param character to store
     */
    public void setCharacter(Character character) {
        this.character = character;
    }

    /**
     * Gets the next node to the actual node
     * @return the next node
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the next node to the actual node
     * @param next node to the actual node
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Gets the current cycle number
     * @return the cycle number
     */
    public int getCycleNumber() {
        return cycleNumber;
    }

    /**
     * Sets the cycle number
     * @param cycleNumber to set 
     */
    public void setCycleNumber(int cycleNumber) {
        this.cycleNumber = cycleNumber;
    }
    
    
    
    
}
