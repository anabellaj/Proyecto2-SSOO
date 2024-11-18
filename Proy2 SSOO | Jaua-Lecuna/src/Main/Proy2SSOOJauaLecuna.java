/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import Disk.Buffer;
import Interfaces.Interface;

/**
 *
 * @author ani
 */
public class Proy2SSOOJauaLecuna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Buffer buffer = new Buffer();
       Interface main = new Interface(buffer);
       main.setLocationRelativeTo(null);
       main.setResizable(false);
       main.setVisible(true);
      
    }
    
}
