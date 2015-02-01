/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfut;

import javax.swing.JMenu;

/**
 *
 * @author Akshay
 */
public class DfutJMenu extends JMenu implements DfutJMenuInterface{
    boolean paused = false; 
    boolean closed = false;
    JMenu myMenu;
    
    public void menuInput(JMenu menu){
        myMenu = menu;
    }
    
    @Override
    public int refresh() {
        return this.refresh();
    }

    @Override
    public boolean pause(int time) {
        this.pause(time);
        paused = true;
        return paused;
    }

    @Override
    public boolean close() {
        myMenu.setEnabled(false);
        closed = true;
        return closed;
    }
    
    public boolean getPausedState(){
        return paused;
    }
    
    public boolean getClosedState(){
        return closed;
    }
}
