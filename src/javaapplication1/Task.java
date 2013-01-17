/*//
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.IOException;
import java.util.TimerTask;
/**
 *
 * @author Falk
 */
public class Task extends TimerTask{
    
    int todo;
    
    public Task(int x){
        todo = x;
    }
    
    /**
     *
     */
    @Override
    public void run(){
        switch (todo){
            case 1:        System.out.println("Hibernate");
            try
            {               
            Runtime.getRuntime().exec("shutdown -h");
            }
            
            catch(IOException e){
                
            }
                            
            
                break;
            case 2:        System.out.println("Wird Ausgeschaltet");
            try
            {               
            Runtime.getRuntime().exec("shutdown -s -f");
            }
            
            catch(IOException e){
                
            }
                break;}
        }
    }   



