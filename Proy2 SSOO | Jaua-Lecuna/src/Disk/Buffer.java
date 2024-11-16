/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Disk;

import Primitives.Queue;
import java.util.concurrent.Semaphore;

/**
 * Class that emulates the behavior of a buffer, storing the principal data needed for the simulation
 * @author ani
 */
public class Buffer {
    
    // Creates an array for star wars and and array for star trek character, with a size of 20 which is the total number of characters
    private Character[] starWarsCharacters = new Character[20];
    private Character[] starTrekCharacters = new Character[20];
    
    // Creates a queue for star wars winners and a queue for star trek winners
    private Queue starWarsWinners = new Queue();
    private Queue starTrekWinners = new Queue();
    
    // Creates a queue for each priority level for star wars characters
    private Queue starWarsHighPriorityQueue = new Queue();
    private Queue starWarsMediumPriorityQueue = new Queue();
    private Queue starWarsLowPriorityQueue = new Queue();
    private Queue starWarsReinforcementQueue = new Queue();
    
    // Creates a queue for each priority level for star trek characters
    private Queue starTrekHighPriorityQueue = new Queue();
    private Queue starTrekMediumPriorityQueue = new Queue();
    private Queue starTrekLowPriorityQueue = new Queue();
    private Queue starTrekReinforcementQueue = new Queue();
    
    // Semaphors 
    private final Semaphore semaphore1 = new Semaphore(0);
    private final Semaphore semaphore2 = new Semaphore(0);
    
    // Cycle counter
    private int cycleNumber = 0;
    
    // Stores the character chosen as the fighter for each franchise
    private Character starWarsFighter;
    private Character starTrekFighter;
    
    // Settings of the simulation
    private double simSpeed=1000;
    private double nextSim = 4000;
    private double simLoad = 2000;

    
    // Buffer constructor
    public Buffer() {
    }

    /**
     * Gets the array of star wars characters
     * @return the array 
     */
    public Character[] getStarWarsCharacters() {
        return starWarsCharacters;
    }

    /**
     * Sets the array of star wars characters
     * @param starWarsCharacters array to set
     */
    public void setStarWarsCharacters(Character[] starWarsCharacters) {
        this.starWarsCharacters = starWarsCharacters;
    }

    /**
     * Gets the array of star trek characters
     * @return the array
     */
    public Character[] getStarTrekCharacters() {
        return starTrekCharacters;
    }

    /**
     * Sets the array of star trek characters
     * @param starTrekCharacters array to set 
     */
    public void setStarTrekCharacters(Character[] starTrekCharacters) {
        this.starTrekCharacters = starTrekCharacters;
    }

    /**
     * Gets the queue of star wars winners
     * @return the queue 
     */
    public Queue getStarWarsWinners() {
        return starWarsWinners;
    }

    /**
     * Sets the queue of star wars winners
     * @param starWarsWinners queue to set 
     */
    public void setStarWarsWinners(Queue starWarsWinners) {
        this.starWarsWinners = starWarsWinners;
    }

    /**
     * Gets the queue of star trek winners
     * @return the queue
     */
    public Queue getStarTrekWinners() {
        return starTrekWinners;
    }

    /**
     * Sets the queue of star trek winners
     * @param starTrekWinners queue to set 
     */
    public void setStarTrekWinners(Queue starTrekWinners) {
        this.starTrekWinners = starTrekWinners;
    }

    /**
     * Gets the star wars high priority queue
     * @return the queue 
     */
    public Queue getStarWarsHighPriorityQueue() {
        return starWarsHighPriorityQueue;
    }

    /**
     * Sets the star wars high priority queue
     * @param starWarsHighPriorityQueue queue to set 
     */
    public void setStarWarsHighPriorityQueue(Queue starWarsHighPriorityQueue) {
        this.starWarsHighPriorityQueue = starWarsHighPriorityQueue;
    }

    /**
     * Gets the star wars medium priority queue
     * @return the queue 
     */
    public Queue getStarWarsMediumPriorityQueue() {
        return starWarsMediumPriorityQueue;
    }

    /**
     * Sets the star wars medium priority queue
     * @param starWarsMediumPriorityQueue queue to set 
     */
    public void setStarWarsMediumPriorityQueue(Queue starWarsMediumPriorityQueue) {
        this.starWarsMediumPriorityQueue = starWarsMediumPriorityQueue;
    }

    /**
     * Gets the star wars low priority queue
     * @return the queue 
     */
    public Queue getStarWarsLowPriorityQueue() {
        return starWarsLowPriorityQueue;
    }

    /**
     * Sets the star wars low priority queue
     * @param starWarsLowPriorityQueue queue to set
     */
    public void setStarWarsLowPriorityQueue(Queue starWarsLowPriorityQueue) {
        this.starWarsLowPriorityQueue = starWarsLowPriorityQueue;
    }

