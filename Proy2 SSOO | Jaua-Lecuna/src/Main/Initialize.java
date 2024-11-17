/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Disk.Buffer;
import Interfaces.Interface;
import System.Admin;
import System.Processor;
import Characters.Character;
import Types.FranchiseType;


/**
 * Class that initializes the simulation, it stores the main window and the buffer and also is responsible for creating the characters
 * @author ani
 */
public class Initialize {
    Interface mainWindow;
    Buffer buffer;
    
    /**
     * Class constructor
     * @param mainWindow the main GUI
     * @param buffer the buffer used to store data 
     */
    public Initialize(Interface mainWindow, Buffer buffer){
        this.mainWindow = mainWindow;
        this.buffer = buffer;
    }
    
    /**
     * Method that initializes the system and creates the characters
     */
    public void init(){
        
        createCharacters(buffer);
        Admin admin = new Admin(buffer, mainWindow, 39);
        Processor processor = new Processor(buffer, mainWindow);
        
        for (int i = 0; i < 19; i++) {
            admin.movetoQueue(buffer.getStarWarsCharacters()[i]);
            admin.movetoQueue(buffer.getStarTrekCharacters()[i]);
        }
  
        admin.updateWindow();
        processor.start();    
        admin.start(); 
    
    }
    
    
    public void createCharacters(Buffer buffer){
    
       buffer.getStarWarsCharacters()[0] = new Character("Yoda",0, FranchiseType.StarWars, "./src/StarWarsIMGs/Yoda.png");
       buffer.getStarWarsCharacters()[1] = new Character("Luke Skywalker",1, FranchiseType.StarWars, "./src/StarWarsIMGs/Luke.jpeg");
       buffer.getStarWarsCharacters()[2] = new Character("Princesa Leia",2, FranchiseType.StarWars, "./src/StarWarsIMGs/Leia.png");
       buffer.getStarWarsCharacters()[3] = new Character("Darth Vader",3, FranchiseType.StarWars, "./src/StarWarsIMGs/DarthVader.png");
       buffer.getStarWarsCharacters()[4] = new Character("Obi Wan Kenobe",4, FranchiseType.StarWars, "./src/StarWarsIMGs/ObiWan.png");
       buffer.getStarWarsCharacters()[5] = new Character("Padme",5, FranchiseType.StarWars, "./src/StarWarsIMGs/Padme.jpg");
       buffer.getStarWarsCharacters()[6] = new Character("R2D2",6, FranchiseType.StarWars, "./src/StarWarsIMGs/r2d2.png");
       buffer.getStarWarsCharacters()[7] = new Character("C3PO",7, FranchiseType.StarWars, "./src/StarWarsIMGs/3cpo.jpg");
       buffer.getStarWarsCharacters()[8] = new Character("Han Solo",8, FranchiseType.StarWars, "./src/StarWarsIMGs/HanSolo.png");
       buffer.getStarWarsCharacters()[9] = new Character("Chewbacca",9, FranchiseType.StarWars, "./src/StarWarsIMGs/Chewie.jpg");
       buffer.getStarWarsCharacters()[10] = new Character("Anakin Skywalker",10, FranchiseType.StarWars, "./src/StarWarsIMGs/Anakin.jpg");
       buffer.getStarWarsCharacters()[11] = new Character("Rey",11, FranchiseType.StarWars, "./src/StarWarsIMGs/Rey.jpg");
       buffer.getStarWarsCharacters()[12] = new Character("Kylo Ren",12, FranchiseType.StarWars, "./src/StarWarsIMGs/Kylo.jpg");
       buffer.getStarWarsCharacters()[13] = new Character("Palpatine",13, FranchiseType.StarWars, "./src/StarWarsIMGs/Palpatine.jpeg");
       buffer.getStarWarsCharacters()[14] = new Character("Darth Maul",14, FranchiseType.StarWars, "./src/StarWarsIMGs/DarthMaule.jpg");
       buffer.getStarWarsCharacters()[15] = new Character("Ahsoka",15, FranchiseType.StarWars, "./src/StarWarsIMGs/Ashoka.jpg");
       buffer.getStarWarsCharacters()[16] = new Character("BB8",16, FranchiseType.StarWars, "./src/StarWarsIMGs/BB8.jpg");
       buffer.getStarWarsCharacters()[17] = new Character("Grogu",17, FranchiseType.StarWars, "./src/StarWarsIMGs/Grogu.jpg");
       buffer.getStarWarsCharacters()[18] = new Character("Finn",18, FranchiseType.StarWars, "./src/StarWarsIMGs/Finn.jpeg");
       buffer.getStarWarsCharacters()[19] = new Character("Clone",19, FranchiseType.StarWars, "./src/StarWarsIMGs/Clone.png");
       
       
       buffer.getStarTrekCharacters()[0] = new Character("Captain James",20, FranchiseType.StarTrek, "./src/StarTrekIMGs/kirk.jpg");
       buffer.getStarTrekCharacters()[1] = new Character("Mr. Spock",21, FranchiseType.StarTrek, "./src/StarTrekIMGs/spock.png");
       buffer.getStarTrekCharacters()[2] = new Character("Bones",22, FranchiseType.StarTrek, "./src/StarTrekIMGs/bone.jpg");
       buffer.getStarTrekCharacters()[3] = new Character("Nyota Uhura",23, FranchiseType.StarTrek, "./src/StarTrekIMGs/nyota .jpg");
       buffer.getStarTrekCharacters()[4] = new Character("Scotty",24, FranchiseType.StarTrek, "./src/StarTrekIMGs/scotty.jpg");
       buffer.getStarTrekCharacters()[5] = new Character("Hikaru",25, FranchiseType.StarTrek, "./src/StarTrekIMGs/hikaru.jpeg");
       buffer.getStarTrekCharacters()[6] = new Character("Pavel",26, FranchiseType.StarTrek, "./src/StarTrekIMGs/pavel.jpg");
       buffer.getStarTrekCharacters()[7] = new Character("Commander Data",27, FranchiseType.StarTrek, "./src/StarTrekIMGs/data.jpg");
       buffer.getStarTrekCharacters()[8] = new Character("Jean-Luc Piccard",28, FranchiseType.StarTrek, "./src/StarTrekIMGs/Jean-Luc.png");
       buffer.getStarTrekCharacters()[9] = new Character("William Riker",29, FranchiseType.StarTrek, "./src/StarTrekIMGs/William T. Riker.jpg");
       buffer.getStarTrekCharacters()[10] = new Character("Geordi La Forge",30, FranchiseType.StarTrek, "./src/StarTrekIMGs/Geordi.jpeg");
       buffer.getStarTrekCharacters()[11] = new Character("Deanna Troi",31, FranchiseType.StarTrek, "./src/StarTrekIMGs/Deanna.jpeg");
       buffer.getStarTrekCharacters()[12] = new Character("Worf",32, FranchiseType.StarTrek, "./src/StarTrekIMGs/Worf.jpeg");
       buffer.getStarTrekCharacters()[13] = new Character("Dr. Beverly",33, FranchiseType.StarTrek, "./src/StarTrekIMGs/Doctor Beverly.jpeg");
       buffer.getStarTrekCharacters()[14] = new Character("Jadzia Dax",34, FranchiseType.StarTrek, "./src/StarTrekIMGs/Jadzia.jpg");
       buffer.getStarTrekCharacters()[15] = new Character("Benjamin Sisko",35, FranchiseType.StarTrek, "./src/StarTrekIMGs/Benjamin Sisko.jpg");
       buffer.getStarTrekCharacters()[16] = new Character("Kira Nerys",36, FranchiseType.StarTrek, "./src/StarTrekIMGs/Kira Nerys.jpg");
       buffer.getStarTrekCharacters()[17] = new Character("Julian Bashir",37, FranchiseType.StarTrek, "./src/StarTrekIMGs/Julian Bashir.jpeg");
       buffer.getStarTrekCharacters()[18] = new Character("Ezri Dax",38, FranchiseType.StarTrek, "./src/StarTrekIMGs/Ezri.jpeg");
       buffer.getStarTrekCharacters()[19] = new Character("Seven of Nine",39, FranchiseType.StarTrek, "./src/StarTrekIMGs/Seven of Nine.jpg");
    
    
    }
}
