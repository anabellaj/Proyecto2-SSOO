/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primitives;

import Types.PriorityLevel;
import Characters.Character;

/**
 *
 * @author ani
 */
public class Queue {
    
    private Node front;
    private Node back; 
    private int length; 
    
    /**
     * Checks if the queue is currently empty
     * @return true if empty, else false
     */
    public boolean isEmpty() {
        return getFront() == null;
    }

    /**
     * Method that empties the queue by deleting all its elements
     */
    public void empty() {
        this.front = null;
        this.back = null;
        this.length = 0;
    }

    /**
     * Method that de-queues the nodes that have already passed 8 cycles in the queue to prevent starvation and adjusts the cycle number
     * @return the new queue of nodes that have already passed 8 cycles
     */
    public Queue dequeueFullCycle() {
        Queue auxQ = new Queue();
        int queueSize = getLength();
        for (int i = 0; i < queueSize; i++) {
            
            Node auxNode = dequeueNode();
            if(auxNode != null){
            if (auxNode.getCycleNumber() == 8 ) {
                auxNode.setCycleNumber(0);
                auxQ.queueNode(auxNode);
                
            }else {
               
                auxNode.setCycleNumber(auxNode.getCycleNumber() + 1);
               
                queueNode(auxNode);

            } }
        }

        return auxQ;
    }

    /**
     * Methods that en-queues the nodes that have already passed 8 cycles to a queue with a higher priority level
     * @param cycleQueue, the queue to which the nodes will be en-queued
     * @param newPriority, the priority of the new queue
     */
    public void queueFullCycleNodes(Queue cycleQueue, PriorityLevel newPriority) {
        
        if(!cycleQueue.isEmpty()){
            Node auxNode = cycleQueue.dequeueNode();
            
                while(auxNode != null){                            
                    auxNode.getCharacter().setPriority(newPriority);
                    queueNode(auxNode);
                    auxNode = cycleQueue.dequeueNode();
                }  
                
            }
    }

    /**
     * Method that adds a character to the end of the queue
     * @param character to add to the queue
     * @param id of the character to add to the queue
     * @param cycle the initial cycle number 
     */
    public void queueCharacter(Character character, int id, int cycle) {
        Node newNode = new Node(character, id, cycle);
        if (isEmpty()) {
            setFront(newNode);
            setBack(newNode);

        } else {
            getBack().setNext(newNode);
            setBack(newNode);

        }
        setLength(getLength() + 1);

    }

    /**
     * Method that adds a node to the end of the queue
     * @param newNode node to add to the queue
     */
    public void queueNode(Node newNode) {
        newNode.setNext(null);
        if (isEmpty()) {
            setFront(newNode);
            setBack(newNode);

        } else {
            getBack().setNext(newNode);
            setBack(newNode);

        }
        setLength(getLength() + 1);

    }

    /**
     * Method that de-queues the first node of the queue
     * @return the first node of the queue 
     */
    public Node dequeueNode() {
        Node firstNode = null;
        if (!isEmpty()) {
            firstNode = getFront();

            setFront(getFront().getNext());
            setLength(getLength() + 1);

        }
        return firstNode;
    }

    /**
     * Method that de-queues the first character of the queue
     * @return the first character of the queue
     */
    public Character dequeueCharacter() {
        Character firstCharacter = null;

        if (!isEmpty()) {
            firstCharacter = getFront().getCharacter();
            dequeueNode();
        }
        return firstCharacter;
    }

    /**
     * Method that turns the character queue into an array
     * @return the character array 
     */
    public String[] toArray() {
        try {
            if (!isEmpty()) {
                String[] array = new String[getLength()];
                Node characterNode = null;
                for (int i = 0; i < array.length; i++) {
                    characterNode = dequeueNode();
                    array[i] = characterNode.getId() + ": " + characterNode.getCharacter().getName();
                    queueNode(characterNode);
                }

                return array;

            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }    

    /**
     * Gets the first node of the queue
     * @return the first node of the queue
     */
    public Node getFront() {
        return front;
    }

    /**
     * Sets the first node of the queue
     * @param front, node to set as the first node of the queue
     */
    public void setFront(Node front) {
        this.front = front;
    }

    /**
     * Gets the last node of the queue
     * @return the last node of the queue
     */
    public Node getBack() {
        return back;
    }

    /**
     * Sets the last node of the queue
     * @param back, node to set as the last node of the queue 
     */
    public void setBack(Node back) {
        this.back = back;
    }

    /**
     * Gets the current length of the queue
     * @return the length of the queue
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the current length of the queue
     * @param length to set 
     */
    public void setLength(int length) {
        this.length = length;
    }
    
    
    
}