    /**
     * Gets the star wars reinforcement queue
     * @return the queue 
     */
    public Queue getStarWarsReinforcementQueue() {
        return starWarsReinforcementQueue;
    }

    /**
     * Sets the star wars reinforcement queue
     * @param starWarsReinforcementQueue queue to set 
     */
    public void setStarWarsReinforcementQueue(Queue starWarsReinforcementQueue) {
        this.starWarsReinforcementQueue = starWarsReinforcementQueue;
    }

    /**
     * Gets the star trek high priority queue
     * @return the queue 
     */
    public Queue getStarTrekHighPriorityQueue() {
        return starTrekHighPriorityQueue;
    }

    /**
     * Sets the star trek high priority queue
     * @param starTrekHighPriorityQueue queue to set 
     */
    public void setStarTrekHighPriorityQueue(Queue starTrekHighPriorityQueue) {
        this.starTrekHighPriorityQueue = starTrekHighPriorityQueue;
    }

    /**
     * Gets the star trek medium priority queue
     * @return the queue 
     */
    public Queue getStarTrekMediumPriorityQueue() {
        return starTrekMediumPriorityQueue;
    }

    /**
     * Sets the star trek medium priority queue
     * @param starTrekMediumPriorityQueue queue to set 
     */
    public void setStarTrekMediumPriorityQueue(Queue starTrekMediumPriorityQueue) {
        this.starTrekMediumPriorityQueue = starTrekMediumPriorityQueue;
    }

    /**
     * Gets the star trek low priority queue
     * @return the queue 
     */
    public Queue getStarTrekLowPriorityQueue() {
        return starTrekLowPriorityQueue;
    }

    /**
     * Sets the star trek low priority queue
     * @param starTrekLowPriorityQueue queue to set 
     */
    public void setStarTrekLowPriorityQueue(Queue starTrekLowPriorityQueue) {
        this.starTrekLowPriorityQueue = starTrekLowPriorityQueue;
    }

    /**
     * Gets the star trek reinforcement queue
     * @return the queue 
     */
    public Queue getStarTrekReinforcementQueue() {
        return starTrekReinforcementQueue;
    }

    /**
     * Gets the star trek reinforcement queue
     * @param starTrekReinforcementQueue queue to set 
     */
    public void setStarTrekReinforcementQueue(Queue starTrekReinforcementQueue) {
        this.starTrekReinforcementQueue = starTrekReinforcementQueue;
    }

    /**
     * Gets the current cycle number
     * @return the cycle number
     */
    public int getCycleNumber() {
        return cycleNumber;
    }

    /**
     * Sets the current cycle number
     * @param cycleNumber number to set 
     */
    public void setCycleNumber(int cycleNumber) {
        this.cycleNumber = cycleNumber;
    }

    /**
     * Gets the current fighter for star wars
     * @return the star wars fighter
     */
    public Character getStarWarsFighter() {
        return starWarsFighter;
    }

    /**
     * Sets the current fighter for star wars
     * @param starWarsFighter star wars fighter to set 
     */
    public void setStarWarsFighter(Character starWarsFighter) {
        this.starWarsFighter = starWarsFighter;
    }

    /**
     * Gets the current fighter for star trek
     * @return the star trek fighter
     */
    public Character getStarTrekFighter() {
        return starTrekFighter;
    }

    /**
     * Sets the current fighter for star trek
     * @param starTrekFighter star trek fighter to set
     */
    public void setStarTrekFighter(Character starTrekFighter) {
        this.starTrekFighter = starTrekFighter;
    }

    /**
     * Gets the current simulation speed
     * @return the current simulation speed
     */
    public double getSimSpeed() {
        return simSpeed;
    }

    /**
     * Sets the current simulation speed
     * @param simSpeed simulation speed to set 
     */
    public void setSimSpeed(double simSpeed) {
        this.simSpeed = simSpeed;
    }

    /**
     * Gets the next simulation 
     * @return the next simulation
     */
    public double getNextSim() {
        return nextSim;
    }

    /**
     * Gets the next simulation 
     * @param nextSim next simulation to set 
     */
    public void setNextSim(double nextSim) {
        this.nextSim = nextSim;
    }

    /**
     * Gets the current simulation load
     * @return the current simulation load
     */
    public double getSimLoad() {
        return simLoad;
    }

    /**
     * Sets the current simulation load
     * @param simLoad simulation load to set 
     */
    public void setSimLoad(double simLoad) {
        this.simLoad = simLoad;
    }

    /**
     * Gets the semaphore 1
     * @return the semaphore 1
     */
    public Semaphore getSemaphore1() {
        return semaphore1;
    }

    /**
     * Gets the semaphore 2
     * @return the semaphore 2
     */
    public Semaphore getSemaphore2() {
        return semaphore2;
    }

    
    
    
}
