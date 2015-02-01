/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfut;

/**
 *
 * @author Akshay
 */
public interface DfutJMenuItemInterface {
    /**
     * Renames the JMenuItem.
     * @param name New name of the JMenuItem
     * @return Boolean value of the status of the rename. True if successful. False if not.
     */
    boolean rename(String name);
    
    /**
     * Disables the JMenuItem
     * @return A boolean value indicating state of the JMenuItem. True if disabled. False if enabled.
     */
    boolean close();
    
    /**
     * Enables the JMenuItem
     * @return A boolean value indicating state of the JMenuItem. True if enabled. False if disabled.
     */
    boolean open();
    
    /**
     * Pauses the operations of the JMenuItem for the time specified
     * @param time An integer in ms for the amount of time to pause the JMenuItem
     * @return A boolean value indicating the state of the JMenuItem. True if paused. False if unpaused.
     */
    boolean pause(int time);
    
    /**
     * Removes the JMenuItem permanently
     * @return Name of the removed JMenuItem.
     */
    String remove();
    
}
