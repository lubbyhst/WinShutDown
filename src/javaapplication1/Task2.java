/*//
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.TimerTask;
/**
 *
 * @author Falk
 */
public class Task2 extends TimerTask{
    
    int progress;
    
    public Task2(){
        progress = 0;
        
    }
    
    /**
     *
     */
    @Override
    public void run(){
        
        progress = progress + 1000;
        WinShutDownFrame.setProgress(progress);
        System.out.println(progress);
        }
    }   
