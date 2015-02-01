/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfut;

/**
 * @author Akshay
 */
public interface DfutJMenuInterface {
    
    /**
    * Refreshes the entire JMenu. 
    * @return The time in ms it took for the JMenu to refresh.
    */
    int refresh(); 
    
    /**
    * Pauses all actions of the menu for the time specified. 
    * @param time : A value in ms for the amount of time to keep the 
    *             menu paused.
    * @return A boolean value indicating the state of the Jmenu
    */
    boolean pause(int time); 
    
    /**
    * Disables the JMenu for working. To be used for debugging/necessary 
    * conditions only. 
    * @return A boolean value indicating the state of the JMenu
    */
    boolean close(); 
}
